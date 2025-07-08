package com.example.deno6;

public class PaperBook extends Book implements Purchasable, Deliverable {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, int stock) {
        super(title, isbn, year, price); // Book(title, isbn, year, price)
        this.stock = stock;
    }

    @Override
    public boolean isPurchasable() {
        return stock > 0;
    }

    @Override
    public void deliver(String target) {
        System.out.println("Delivering paper book to " + target);
    }

    public void reduceStock(int qty) {
        if (qty > stock) throw new IllegalArgumentException("Not enough stock");
        stock -= qty;
    }
}
