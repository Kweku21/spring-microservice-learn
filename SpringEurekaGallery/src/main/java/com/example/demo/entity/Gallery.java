package com.example.demo.entity;

import java.util.List;

public class Gallery {

    private int id;
    List<Object> images;


    public void setId(int id) {
        this.id = id;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public List<Object> getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "id=" + id +
                ", images=" + images +
                '}';
    }
}
