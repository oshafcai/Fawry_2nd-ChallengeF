package com.example.deno6;

public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year) {
        super(isbn, title, year, 0.0);}
    @Override
    public boolean isPurchasable() {
        return false;
    }
}
