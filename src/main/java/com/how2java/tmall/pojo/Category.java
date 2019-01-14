package com.how2java.tmall.pojo;

/**
 * @author tyc
 * @date 2018/11/21
 */
public class Category {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
