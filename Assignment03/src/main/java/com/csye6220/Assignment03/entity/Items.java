package com.csye6220.Assignment03.entity;

public class Items {
    private String id;
    private String describe;
    private float price;
    private boolean choose;

    public Items(String id, String describe, float price, boolean choose) {
        this.id = id;
        this.describe = describe;
        this.price = price;
        this.choose = choose;
    }

    public boolean isChoose() {
        return choose;
    }

    public void setChoose(boolean choose) {
        this.choose = choose;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
