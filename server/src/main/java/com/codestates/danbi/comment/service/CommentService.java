package com.codestates.danbi.comment.service;

import com.codestates.danbi.board.entity.Board;
import com.codestates.danbi.board.repository.BoardRepository;
import com.codestates.danbi.comment.entity.Comment;
import com.codestates.danbi.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;


    public Comment createComment(Long boardId, Comment comment) {
        comment.setBoard(findBoard(boardId));

        return commentRepository.save(comment);

    }

    public Comment updateComment(Comment comment) {

        Comment findComment = findComment(comment.getCommentId());
        Optional.ofNullable(comment.getContent()).ifPresent(findComment::setContent);

        return commentRepository.save(comment);
    }

    public void deleteComment(Long commentId) {

        Comment comment = findComment(commentId);


        commentRepository.deleteById(commentId);
    }


    private Board findBoard(Long boardId) {

        Optional<Board> boards = boardRepository.findById(boardId);
        Board findBoard = boards.orElseThrow();

        return findBoard;
    }


    private Comment findComment(Long commentId) {

        Optional<Comment> reply = commentRepository.findById(commentId);
        Comment findComment = reply.orElseThrow();

        return findComment;
    }
}
