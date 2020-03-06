package com.jannemonbinnas.bestrest.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id = 0L;

    @ManyToOne
    private Series series = null;

    @Min(value = 1)
    private int season = 0;

    @Min(value = 1)
    private int number = 0;

    @Column(length = 20, unique = true)
    @Size(max = 20)
    private String imdbId = "";

    @Column(length = 64)
    @Size(min = 1, max = 64)
    @NotNull()
    private String name = "";


}
