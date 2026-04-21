# Chain of Responsibility Pattern

The Chain of Responsibility Pattern is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

## Real-World Analogy

Think of a customer support system. When you submit a support ticket, it first goes to a general support agent. If they can't handle it, they pass it on to a more specialized agent. If that agent can't handle it, they pass it on to an engineer. This is a chain of responsibility.

## Code Example

In our code, we have a system for processing requests.

*   `Handler`: The handler interface that defines the `setNext()` and `handle()` methods.
*   `Request`: The request class that contains the request type.
*   `ConcreteHandlerA`, `ConcreteHandlerB`: Concrete handlers that can handle requests of type "A" and "B", respectively.

The client code creates a chain of handlers and then sends a request to the first handler in the chain.

## Benefits of Chain of Responsibility Pattern

*   **Decoupling:** It decouples the sender of a request from its receivers.
*   **Flexibility:** You can add or remove handlers from the chain at runtime.
*   **Single Responsibility Principle:** Each handler is responsible for handling a specific type of request.