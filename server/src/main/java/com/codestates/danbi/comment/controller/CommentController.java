package com.codestates.danbi.comment.controller;

import com.codestates.danbi.comment.dto.CommentPatchDto;
import com.codestates.danbi.comment.dto.CommentPostDto;
import com.codestates.danbi.comment.dto.CommentResponseDto;
import com.codestates.danbi.comment.entity.Comment;
import com.codestates.danbi.comment.mapper.CommentMapper;
import com.codestates.danbi.comment.service.CommentService;
import com.codestates.danbi.dto.SingleResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/v1/comments")
@RestController
@Validated
public class CommentController {

    private final CommentMapper mapper;
    private final CommentService commentService;

    @PostMapping("/{boardId}")
    public ResponseEntity createComment(@PathVariable("boardId") Long boardId,
                                        @RequestBody CommentPostDto commentPost) {

        Comment comment = mapper.CommentPostDtoToComment(commentPost);

        commentService.createComment(boardId, comment);


        return new ResponseEntity<>(new SingleResponseDto<>(mapper.commentToCommentResponseDto(comment)), HttpStatus.CREATED);
    }

    @PatchMapping("/{commentId}")
    public ResponseEntity updateComment(@PathVariable("commentId") Long commentId,
                                        @RequestBody CommentPatchDto commentPatchDto) {

        Comment comment = mapper.CommentPatchDtoToComment(commentPatchDto);

        comment.setCommentId(commentId);


        CommentResponseDto response = mapper.commentToCommentResponseDto(commentService.updateComment(comment));


        return new ResponseEntity<>(new SingleResponseDto<>(response), HttpStatus.OK);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity deleteComment(@PathVariable("commentId") Long commentId) {

        commentService.deleteComment(commentId);

        return new ResponseEntity<>("댓글이 삭제되었습니다.",HttpStatus.NO_CONTENT);
    }
}
