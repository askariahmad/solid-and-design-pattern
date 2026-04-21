# Iterator Pattern

The Iterator Pattern is a behavioral design pattern that provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Real-World Analogy

Think of a TV remote control. The remote control is an iterator for the channels on the TV. You can use the remote to go to the next or previous channel, but you don't need to know how the channels are stored in the TV.

## Code Example

In our code, we have a `NameRepository` that contains a collection of names.

*   `Iterator`: The iterator interface that defines the `hasNext()` and `next()` methods.
*   `Container`: The container interface that defines the `getIterator()` method.
*   `NameRepository`: The concrete container that implements the `Container` interface and has an inner class that implements the `Iterator` interface.

The client code uses the iterator to traverse the collection of names without knowing the underlying implementation of the collection.

## Benefits of Iterator Pattern

*   **Encapsulation:** It encapsulates the internal structure of the collection.
*   **Multiple Traversals:** You can have multiple iterators for the same collection, each with its own traversal state.
*   **Simplicity:** The client code is simpler because it doesn't have to deal with the complexity of traversing the collection.