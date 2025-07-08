#  Java Bookstore System

A console-based Java application that simulates a basic bookstore. This system demonstrates the use of **OOP principles**, **SOLID design**, and **clean architecture**, with a focus on **purchasing**, **delivering**, and **managing** different types of books.

---

##  Features

- Add multiple types of books (paper books, eBooks, showcase books) to inventory.
- Purchase and deliver books based on their type and availability.
- Automatically remove books older than a given number of years.
- Console output with structured, readable reports.

---

##  System Design

###  Object-Oriented Principles

- **Abstraction:** `Book` is an abstract superclass.
- **Encapsulation:** Fields like `isbn`, `title`, and `stock` are private or protected.
- **Inheritance:** `PaperBook`, `EBook`, and `ShowcaseBook` inherit from `Book`.
- **Polymorphism:** Behavior like `deliver()` and `isPurchasable()` varies across subclasses.

### SOLID Principles

| Principle | Applied Through |
|----------|------------------|
| **S**ingle Responsibility | Each class handles one responsibility (e.g., `BookStore` only manages inventory). |
| **O**pen/Closed           | New book types (like `Audiobook`) can be added without changing existing code. |
| **L**iskov Substitution   | All subclasses of `Book` can be used interchangeably where `Book` is expected. |
| **I**nterface Segregation| `Purchasable` and `Deliverable` are separate, focused interfaces. |
| **D**ependency Inversion | High-level `BookStore` depends on abstractions (`Book`, `Purchasable`) not concrete types. |

---
###  Output be like 
<img width="1440" alt="Screenshot 2025-07-08 at 8 55 03 PM" src="https://github.com/user-attachments/assets/9eca953f-3ab1-4801-aa8c-f6a52e66730e" />

<img width="1440" alt="Screenshot 2025-07-08 at 8 55 57 PM" src="https://github.com/user-attachments/assets/d958aa84-cd9c-4313-93d6-a7dc0b4042d7" />

