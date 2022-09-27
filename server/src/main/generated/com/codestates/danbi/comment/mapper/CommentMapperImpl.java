package com.codestates.danbi.comment.mapper;

import com.codestates.danbi.comment.dto.CommentPatchDto;
import com.codestates.danbi.comment.dto.CommentPostDto;
import com.codestates.danbi.comment.dto.CommentResponseDto;
import com.codestates.danbi.comment.entity.Comment;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-27T17:27:41+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.15.1 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public Comment CommentPostDtoToComment(CommentPostDto commentPostDto) {
        if ( commentPostDto == null ) {
            return null;
        }

        Comment.CommentBuilder comment = Comment.builder();

        comment.content( commentPostDto.getContent() );

        return comment.build();
    }

    @Override
    public Comment CommentPatchDtoToComment(CommentPatchDto commentPatchDto) {
        if ( commentPatchDto == null ) {
            return null;
        }

        Comment.CommentBuilder comment = Comment.builder();

        comment.content( commentPatchDto.getContent() );

        return comment.build();
    }

    @Override
    public CommentResponseDto commentToCommentResponseDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentResponseDto commentResponseDto = new CommentResponseDto();

        commentResponseDto.setCommentId( comment.getCommentId() );
        commentResponseDto.setContent( comment.getContent() );

        return commentResponseDto;
    }
}
