package com.codestates.danbi.board.service;

import com.codestates.danbi.board.entity.Board;
import com.codestates.danbi.board.repository.BoardRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    @Transactional
    public Board updateBoard(Board board) {

        Board findBoard = findVerifiedBoard(board.getBoardId());

        Optional.ofNullable(board.getTitle()).ifPresent(title -> findBoard.setTitle(title));
        Optional.ofNullable(board.getContent()).ifPresent(content -> findBoard.setContent(content));

        return boardRepository.save(findBoard);

    }

    public Board findBoard(Long boardId) {

        return findVerifiedBoard(boardId);
    }

    public Page<Board> findBoards(int page, int size) {

        return boardRepository.findAll(PageRequest.of(page, size, Sort.by("boardId").descending()));
    }

    public Page<Board> searchBoards(String keyword, int page, int size) {

        return boardRepository.findByTitleContaining(keyword, PageRequest.of(page, size,Sort.by("boardId").descending()));
    }

    public void deleteBoard(Long boardId) {
        Board findBoard = findVerifiedBoard(boardId);

        boardRepository.delete(findBoard);

    }

    private Board findVerifiedBoard(Long boardId) {
        Optional<Board> optionalBoard = boardRepository.findById(boardId);
        Board findBoard = optionalBoard.orElseThrow(() -> new RuntimeException("BoardId not exist"));

        return findBoard;
    }

    @Transactional
    public int updateView(Long id) {
        return boardRepository.updateView(id);
    }
}
