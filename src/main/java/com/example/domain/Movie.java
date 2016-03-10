package com.example.domain;

/**
 * Created by caneraydin on 10.03.2016.
 */

import javax.persistence.*;

@Entity
@Table(name = "Movies")

public class Movie {

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getTitle() {

        return title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private Long id;

    public void setTitle(String title) {
        this.title = title;
    }

    private String  title,actors;

    public Movie(){}

    public Movie(String title, String actors){
        this.actors = actors;
        this.title = title;
    }

}