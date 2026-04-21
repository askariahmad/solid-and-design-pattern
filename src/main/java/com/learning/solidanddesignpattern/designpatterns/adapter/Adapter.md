# Adapter Pattern

The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate.

## Real-World Analogy

Think of a travel adapter. If you're traveling from a country with one type of electrical outlet to a country with another, you need an adapter to plug in your devices. The adapter doesn't change the functionality of your device; it just allows it to work with a different interface.

## Code Example

In our code, we have a `MediaPlayer` that can play `mp3` files. We want to make it play `vlc` and `mp4` files as well, but we have an `AdvancedMediaPlayer` that has a different interface.

*   `MediaPlayer`: The target interface that the client code uses.
*   `AdvancedMediaPlayer`: The adaptee interface that needs to be adapted.
*   `VlcPlayer`, `Mp4Player`: Concrete implementations of the `AdvancedMediaPlayer`.
*   `MediaAdapter`: The adapter class that implements the `MediaPlayer` interface and uses an instance of `AdvancedMediaPlayer` to play `vlc` and `mp4` files.
*   `AudioPlayer`: The client code that uses the `MediaPlayer` interface.

This allows the `AudioPlayer` to play `vlc` and `mp4` files without knowing the details of the `AdvancedMediaPlayer` interface.

## Benefits of Adapter Pattern

*   **Interoperability:** It allows objects with incompatible interfaces to work together.
*   **Single Responsibility Principle:** The responsibility of adapting the interface is moved to the adapter class.
*   **Open/Closed Principle:** You can add new adapters without modifying the existing client code.