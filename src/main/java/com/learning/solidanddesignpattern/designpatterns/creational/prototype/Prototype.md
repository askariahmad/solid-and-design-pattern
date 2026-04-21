# Prototype Pattern

The Prototype Pattern is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

## Real-World Analogy

Think of cell division. A cell can split into two identical cells. The new cell is a clone of the original cell. This is like the Prototype Pattern, where you can create a new object by cloning an existing one.

## Code Example

In our code, we have a system for cloning shapes.

*   `Shape`: An interface that extends `Cloneable` and defines a `clone()` method.
*   `Circle`, `Rectangle`: Concrete implementations of the `Shape` interface that provide their own `clone()` implementations.

This allows us to create new shapes by cloning existing ones, without having to know the concrete class of the shape.

## Benefits of Prototype Pattern

*   **Decoupling:** The client code is decoupled from the concrete classes of the objects it needs to clone.
*   **Performance:** Cloning can be more efficient than creating a new object from scratch, especially for complex objects.
*   **Flexibility:** It's easy to create new objects with different configurations by cloning a prototype and then modifying its properties.