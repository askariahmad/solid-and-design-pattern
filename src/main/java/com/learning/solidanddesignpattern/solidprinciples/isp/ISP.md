# Interface Segregation Principle (ISP)

The Interface Segregation Principle is the fourth of the five SOLID principles. It states that no client should be forced to depend on methods it does not use. In other words, it's better to have many small, specific interfaces than one large, general-purpose one.

## Real-World Analogy

Think of a restaurant menu. A good menu is divided into sections: appetizers, main courses, desserts, drinks, etc. You can easily find what you're looking for. You don't have to read through the entire menu to find the desserts.

A bad menu would be a single, long list of every item the restaurant serves. If you only want to see the desserts, you have to scan through the entire list, which is inefficient and annoying. This is like a "fat" interface that forces you to deal with methods you don't need.

## Code Example

In our code, we have a system for managing printers.

### Incorrect Implementation (Violates ISP)

Initially, we had a single `BadMachine` interface with methods for printing, scanning, and faxing.

```java
public interface BadMachine {
    void print();
    void scan();
    void fax();
}
```

This interface is "fat" because it has methods for multiple, independent functionalities.

A `MultifunctionPrinter` can implement this interface without any problems, but an `OldFashionedPrinter` is forced to implement the `scan()` and `fax()` methods, even though it can't perform those actions.

```java
public class OldFashionedPrinter implements BadMachine {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("This printer can't scan.");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("This printer can't fax.");
    }
}
```

This is a clear violation of the ISP.

### Correct Implementation (Follows ISP)

To fix this, we segregated the `BadMachine` interface into smaller, more specific interfaces.

```java
public interface Printer {
    void print();
}

public interface Scanner {
    void scan();
}

public interface Fax {
    void fax();
}
```

Now, our `OldFashionedPrinter` can just implement the `Printer` interface.

```java
public class OldFashionedPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
```

And our `MultifunctionPrinter` can implement all three interfaces.

```java
public class MultifunctionPrinter implements Printer, Scanner, Fax {
    // ...
}
```

### Benefits of ISP

*   **Reduced Coupling:** Classes are not forced to depend on methods they don't use.
*   **Improved Cohesion:** Interfaces are more focused and have a single, well-defined responsibility.
*   **Increased Flexibility:** It's easier to implement new classes that only need a subset of the functionality.

By following the Interface Segregation Principle, we've created a more flexible and maintainable system.