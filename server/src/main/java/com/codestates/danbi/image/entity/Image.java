package com.codestates.danbi.image.entity;

import com.codestates.danbi.baseEntity.BaseEntity;
import com.codestates.danbi.board.entity.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "file")
public class Image extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "imageId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "boardId")
    private Board board;

    @Column(nullable = false)
    private String origImageName;

    @Column(nullable = false)
    private String imagePath;

    private Long imageSize;

    @Builder
    public Image(String origImageName, String imagePath, Long imageSize) {
        this.origImageName = origImageName;
        this.imagePath = imagePath;
        this.imageSize = imageSize;
    }

    public void setBoard(Board board) {
        this.board = board;

        if(!board.getImages().contains(this))
            board.getImages().add(this);

    }

}
