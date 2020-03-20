package com.example.dalian.pojo;

import java.io.Serializable;

/**
 * Created by 张齐 on 2020/3/20 15:01
 */
public class Hot implements Serializable {

    private static final long serialVersionUID = -7668898270244276770L;

    private int id;

    private String name;

    private int hot;

    public Hot() {
    }

    public Hot(int id, String name, int hot) {
        this.id = id;
        this.name = name;
        this.hot = hot;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }
}
