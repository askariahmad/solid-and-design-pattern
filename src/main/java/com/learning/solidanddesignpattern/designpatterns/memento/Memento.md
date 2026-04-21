# Memento Pattern

The Memento Pattern is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

## Real-World Analogy

Think of a video game. You can save the game at any time and then restore it later. The saved game is a memento of the game's state.

## Code Example

In our code, we have a simple text editor.

*   `Memento`: The memento class that stores the state of the originator.
*   `Originator`: The originator class that creates and restores the memento.
*   `CareTaker`: The caretaker class that's responsible for keeping the memento.

The client code uses the originator to set the state, the caretaker to save the state, and the originator to restore the state.

## Benefits of Memento Pattern

*   **Encapsulation:** It preserves the encapsulation of the originator.
*   **Simplicity:** The originator is simpler because it doesn't have to manage its own history.
*   **Undo/Redo:** It's easy to implement undo/redo functionality by using a stack of mementos.