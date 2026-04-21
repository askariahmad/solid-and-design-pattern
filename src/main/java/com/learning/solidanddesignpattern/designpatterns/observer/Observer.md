# Observer Pattern

The Observer Pattern is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

## Real-World Analogy

Think of a newspaper subscription. When you subscribe to a newspaper, you become an observer. The newspaper is the subject. When a new issue of the newspaper is published, it's delivered to all the subscribers.

## Code Example

In our code, we have a `Subject` that has a state. We have three observers that are interested in the state of the subject.

*   `Subject`: The subject class that has a state and a list of observers.
*   `Observer`: The observer abstract class that defines the `update()` method.
*   `BinaryObserver`, `OctalObserver`, `HexaObserver`: Concrete observer classes that print the state of the subject in different formats.

When the state of the subject changes, it notifies all the observers, and the observers then update themselves.

## Benefits of Observer Pattern

*   **Decoupling:** It decouples the subject from the observers.
*   **Dynamic Relationships:** You can add or remove observers at runtime.
*   **Broadcast Communication:** The subject can notify multiple observers at once.