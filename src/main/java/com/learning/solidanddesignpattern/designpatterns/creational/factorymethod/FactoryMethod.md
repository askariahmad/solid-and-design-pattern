# Factory Method Pattern

The Factory Method Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Real-World Analogy

Think of a logistics company. The company has a `createTransport()` method. A `RoadLogistics` subclass would implement this method to create a `Truck` object, while a `SeaLogistics` subclass would implement it to create a `Ship` object. The client code can work with the `Transport` interface without knowing the concrete type of transport being used.

## Code Example

In our code, we have a system for creating vehicles.

*   `Vehicle`: An interface for different types of vehicles.
*   `Car`, `Bike`: Concrete implementations of the `Vehicle` interface.
*   `VehicleFactory`: An abstract class with a `createVehicle()` factory method.
*   `CarFactory`, `BikeFactory`: Concrete implementations of the `VehicleFactory` that create `Car` and `Bike` objects, respectively.

This allows us to create different types of vehicles without coupling the client code to the concrete vehicle classes.

## Benefits of Factory Method Pattern

*   **Decoupling:** The client code is decoupled from the concrete classes of the objects it needs to create.
*   **Extensibility:** It's easy to add new types of objects by creating new subclasses of the factory.
*   **Single Responsibility Principle:** The responsibility of creating objects is moved to the factory classes.