package com.codestates.danbi.comment.mapper;

import com.codestates.danbi.board.dto.BoardResponseDto;
import com.codestates.danbi.board.entity.Board;
import com.codestates.danbi.comment.dto.CommentPatchDto;
import com.codestates.danbi.comment.dto.CommentPostDto;
import com.codestates.danbi.comment.dto.CommentResponseDto;
import com.codestates.danbi.comment.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    Comment CommentPostDtoToComment(CommentPostDto commentPostDto);

    Comment CommentPatchDtoToComment(CommentPatchDto commentPatchDto);

    CommentResponseDto commentToCommentResponseDto(Comment comment);





}
