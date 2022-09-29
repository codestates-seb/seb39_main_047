package com.codestates.danbi.comment.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class CommentPostDto {

    @NotBlank(message = "content is missing")
    private String content;
}
