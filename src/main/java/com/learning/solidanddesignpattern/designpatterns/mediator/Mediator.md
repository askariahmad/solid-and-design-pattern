# Mediator Pattern

The Mediator Pattern is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

## Real-World Analogy

Think of an air traffic controller. The airplanes don't communicate with each other directly. Instead, they all communicate with the air traffic controller, who then coordinates their movements. The air traffic controller is the mediator.

## Code Example

In our code, we have a simple chat room.

*   `ChatRoom`: The mediator class that's responsible for coordinating the communication between the users.
*   `User`: The colleague class that represents a user in the chat room.

The users don't communicate with each other directly. Instead, they all send their messages to the `ChatRoom`, which then displays the messages to all the users.

## Benefits of Mediator Pattern

*   **Decoupling:** It decouples the colleagues from each other.
*   **Centralized Control:** It centralizes the control of the communication between the colleagues.
*   **Simplicity:** The colleagues are simpler because they don't have to know about each other.