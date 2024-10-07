package com.example.exercicio10.dto;

public class GameDto {
    private String name;
    private String genre;
    private String author;
    private String platform;
    private int year;

    public GameDto(String name, String genre, String author, String platform, int year) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.platform = platform;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
