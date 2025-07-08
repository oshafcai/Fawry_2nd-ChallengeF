/**
 * Author: Nadra Saad
 * Date: 2025-07-08
 */
package com.example.deno6;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Deno6Application {
    public static void main(String[] args) {
        SpringApplication.run(Deno6Application.class, args);

        BookStore store = new BookStore();


        PaperBook b1 = new PaperBook("B001", "Clean Code", 2010, 120.0, 5);
        PaperBook b2 = new PaperBook("B002", "The Pragmatic Programmer", 2015, 135.0, 2);
        EBook b3 = new EBook("Design Patterns", "B003", 2020, 90.0, "epub");
        EBook b4 = new EBook("Refactoring", "B004", 2022, 85.0, "pdf");
        ShowcaseBook b5 = new ShowcaseBook("The Art of Computer Programming", "B005", 1995);

        store.addBookToInventory(b1);
        store.addBookToInventory(b2);
        store.addBookToInventory(b3);
        store.addBookToInventory(b4);
        store.addBookToInventory(b5);

        System.out.println("\n=========== PURCHASE REPORT ===========");

        try {
            store.purchaseBook("B001", 1, "customer1@example.com", "Cairo, Egypt");
            store.purchaseBook("B003", 1, "customer2@example.com", "");
            store.purchaseBook("B004", 1, "customer3@example.com", "");
        } catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        }

        System.out.println("\n=========== BOOKSTORE INVENTORY (Before Cleanup) ===========");
        printInventoryFormatted(store);

        System.out.println("\nCleaning up books older than 10 years...");
        store.removeBooksOlderThan(2025, 10);

        System.out.println("\n=========== BOOKSTORE INVENTORY (After Cleanup) ===========");
        printInventoryFormatted(store);
    }

    /**
     * Print inventory in a table-style format.
     */
    public static void printInventoryFormatted(BookStore store) {
        System.out.printf("%-6s | %-30s | %-4s | %-6s%n", "ISBN", "Title", "Year", "Price");
        System.out.println("---------------------------------------------------------------");
        for (Book book : store.getInventory().values()) {
            System.out.printf("%-6s | %-30s | %-4d | $%-6.2f%n",
                    book.getIsbn(),
                    book.getTitle(),
                    book.getPublishYear(),
                    book.getPrice());
        }
    }
}

