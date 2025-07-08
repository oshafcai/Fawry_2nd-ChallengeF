package com.example.deno6;

public class EBook extends Book implements Purchasable, Deliverable {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String fileType) {
        super(isbn, title, year, price);
        this.fileType = fileType;
    }


    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public void deliver(String email) {
        System.out.println("Sending EBook (" + fileType + ") to email: " + email);
    }
}
