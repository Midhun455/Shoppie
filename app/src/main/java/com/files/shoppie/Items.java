package com.files.shoppie;

public class Items {
    int image;
    String name;
    String price;
    String count;

    public Items(int image, String name, String price, String count) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}

