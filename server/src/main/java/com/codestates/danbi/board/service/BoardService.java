package com.codestates.danbi.board.service;

import com.codestates.danbi.board.entity.Board;
import com.codestates.danbi.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional()
@Service
public class BoardService {

    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Board createBoard(Board board) {

        return boardRepository.save(board);
    }

    public Board findBoard(Long boardId) {

        return findVerifiedBoard(boardId);
    }

    private Board findVerifiedBoard(Long boardId) {
        Optional<Board> optionalBoard = boardRepository.findById(boardId);
        Board findBoard = optionalBoard.orElseThrow(() -> new RuntimeException("BoardId not exist"));

        return findBoard;
    }
}
