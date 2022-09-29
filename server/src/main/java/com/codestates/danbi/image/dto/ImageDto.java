package com.codestates.danbi.image.dto;

import com.codestates.danbi.image.entity.Image;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class ImageDto {

    private Long id;
    private String origImageName;
    private String imagePath;
    private Long imageSize;




}

