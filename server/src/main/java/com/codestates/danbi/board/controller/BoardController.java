package com.codestates.danbi.board.controller;

import com.codestates.danbi.board.dto.BoardPostDto;
import com.codestates.danbi.board.dto.BoardResponseDto;
import com.codestates.danbi.board.entity.Board;
import com.codestates.danbi.board.mapper.BoardMapper;
import com.codestates.danbi.board.service.BoardService;
import com.codestates.danbi.dto.SingleResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/v1/boards")
public class BoardController {

    private BoardService boardService;
    private BoardMapper mapper;

    public BoardController(BoardService boardService, BoardMapper mapper) {
        this.boardService = boardService;
        this.mapper = mapper;
    }

    @PostMapping("/create")
    public ResponseEntity postBoard(@Valid @RequestBody BoardPostDto boardPostDto) {

        Board board = mapper.boardPostDtoToBoard(boardPostDto);

        Board createdBoard = boardService.createBoard(board);

        BoardResponseDto response = mapper.boardToBoardResponseDto(createdBoard);

        // 유저 추가되면 author 추가 예정

        return new ResponseEntity<>(new SingleResponseDto<>(response), HttpStatus.CREATED);
    }

    @GetMapping("/{board-id}")
    public ResponseEntity getBoard(@PathVariable("board-id") Long boardId) {
        Board board = boardService.findBoard(boardId);
        boardService.updateView(boardId);


        return new ResponseEntity<>(new SingleResponseDto<>(mapper.boardToBoardResponseDto(board)), HttpStatus.OK);
    }


    @PatchMapping("/{board-id}")
    public ResponseEntity patchBoard(@PathVariable("board-id") @Positive Long boardId, @Valid @RequestBody BoardPostDto board) {
        return null;
    }

    @GetMapping
    public ResponseEntity findBoards() {
        return null;
    }

    @DeleteMapping("/{board-Id}")
    private ResponseEntity deleteBoard() {
        return null;
    }
}
