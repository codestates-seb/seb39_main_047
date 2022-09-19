package com.codestates.danbi.board.controller;

import com.codestates.danbi.board.dto.BoardPostDto;
import com.codestates.danbi.board.dto.BoardResponseDto;
import com.codestates.danbi.board.entity.Board;
import com.codestates.danbi.board.mapper.BoardMapper;
import com.codestates.danbi.board.service.BoardService;
import com.codestates.danbi.dto.MultiResponseDto;
import com.codestates.danbi.dto.SingleResponseDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@ApiOperation(value = "게시판 API", tags = {"Board Controller"})
@RestController
@RequestMapping("/v1/boards")
public class BoardController {

    private BoardService boardService;
    private BoardMapper mapper;

    public BoardController(BoardService boardService, BoardMapper mapper) {
        this.boardService = boardService;
        this.mapper = mapper;
    }


    @ApiOperation(value = "게시글 등록", notes = "게시글을 등록합니다.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "게시글 등록 완료"),
            @ApiResponse(code = 404, message = "Board not found")
    })
    @PostMapping("/create")
    public ResponseEntity postBoard(@Valid @RequestBody BoardPostDto boardPostDto) {

        Board board = mapper.boardPostDtoToBoard(boardPostDto);

        Board createdBoard = boardService.createBoard(board);

        BoardResponseDto response = mapper.boardToBoardResponseDto(createdBoard);

        // 유저 추가되면 author 추가 예정

        return new ResponseEntity<>(new SingleResponseDto<>(response), HttpStatus.CREATED);
    }


    @ApiOperation(value = "게시글 조회", notes = "게시글 식별자(boardId)에 해당하는 게시글을 조회합니다.")
    @GetMapping("/{board-id}")
    public ResponseEntity getBoard(@PathVariable("board-id") Long boardId) {
        Board board = boardService.findBoard(boardId);
        boardService.updateView(boardId);


        return new ResponseEntity<>(new SingleResponseDto<>(mapper.boardToBoardResponseDto(board)), HttpStatus.OK);
    }


    @ApiOperation(value = "게시글 수정", notes = "게시글 식별자(boardId)에 해당하는 게시글을 수정합니다.")
    @PatchMapping("/{board-id}")
    public ResponseEntity patchBoard(@PathVariable("board-id") @Positive Long boardId, @Valid @RequestBody BoardPostDto board) {
        return null;
    }

    @ApiOperation(value = "게시글 전체 조회", notes = "page와 size에 맞게 게시글을 조회합니다.")
    @GetMapping
    public ResponseEntity findBoards(@RequestParam @Positive int page,
                                     @RequestParam @Positive int size) {

        Page<Board> boardPage = boardService.findBoards(page - 1, size);

        List<Board> boards = boardPage.getContent();

        List<BoardResponseDto> responses = mapper.boardsToBoardResponses(boards);

        return new ResponseEntity<>(new MultiResponseDto<>(responses,boardPage), HttpStatus.OK);
    }


    @ApiOperation(value = "게시글 검색", notes = "page와 size에 맞게 검색어(keyword)에 해당하는 게시글을 검색합니다.")
    @GetMapping("/search")
    public ResponseEntity searchBoard(@RequestParam String keyword, @RequestParam @Positive int page,
                                      @RequestParam int size) {
        Page<Board> boardPage = boardService.searchBoards(keyword, page-1, size);

        List<Board> boards = boardPage.getContent();

        List<BoardResponseDto> responses = mapper.boardsToBoardResponses(boards);

        return new ResponseEntity<>(new MultiResponseDto<>(responses,boardPage),HttpStatus.OK);
    }


    @ApiOperation(value = "게시글 삭제", notes = "게시글 식별자(boardId)에 해당하는 게시글을 삭제합니다.")
    @DeleteMapping("/{board-Id}")
    private ResponseEntity deleteBoard() {
        return null;
    }
}
