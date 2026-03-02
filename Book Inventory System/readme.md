
# 📚 Book Inventory System

This repository contains a Java-based **Book Inventory System** designed to demonstrate core Object-Oriented Programming (OOP) principles, custom exception handling, and collection management using `ArrayList`.

---

##  Features

* **Object Creation**: Supports multiple constructors (Default, Parameterized, and Copy) for flexible data entry.
* **⚠️ Custom Exception Handling**: Prevents data entry errors using specialized exceptions for price and genre validation.
* **📊 Dynamic Data Management**: Uses `ArrayList` to store, merge, and manipulate book records efficiently.
* **🔍 Inventory Insights**:
* Automatic calculation of the **Average Price** across the entire inventory.
* Filtering logic to isolate and count specific categories like **"Classic"** books.



---

##  📂 File Structure

| File | Description |
| --- | --- |
| 📄 `Book.java` | The Blueprint class defining attributes, validation logic, and display methods. |
| ⚙️ `ArrayListOfBook.java` | The Driver class containing the `main` method and inventory logic. |
| 🚫 `InvalidPriceException.java` | Custom Exception thrown when a book price is negative. |
| 🚫 `InvalidBookGenreException.java` | Custom Exception thrown for unsupported genres. |

---

##  🛠️ Technical Overview

###  Architecture

The system follows a standard OOP structure where the `Book` class encapsulates data and the `ArrayListOfBook` class handles the execution logic.

###  ✅ Validation Logic

The system enforces strict data integrity during object instantiation:

* **Price Validation**: Checks if `price < 0` and throws an `InvalidPriceException` if true.
* **Genre Validation**: Restricts input to a whitelist: **"Classic"**, **"Fantasy"**, or **"Dystopian"**.

---

##  🚀 How to Run

1. **Compile the source files**:
```bash
javac *.java

```


2. **Run the application**:
```bash
java ArrayListOfBook

```



---


