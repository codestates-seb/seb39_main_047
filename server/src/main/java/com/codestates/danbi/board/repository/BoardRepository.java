package com.codestates.danbi.board.repository;

import com.codestates.danbi.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board, Long> {
    @Modifying
    @Query("update Board p set p.view = p.view + 1 where p.boardId = :boardId")
    int updateView(@Param("boardId") Long boardId);

    Page<Board> findByTitleContaining(String keyword, Pageable pageable);



}
