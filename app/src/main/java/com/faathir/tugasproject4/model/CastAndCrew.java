package com.faathir.tugasproject4.model;

public class CastAndCrew {
    String imageUrl;
    String name;

    public CastAndCrew(String imageUrl, String name) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }
}
