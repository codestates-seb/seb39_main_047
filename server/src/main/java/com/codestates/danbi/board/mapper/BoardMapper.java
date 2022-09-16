package com.codestates.danbi.board.mapper;

import com.codestates.danbi.board.dto.BoardPostDto;
import com.codestates.danbi.board.dto.BoardResponseDto;
import com.codestates.danbi.board.entity.Board;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardMapper {

    Board boardPostDtoToBoard(BoardPostDto boardPostDto);
    BoardResponseDto boardToBoardResponseDto(Board board);

}
