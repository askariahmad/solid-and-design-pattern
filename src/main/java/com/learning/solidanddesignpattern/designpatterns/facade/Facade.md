# Facade Pattern

The Facade Pattern is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

## Real-World Analogy

Think of a customer service representative. When you call a company, you don't have to know about all the different departments and people who work there. You just talk to the customer service representative, and they take care of everything for you. The customer service representative is the facade.

## Code Example

In our code, we have a home theater system with many different components.

*   `Amplifier`, `Tuner`, `DvdPlayer`, `Projector`, `Screen`: These are the complex subsystem classes.
*   `HomeTheaterFacade`: This is the facade class that provides a simplified interface for watching and stopping a movie.

The client code only has to interact with the `HomeTheaterFacade` to use the home theater system.

## Benefits of Facade Pattern

*   **Simplicity:** It provides a simple interface to a complex system.
*   **Decoupling:** It decouples the client code from the complex subsystem.
*   **Layering:** It helps to layer the system and reduce dependencies between the layers.