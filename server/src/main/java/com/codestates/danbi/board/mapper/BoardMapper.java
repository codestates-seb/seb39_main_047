package com.codestates.danbi.board.mapper;

import com.codestates.danbi.board.dto.BoardPatchDto;
import com.codestates.danbi.board.dto.BoardPostDto;
import com.codestates.danbi.board.dto.BoardResponseDto;
import com.codestates.danbi.board.entity.Board;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BoardMapper {

    Board boardPostDtoToBoard(BoardPostDto boardPostDto);
    Board boardPatchToBoard(BoardPatchDto boardPatchDto);
    BoardResponseDto boardToBoardResponseDto(Board board);
    List<BoardResponseDto> boardsToBoardResponses(List<Board> boards);

}
