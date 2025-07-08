package com.example.deno6;

public abstract class Book {
    protected String title;
    protected String isbn;
    protected double price;
    protected int publishYear;
    public Book(String title, String isbn, int publishYear,double price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.publishYear = publishYear;
    }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public int getPublishYear() { return publishYear; }
    public double getPrice() { return price; }
    public abstract boolean isPurchasable();
}
