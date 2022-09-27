package com.codestates.danbi.comment.entity;

import com.codestates.danbi.baseEntity.BaseEntity;
import com.codestates.danbi.board.entity.Board;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue
    private Long commentId;

    private String content;

    @ManyToOne
    @JoinColumn(name = "boardId")
    private Board board;

}
