# Command Pattern

The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request's execution, and support undoable operations.

## Real-World Analogy

Think of a restaurant. When you place an order, the waiter takes your order and writes it down on a piece of paper. The piece of paper is the command. The waiter then takes the command to the kitchen, and the chef executes the command.

## Code Example

In our code, we have a simple remote control.

*   `Command`: The command interface that defines the `execute()` method.
*   `Light`: The receiver class that knows how to perform the actual work.
*   `LightOnCommand`, `LightOffCommand`: Concrete command classes that encapsulate a request to turn a light on or off.
*   `SimpleRemoteControl`: The invoker class that's responsible for initiating the request.

The client code creates a command object and sets it on the invoker. The invoker then calls the `execute()` method on the command object to process the request.

## Benefits of Command Pattern

*   **Decoupling:** It decouples the object that invokes the operation from the one that knows how to perform it.
*   **Undo/Redo:** It's easy to implement undo/redo functionality by adding an `unexecute()` method to the command interface.
*   **Queuing:** You can queue commands and execute them at a later time.
*   **Logging:** You can log commands and replay them in case of a system crash.