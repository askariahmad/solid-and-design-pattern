# Decorator Pattern

The Decorator Pattern is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

## Real-World Analogy

Think of a Christmas tree. You start with a bare tree, and then you decorate it with lights, ornaments, and a star. Each decoration adds a new behavior to the tree.

## Code Example

In our code, we have a system for ordering coffee.

*   `Coffee`: The component interface that defines the common methods for both the coffee and the decorators.
*   `SimpleCoffee`: The concrete component that represents a simple coffee.
*   `CoffeeDecorator`: The abstract decorator that has a reference to a `Coffee` object.
*   `Milk`, `Sugar`: Concrete decorators that add milk and sugar to the coffee.

This allows us to create different types of coffee with different toppings by wrapping the `SimpleCoffee` object with different decorators.

## Benefits of Decorator Pattern

*   **Flexibility:** You can add new behaviors to objects at runtime without affecting the other objects.
*   **Single Responsibility Principle:** The responsibility of adding new behaviors is moved to the decorator classes.
*   **Open/Closed Principle:** You can add new decorators without modifying the existing component code.