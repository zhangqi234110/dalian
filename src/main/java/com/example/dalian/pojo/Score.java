package com.example.dalian.pojo;

/**
 * Created by 张齐 on 2020/3/3 10:46
 */
public class Score {
    private int id;
    private String name;
    private int score;


    public Score() {
    }

    public Score(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
