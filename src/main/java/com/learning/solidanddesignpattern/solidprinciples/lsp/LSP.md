# Liskov Substitution Principle (LSP)

The Liskov Substitution Principle is the third of the five SOLID principles. It states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

In simpler terms, a subclass should behave in the same way as its superclass. If you have a piece of code that works with a superclass, it should also work with any of its subclasses without any issues.

## Real-World Analogy

Think of a remote control. You have a remote control for your TV. It has buttons for power, volume, and changing channels. Now, imagine you buy a new, more advanced TV of the same brand. The new remote control might have more buttons, but it still has the same basic buttons for power, volume, and channels. You can use the new remote control to operate the old TV, and the old remote control to operate the new TV (for the basic functions). The new remote is a valid substitute for the old one.

However, if you have a remote for a DVD player, you can't use it to control your TV. It doesn't have the right buttons. The DVD player remote is not a valid substitute for the TV remote.

## Code Example

In our code, we have a `Bird` superclass and subclasses for different types of birds.

### Incorrect Implementation (Violates LSP)

Initially, we had a `Bird` class with a `fly()` method.

```java
public class Bird {
    public void fly() {
        System.out.println("I am flying");
    }
}
```

Then we created a `Penguin` subclass that overrode the `fly()` method to throw an exception.

```java
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
```

This violates the LSP because a `Penguin` object doesn't behave like a `Bird` object. If you have a method that takes a `Bird` object and calls the `fly()` method, it will crash if you pass in a `Penguin` object.

### Correct Implementation (Follows LSP)

To fix this, we refactored our class hierarchy.

#### Bird.java (Superclass)

```java
public class Bird {
}
```

The base `Bird` class is now more general and doesn't have a `fly()` method.

#### FlyingBird.java (Subclass)

```java
public class FlyingBird extends Bird {
    public void fly() {
        System.out.println("I am flying");
    }
}
```

We created a `FlyingBird` subclass for birds that can fly.

#### Sparrow.java (Subclass of FlyingBird)

```java
public class Sparrow extends FlyingBird {
}
```

The `Sparrow` class now extends `FlyingBird` and inherits the `fly()` method.

#### Penguin.java (Subclass of Bird)

```java
public class Penguin extends Bird {
    public void swim() {
        System.out.println("I am swimming");
    }
}
```

The `Penguin` class extends the base `Bird` class and has its own `swim()` method. It doesn't have a `fly()` method, so there's no violation of the LSP.

### Benefits of LSP

*   **Code Reusability:** You can write code that works with a superclass, and it will also work with any of its subclasses.
*   **Maintainability:** The class hierarchy is more logical and easier to understand.
*   **Reduced Complexity:** You don't have to write special code to handle different subclasses.

By following the Liskov Substitution Principle, we've created a more robust and reliable class hierarchy.