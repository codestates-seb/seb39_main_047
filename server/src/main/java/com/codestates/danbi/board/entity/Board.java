package com.codestates.danbi.board.entity;


import com.codestates.danbi.baseEntity.BaseEntity;
import com.codestates.danbi.comment.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(columnDefinition = "integer default 0", nullable = false)
    private int view;

    @OneToMany(mappedBy = "board",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private List<Comment> comments = new ArrayList<>();

    /*
    @Column(columnDefinition = "integer default 0", nullable = false)
    private int like;



    @JoinColumn(name : "memberId")
    @ManyToOne
    private Member author;

 */



}
