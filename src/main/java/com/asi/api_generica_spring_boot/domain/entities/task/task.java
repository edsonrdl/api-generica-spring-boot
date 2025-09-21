package com.asi.api_generica_spring_boot.domain.entities.task;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@Table(name = "\"TAB_TASK\"")
public class task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="\"ID_TASK\"")
    private Long idTask;

    @Column(name="\"TITLE_TASK\"")
    private String titleTask;

    @Column(name="\"DESCRIPTION\"")
    private String description;

    @Column(name="\"DATE_CREATE\"")
    private LocalDate dateCreate;

    @Column(name="\"STATUS\"")
    private String status;
}
