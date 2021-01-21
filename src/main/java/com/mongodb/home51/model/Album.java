package com.mongodb.home51.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
public class Album {
    @Id
    private String id;
    @Indexed
    private String name;

    @Indexed
    private Integer yearAlbum;

    @DBRef
    private List<Artist> artists = new ArrayList<>();

    @DBRef
    private List<Composition> compositions = new ArrayList<>();

}
