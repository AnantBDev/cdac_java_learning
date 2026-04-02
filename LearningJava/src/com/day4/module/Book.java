package com.day4.module;

public class Book {
    private int regno;
    private String title;
    private String author;

    public Book(int regno, String title, String author) {
        this.regno = regno;
        this.title = title;
        this.author = author;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
