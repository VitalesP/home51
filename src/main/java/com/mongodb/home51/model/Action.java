package com.mongodb.home51.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Action {
    @Id
    private String id;
    @Indexed


    private LocalDate localDate;

    @DBRef
    private List<Album> albums = new ArrayList<>();


    @DBRef
    private List<Artist> artists = new ArrayList<>();

    @DBRef
    private List<Composition> compositions = new ArrayList<>();

}
