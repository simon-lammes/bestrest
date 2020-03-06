package com.jannemonbinnas.bestrest.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Series {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @Column(length = 20)
    @Size(min = 1, max = 20)
    @NotNull
    private String imdbId = "";

    @Column(length = 64)
    @Size(min = 1, max = 64)
    @NotNull
    private String name = "";

    @NotNull
    private int year_from;

    @NotNull
    private int year_to;

    @Column(length = 20)
    @Size(min = 1, max = 20)
    @NotNull
    private String country = "";

    @NotNull
    private boolean in_production;

    @NotNull
    private int maxSeasons;

    @NotNull
    @Lob
    private String description;

    @ManyToOne
    StreamingService streamingService;

    @OneToMany(mappedBy = "series", cascade = {CascadeType.REMOVE})
    List<Episode> episodes = new ArrayList<>();
}
