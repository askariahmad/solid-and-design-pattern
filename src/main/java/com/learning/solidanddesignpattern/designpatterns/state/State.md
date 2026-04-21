# State Pattern

The State Pattern is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

## Real-World Analogy

Think of a traffic light. A traffic light can be in one of three states: red, yellow, or green. The behavior of the traffic light changes depending on its state.

## Code Example

In our code, we have a simple state machine for a media player.

*   `State`: The state interface that defines the `doAction()` method.
*   `Context`: The context class that has a state and can change its state.
*   `StartState`, `StopState`: Concrete state classes that implement the `State` interface.

The client code uses the context to change the state of the media player.

## Benefits of State Pattern

*   **Single Responsibility Principle:** The state-specific behavior is moved to the state classes.
*   **Open/Closed Principle:** You can add new states without changing the existing state classes.
*   **Simplicity:** The context is simpler because it doesn't have to know about the state-specific behavior.