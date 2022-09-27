package com.codestates.danbi.board.mapper;

import com.codestates.danbi.board.dto.BoardCommentResponseDto;
import com.codestates.danbi.board.dto.BoardPatchDto;
import com.codestates.danbi.board.dto.BoardPostDto;
import com.codestates.danbi.board.dto.BoardResponseDto;
import com.codestates.danbi.board.entity.Board;
import com.codestates.danbi.comment.dto.CommentResponseDto;
import com.codestates.danbi.comment.entity.Comment;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-27T18:02:30+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.15.1 (Oracle Corporation)"
)
@Component
public class BoardMapperImpl implements BoardMapper {

    @Override
    public Board boardPostDtoToBoard(BoardPostDto boardPostDto) {
        if ( boardPostDto == null ) {
            return null;
        }

        Board board = new Board();

        board.setTitle( boardPostDto.getTitle() );
        board.setContent( boardPostDto.getContent() );

        return board;
    }

    @Override
    public Board boardPatchToBoard(BoardPatchDto boardPatchDto) {
        if ( boardPatchDto == null ) {
            return null;
        }

        Board board = new Board();

        board.setBoardId( boardPatchDto.getBoardId() );
        board.setTitle( boardPatchDto.getTitle() );
        board.setContent( boardPatchDto.getContent() );

        return board;
    }

    @Override
    public BoardResponseDto boardToBoardResponseDto(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardResponseDto.BoardResponseDtoBuilder boardResponseDto = BoardResponseDto.builder();

        boardResponseDto.boardId( board.getBoardId() );
        boardResponseDto.title( board.getTitle() );
        boardResponseDto.content( board.getContent() );
        boardResponseDto.view( board.getView() );
        if ( board.getCreatedDate() != null ) {
            boardResponseDto.createdDate( Date.from( board.getCreatedDate().toInstant( ZoneOffset.UTC ) ) );
        }
        if ( board.getLastModifiedDate() != null ) {
            boardResponseDto.lastModifiedDate( Date.from( board.getLastModifiedDate().toInstant( ZoneOffset.UTC ) ) );
        }

        return boardResponseDto.build();
    }

    @Override
    public List<BoardResponseDto> boardsToBoardResponses(List<Board> boards) {
        if ( boards == null ) {
            return null;
        }

        List<BoardResponseDto> list = new ArrayList<BoardResponseDto>( boards.size() );
        for ( Board board : boards ) {
            list.add( boardToBoardResponseDto( board ) );
        }

        return list;
    }

    @Override
    public BoardCommentResponseDto boardToCommentResponse(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardCommentResponseDto.BoardCommentResponseDtoBuilder boardCommentResponseDto = BoardCommentResponseDto.builder();

        boardCommentResponseDto.boardId( board.getBoardId() );
        boardCommentResponseDto.title( board.getTitle() );
        boardCommentResponseDto.content( board.getContent() );
        boardCommentResponseDto.view( board.getView() );
        boardCommentResponseDto.comments( commentListToCommentResponseDtoList( board.getComments() ) );

        return boardCommentResponseDto.build();
    }

    protected CommentResponseDto commentToCommentResponseDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentResponseDto commentResponseDto = new CommentResponseDto();

        commentResponseDto.setCommentId( comment.getCommentId() );
        commentResponseDto.setContent( comment.getContent() );

        return commentResponseDto;
    }

    protected List<CommentResponseDto> commentListToCommentResponseDtoList(List<Comment> list) {
        if ( list == null ) {
            return null;
        }

        List<CommentResponseDto> list1 = new ArrayList<CommentResponseDto>( list.size() );
        for ( Comment comment : list ) {
            list1.add( commentToCommentResponseDto( comment ) );
        }

        return list1;
    }
}
