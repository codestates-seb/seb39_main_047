package com.codestates.danbi.board.dto;

import com.codestates.danbi.comment.dto.CommentResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class BoardCommentResponseDto {

    private Long boardId;

    private String title;

    private String content;

    private int view;

    private List<CommentResponseDto> comments;
}
