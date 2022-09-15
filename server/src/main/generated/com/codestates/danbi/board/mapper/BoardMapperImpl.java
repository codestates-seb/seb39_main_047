package com.codestates.danbi.board.mapper;

import com.codestates.danbi.board.dto.BoardPostDto;
import com.codestates.danbi.board.dto.BoardResponseDto;
import com.codestates.danbi.board.entity.Board;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-15T20:27:00+0900",
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
    public BoardResponseDto boardToBoardResponseDto(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardResponseDto.BoardResponseDtoBuilder boardResponseDto = BoardResponseDto.builder();

        boardResponseDto.boardId( board.getBoardId() );
        boardResponseDto.title( board.getTitle() );
        boardResponseDto.content( board.getContent() );
        boardResponseDto.view( board.getView() );

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
}
