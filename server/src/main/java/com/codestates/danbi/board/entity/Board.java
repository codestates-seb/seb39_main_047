package com.codestates.danbi.board.entity;

import com.codestates.danbi.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

/*    @Column
    private int view;*/
/*
    @JoinColumn(name : "memberId")
    @ManyToOne
    private Member author;

    @OneToMany(mappedBy="Board", fetch = LAZY, cascade = CascadeType.REMOVE)
    private List<Comment> comments = new ArrayList<>();
*/

}
