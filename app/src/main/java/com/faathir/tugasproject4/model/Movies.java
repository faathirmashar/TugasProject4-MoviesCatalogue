package com.faathir.tugasproject4.model;

import java.util.List;

public class Movies {
    private String imgUrl;
    private String title;
    private String detail;
    private String genre;
    private String time;
    private String director;
    private String year;
    private List<CastAndCrew> castAndCrews;

    public Movies(String imgUrl, String title, String detail, String genre, String time, String director, String year, List<CastAndCrew> castAndCrews) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.detail = detail;
        this.genre = genre;
        this.time = time;
        this.director = director;
        this.year = year;
        this.castAndCrews = castAndCrews;
    }

    public List<CastAndCrew> getCastAndCrews() {
        return castAndCrews;
    }

    public String getDetail() {
        return detail;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getTime() {
        return time;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }
}
