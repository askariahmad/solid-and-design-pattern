# Flyweight Pattern

The Flyweight Pattern is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## Real-World Analogy

Think of a text editor. When you type a character, the editor doesn't create a new object for each character. Instead, it uses a flyweight object for each character, and then it just stores the position of each character. This saves a lot of memory, especially for large documents.

## Code Example

In our code, we have a system for drawing circles.

*   `Shape`: The flyweight interface that defines the `draw()` method.
*   `Circle`: The concrete flyweight that implements the `Shape` interface.
*   `ShapeFactory`: The flyweight factory that creates and manages the flyweight objects.

The client code gets the flyweight objects from the factory and then calls the `draw()` method with the extrinsic state (the position and size of the circle).

## Benefits of Flyweight Pattern

*   **Memory Savings:** It can save a lot of memory by sharing common state between multiple objects.
*   **Performance:** It can improve performance by reducing the number of objects that need to be created.
*   **Scalability:** It can help to scale the application by allowing it to handle a larger number of objects.