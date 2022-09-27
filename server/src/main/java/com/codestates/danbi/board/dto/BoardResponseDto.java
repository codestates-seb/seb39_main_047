package com.codestates.danbi.board.dto;

import com.codestates.danbi.baseEntity.BaseEntity;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Builder
@Getter
public class BoardResponseDto {

    private Long boardId;
    private String title;
    private String content;
    private int view;

    private Date createdDate;
    private Date lastModifiedDate;

    /*
        private String username; 멤버 기능 구현 후 추가 예정
    */


}