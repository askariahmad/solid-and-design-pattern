# Bridge Pattern

The Bridge Pattern is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

## Real-World Analogy

Think of a light switch. The switch itself is the abstraction, and the light bulb is the implementation. You can have different types of switches (e.g., a simple on/off switch, a dimmer switch) and different types of light bulbs (e.g., an incandescent bulb, an LED bulb). The switch and the bulb can be developed independently of each other.

## Code Example

In our code, we have a system for controlling different types of devices with different types of remotes.

*   `Device`: The implementation interface that defines the methods for a device.
*   `Tv`, `Radio`: Concrete implementations of the `Device` interface.
*   `Remote`: The abstraction class that has a reference to a `Device` object.
*   `AdvancedRemote`: A refined abstraction that extends the `Remote` class.

This allows us to have different types of remotes that can control different types of devices, and we can add new remotes and new devices without affecting the existing code.

## Benefits of Bridge Pattern

*   **Decoupling:** It decouples the abstraction from the implementation, so they can be developed independently.
*   **Single Responsibility Principle:** The responsibility of the abstraction and the implementation are separated.
*   **Open/Closed Principle:** You can add new abstractions and new implementations without modifying the existing code.