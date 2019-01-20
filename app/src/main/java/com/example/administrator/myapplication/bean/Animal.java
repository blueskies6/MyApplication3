package com.example.administrator.myapplication.bean;

/**
 * Created by Administrator on 2019/1/20 0020.
 */

public class Animal {
    private int image;
    private String title;

    public int getImage() {
        return image;
    }

    public Animal(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
