# Dependency Inversion Principle (DIP)

The Dependency Inversion Principle is the fifth and final of the five SOLID principles. It has two parts:

1.  High-level modules should not depend on low-level modules. Both should depend on abstractions.
2.  Abstractions should not depend on details. Details should depend on abstractions.

In simpler terms, instead of a high-level class directly creating and depending on a low-level class, both should depend on an interface. This "inverts" the typical dependency flow.

## Real-World Analogy

Think of a lamp and a wall socket. The lamp (high-level module) doesn't depend on the specific wiring inside the wall (low-level module). Instead, it depends on the wall socket (the abstraction). The lamp doesn't care how the electricity is generated or how it gets to the socket. It just needs a standard interface to plug into.

This allows you to plug any appliance (not just the lamp) into the socket, and you can change the wiring in the wall without affecting the lamp.

## Code Example

In our code, we have a notification system.

### Incorrect Implementation (Violates DIP)

Initially, our high-level `Notification` class directly depended on the low-level `Email` class.

```java
public class Email {
    public void sendEmail() {
        System.out.println("Sending email...");
    }
}

public class Notification {
    private Email email;

    public Notification() {
        this.email = new Email();
    }

    public void send() {
        email.sendEmail();
    }
}
```

This is a violation of the DIP because the high-level `Notification` class is tightly coupled to the low-level `Email` class.

### Correct Implementation (Follows DIP)

To fix this, we introduced a `Message` interface.

```java
public interface Message {
    void sendMessage();
}
```

Now, both the high-level `Notification` class and the low-level `Email` and `Sms` classes depend on this interface.

```java
public class Email implements Message {
    public void sendMessage() {
        System.out.println("Sending email...");
    }
}

public class Sms implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS...");
    }
}

public class Notification {
    private Message message;

    public Notification(Message message) {
        this.message = message;
    }

    public void send() {
        message.sendMessage();
    }
}
```

The `Notification` class no longer creates its own `Email` object. Instead, it receives a `Message` object through its constructor (this is called dependency injection). This inverts the dependency, and now the `Notification` class is no longer tightly coupled to the `Email` class.

### Benefits of DIP

*   **Loose Coupling:** Classes are not tightly coupled to each other, which makes the system more flexible.
*   **Improved Testability:** It's easier to test classes in isolation by providing mock implementations of their dependencies.
*   **Increased Reusability:** Classes that depend on abstractions are more reusable because they can work with any implementation of that abstraction.

By following the Dependency Inversion Principle, we've created a more flexible, maintainable, and testable system.