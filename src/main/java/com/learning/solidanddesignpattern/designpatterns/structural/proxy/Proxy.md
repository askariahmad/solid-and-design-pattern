# Proxy Pattern

The Proxy Pattern is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

## Real-World Analogy

Think of a credit card. A credit card is a proxy for your bank account. When you use a credit card, you're not directly accessing your bank account. Instead, you're using the credit card to make a purchase, and the credit card company then communicates with your bank to complete the transaction.

## Code Example

In our code, we have a system for displaying images.

*   `Image`: The service interface that defines the `display()` method.
*   `RealImage`: The real subject that loads and displays an image.
*   `ProxyImage`: The proxy that controls access to the `RealImage`.

The client code uses the `ProxyImage` to display an image. The `ProxyImage` creates the `RealImage` object only when it's needed, which is an example of lazy initialization.

## Benefits of Proxy Pattern

*   **Lazy Initialization:** You can delay the creation of an object until it's actually needed.
*   **Access Control:** You can control access to an object.
*   **Remote Proxy:** You can use a proxy to represent an object that's in a different address space.
*   **Logging:** You can use a proxy to log requests to an object.