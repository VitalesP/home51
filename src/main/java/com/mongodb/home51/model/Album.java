package com.mongodb.home51.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
public class Album {
    @Id
    private String id;

    private String name;

    @DBRef
    private List<Artist> artists = new ArrayList<>();

    @DBRef
    private List<Composition> compositions = new ArrayList<>();

}
