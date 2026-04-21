# Single Responsibility Principle (SRP)

The Single Responsibility Principle is the first of the five SOLID principles of object-oriented design. It states that a class should have only one reason to change, meaning it should have only one job or responsibility.

## Real-World Analogy

Think of a Swiss Army knife. It has many tools: a knife, a screwdriver, a can opener, etc. If the knife blade breaks, you have to send the whole tool in for repair. If the screwdriver is the wrong size, you're stuck. This is an example of a class with multiple responsibilities.

A better approach is to have a toolbox with individual tools. You have a knife, a set of screwdrivers, and a can opener. If one tool breaks, you can replace it without affecting the others. If you need a different size screwdriver, you just grab the right one. This is the Single Responsibility Principle in action. Each tool has a single responsibility.

## Code Example

In our code, we have two classes: `Book` and `BookPrinter`.

### Book.java

```java
package com.learning.solidanddesignpattern.solidprinciples.srp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String text;
}
```

The `Book` class has only one responsibility: to hold the data for a book. It doesn't know how to print, save, or do anything else with the data. It's just a data container.

### BookPrinter.java

```java
package com.learning.solidanddesignpattern.solidprinciples.srp;

import org.springframework.stereotype.Component;

@Component
public class BookPrinter {

    public void printBook(Book book) {
        System.out.println("Printing book...");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Text: " + book.getText());
    }
}
```

The `BookPrinter` class has a single responsibility: to print the details of a `Book`. It doesn't know where the book data comes from or how it's stored. It only knows how to print it.

### Benefits of SRP

*   **Reduced Complexity:** Each class is smaller and easier to understand.
*   **Improved Maintainability:** Changes to one responsibility won't break code related to other responsibilities.
*   **Increased Reusability:** Smaller, more focused classes are easier to reuse in other parts of the application.

By separating the `Book` data from the printing logic, we've created a more robust and maintainable design.