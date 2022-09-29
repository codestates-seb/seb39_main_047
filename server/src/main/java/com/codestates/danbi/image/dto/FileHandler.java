package com.codestates.danbi.image.dto;

import com.codestates.danbi.image.entity.Image;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileHandler {


    public List<Image> parseFileInfo(List<MultipartFile> multipartFiles) throws IOException {
        List<Image> fileList = new ArrayList<>();

        if (!CollectionUtils.isEmpty(multipartFiles)) {
            // 파일명을 업로드 한 날짜로 변환하여 저장
            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            String current_data = now.format(dateTimeFormatter);

            // 프로젝트 디렉터리 내의 저장을 위한 절대 경로 설정
            // 경로 구분자 File.separator 사용
            String absolutePath = new File("").getAbsoluteFile() + File.separator + File.separator;

            // 파일을 저장할 세부 경로 지정
            String path = "images" + File.separator + current_data;
            File file = new File(path);

            // 디렉터리가 존재하지 않을 경우
            if (!file.exists()) {
                boolean wasSuccessful = file.mkdirs();
                // 디렉터리 생성에 실패했을 경우
                if (!wasSuccessful) System.out.println("file : was not successful");
            }

            //다중 파일 처리
            for (MultipartFile multipartFile : multipartFiles) {

                // 파일의 확장자 추출
                String originalFileExtension;
                String contentType = multipartFile.getContentType();

                // 확장자명이 존재하지 않을 경우 처리 X
                if (ObjectUtils.isEmpty(contentType)) {
                    break;
                }
                else { // 확장자가 jpeg, png 인 파일들만 받아서 처리
                    if(contentType.contains("image/jpeg")) originalFileExtension = ".jpg";
                    else if(contentType.contains("image/png")) originalFileExtension = ".png";
                    else break;
                }

                String new_file_name = System.nanoTime() + originalFileExtension;

                ImageDto imageDto = ImageDto.builder()
                        .origImageName(multipartFile.getOriginalFilename())
                        .imagePath(path + File.separator + new_file_name)
                        .imageSize(multipartFile.getSize())
                        .build();

                Image image = new Image(
                        imageDto.getOrigImageName(),
                        imageDto.getImagePath(),
                        imageDto.getImageSize()
                );

                fileList.add(image);

                file = new File(absolutePath + path + File.separator + new_file_name);
                multipartFile.transferTo(file);

                file.setWritable(true);
                file.setReadable(true);

            }
        }
        return fileList;
    }

}
