package com.example.dz6a1;

public class Model {
    private String number;
    private String author;
    private String song;
    private int time;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Model(String number, String author, String song, double time) {
        this.number = number;
        this.author = author;
        this.song = song;
        this.time = (int) time;
    }
}
