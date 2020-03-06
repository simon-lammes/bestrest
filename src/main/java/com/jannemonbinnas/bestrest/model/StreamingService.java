package com.jannemonbinnas.bestrest.model;

import com.jannemonbinnas.bestrest.model.Series;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class StreamingService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @Column(length = 64)
    @Size(min = 1, max = 64)
    @NotNull
    private String name = "";

    @OneToMany(mappedBy = "streamingService", cascade = CascadeType.REMOVE)
    private List<Series> series = new ArrayList<>();
}
