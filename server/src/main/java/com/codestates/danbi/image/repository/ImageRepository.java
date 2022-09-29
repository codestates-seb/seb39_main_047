package com.codestates.danbi.image.repository;

import com.codestates.danbi.image.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
