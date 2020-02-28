package com.example.dalian.pojo;

/**
 * Created by 张齐 on 2020/2/20 9:16
 */
public class College {

    private int id;
    private String name;
    private String image;
    private String content;


    public College(int id, String name, String image, String content) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
