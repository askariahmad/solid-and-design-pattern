# Strategy Pattern

The Strategy Pattern is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## Real-World Analogy

Think of a GPS navigator. When you want to go from one place to another, the navigator can show you different routes, such as the shortest route, the fastest route, or the route with the least traffic. Each route is a different strategy.

## Code Example

In our code, we have a simple calculator.

*   `Strategy`: The strategy interface that defines the `doOperation()` method.
*   `OperationAdd`, `OperationSubtract`, `OperationMultiply`: Concrete strategy classes that implement the `Strategy` interface.
*   `Context`: The context class that has a strategy and can change its strategy.

The client code uses the context to perform an operation. The context then delegates the operation to the current strategy.

## Benefits of Strategy Pattern

*   **Flexibility:** You can add new strategies without changing the context.
*   **Open/Closed Principle:** You can add new strategies without changing the existing strategies.
*   **Simplicity:** The context is simpler because it doesn't have to know about the different strategies.