package com.example.WebApplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    private Long id;
    private String name;
    private String originalFileName;


}
