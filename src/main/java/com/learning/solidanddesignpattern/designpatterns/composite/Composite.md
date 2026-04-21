# Composite Pattern

The Composite Pattern is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

## Real-World Analogy

Think of a file system. A file system is a tree structure of files and directories. A directory can contain files and other directories. You can treat a single file and a directory in the same way. For example, you can move a file or a directory to another location.

## Code Example

In our code, we have a system for representing a file system.

*   `FileSystem`: The component interface that defines the common methods for both files and directories.
*   `File`: The leaf class that represents a file.
*   `Directory`: The composite class that represents a directory and can contain other `FileSystem` objects.

This allows us to treat individual files and directories in the same way, and to build complex file system structures.

## Benefits of Composite Pattern

*   **Uniformity:** It allows you to treat individual objects and compositions of objects in the same way.
*   **Extensibility:** It's easy to add new kinds of components to the composition.
*   **Simplicity:** The client code is simpler because it doesn't have to distinguish between individual objects and compositions.