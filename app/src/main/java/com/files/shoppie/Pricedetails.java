package com.files.shoppie;

public class Pricedetails {
    String rate;
    String offer;
    String kg;
    String price;

    public Pricedetails(String rate, String offer, String kg, String price) {
        this.rate = rate;
        this.offer = offer;
        this.kg = kg;
        this.price = price;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
