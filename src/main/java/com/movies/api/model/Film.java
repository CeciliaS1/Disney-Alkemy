package com.movies.api.model;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "films")
public class Film implements Serializable {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany()
    private List <Character> characters;

    @ManyToOne
    private Genre genre;

    private String image;

    private String title;

    private  Integer creationDate;

    private Integer score;

    private Character relatedCharacter;



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Character getRelatedCharacter() {
        return relatedCharacter;
    }

    public void setRelatedCharacter(Character relatedCharacter) {
        this.relatedCharacter = relatedCharacter;
    }


}
