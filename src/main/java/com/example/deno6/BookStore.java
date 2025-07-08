package com.example.deno6;

import java.util.HashMap;
import java.util.Map;


public class BookStore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBookToInventory(Book book) {
        inventory.put(book.getIsbn(), book);
    }

    public void removeBooksOlderThan(int currentYear, int maxAge) {
        inventory.values().removeIf(book -> currentYear - book.getPublishYear() > maxAge);
    }

    public void purchaseBook(String isbn, int quantity, String email, String address) {
        System.out.println("Looking for ISBN: " + isbn);
        printInventory();

        Book book = inventory.get(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Book not found with ISBN: " + isbn);
        }

        if (!(book instanceof Purchasable purchasable) || !purchasable.isPurchasable()) {
            throw new IllegalArgumentException("Book is not available for purchase.");
        }

        System.out.println("Payment of $" + (book.getPrice() * quantity) + " received.");

        if (book instanceof PaperBook paperBook) {
            paperBook.reduceStock(quantity);
            paperBook.deliver(address);
        } else if (book instanceof EBook eBook) {
            eBook.deliver(email);
        }
    }

    public void printInventory() {
        System.out.println(" Inventory contents:");
        for (Map.Entry<String, Book> entry : inventory.entrySet()) {
            System.out.println(" - ISBN: " + entry.getKey() + " | Title: " + entry.getValue().getTitle());
        }
    }

    public Map<String, Book> getInventory() {
        return inventory;
    }
}
