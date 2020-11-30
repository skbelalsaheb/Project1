package com.project1.demo.Models;

import com.sun.istack.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Movies {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String movieName;
    @NotNull
    private String writerName;
    @NotNull
    private float price;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", writerName='" + writerName + '\'' +
                ", price=" + price +
                '}';
    }
}
