package com.example.dalian.pojo;

/**
 * Created by 张齐 on 2020/2/26 11:16
 */
public class JingDian {
    private int id;
    private String name;
    private String  jianjie;
    private String  image;

    public JingDian(int id, String name, String jianjie, String image) {
        this.id = id;
        this.name = name;
        this.jianjie = jianjie;
        this.image = image;
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

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
