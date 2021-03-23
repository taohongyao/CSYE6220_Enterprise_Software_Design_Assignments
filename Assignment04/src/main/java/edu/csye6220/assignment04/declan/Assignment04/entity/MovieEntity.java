package edu.csye6220.assignment04.declan.Assignment04.entity;

import java.util.UUID;

public class MovieEntity {
    private String id;
    private String title;
    private String actor;
    private String actress;
    private String genre;
    private int year;

    public MovieEntity() {
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
