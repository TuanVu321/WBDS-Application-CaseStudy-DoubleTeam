package com.codegym.education.model;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nameLesson;
    @Column(nullable = false)
    private String titleLess;
    @Column(nullable = false)
    private String contentLesson;
    @Column(nullable = false)
    private String imgLesson;
    @Column(nullable = false)
    private String videoLesson;

    public Lesson() {
    }
}
