package com.example.clonekufar.repositories;

import com.example.clonekufar.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
