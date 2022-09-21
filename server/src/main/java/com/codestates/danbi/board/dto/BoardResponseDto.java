package com.codestates.danbi.board.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class BoardResponseDto{

    private Long boardId;
    private String title;
    private String content;
    private int view;


/*
    private String username; 멤버 기능 구현 후 추가 예정

    private List<> comment; 댓글 기능 구현 후 추가 예정
    */
}