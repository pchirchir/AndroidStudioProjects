package com.example.recycler;

import java.io.Serializable;

public class Model implements Serializable {
    String title, image, description;

    public Model() {
    }

    public Model(String title, String image, String description) {
        this.title = title;
        this.image = image;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }


    public String getImage() {
        return image;
    }


    public String getDescription() {
        return description;
    }

}
