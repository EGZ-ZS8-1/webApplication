package com.example.WebApplication.repositiries;

import com.example.WebApplication.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image , Long> {

}
