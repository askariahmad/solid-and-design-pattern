# Interpreter Pattern

The Interpreter Pattern is a behavioral design pattern that provides a way to evaluate language grammar or expression. This pattern is used in SQL parsing, symbol processing engine etc.

## Real-World Analogy

Think of a musician reading a sheet of music. The sheet of music is a language, and the musician is the interpreter. The musician reads the notes and plays the corresponding sounds.

## Code Example

In our code, we have a simple interpreter for mathematical expressions.

*   `Expression`: The expression interface that defines the `interpret()` method.
*   `Number`: The terminal expression that represents a number.
*   `Plus`, `Minus`: Non-terminal expressions that represent addition and subtraction.

The client code builds an abstract syntax tree of expressions and then calls the `interpret()` method on the root expression to evaluate the expression.

## Benefits of Interpreter Pattern

*   **Extensibility:** It's easy to add new expressions to the language by creating new expression classes.
*   **Simplicity:** The grammar of the language is represented by the expression classes, which makes it easy to understand and maintain.
*   **Flexibility:** You can change the grammar of the language by changing the expression classes.