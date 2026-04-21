# Template Method Pattern

The Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## Real-World Analogy

Think of making a sandwich. The steps for making a sandwich are always the same: you take two slices of bread, you put some fillings in between, and then you put the two slices of bread together. The fillings can be different, but the overall algorithm is the same.

## Code Example

In our code, we have a `Game` abstract class that defines the template method `play()`.

*   `Game`: The abstract class that defines the template method.
*   `Cricket`, `Football`: Concrete classes that override the steps of the algorithm.

The client code uses the `Game` class to play a game. The `play()` method calls the abstract methods `initialize()`, `startPlay()`, and `endPlay()` in a specific order. The concrete classes then provide the implementation for these methods.

## Benefits of Template Method Pattern

*   **Code Reuse:** You can reuse the common parts of the algorithm in the superclass.
*   **Inversion of Control:** The superclass calls the methods of the subclass, not the other way around.
*   **Frameworks:** The Template Method pattern is often used in frameworks to provide a skeleton for the user to fill in.