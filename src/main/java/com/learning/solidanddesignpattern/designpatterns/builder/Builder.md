# Builder Pattern

The Builder Pattern is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Real-World Analogy

Think of ordering a custom sandwich at a deli. You don't just say "give me a sandwich." You specify the type of bread, the meat, the cheese, the vegetables, and the sauces. The person making the sandwich is the "builder." You tell them what you want, and they construct the sandwich for you.

## Code Example

In our code, we have a system for building computers.

### Computer.java

```java
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String os;
}
```

We use Lombok's `@Builder` annotation to automatically generate the builder code for us. This is a modern and convenient way to implement the Builder pattern in Java.

### BuilderExample.java

```java
public class BuilderExample implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Computer gamingComputer = Computer.builder()
                .cpu("Intel i9")
                .ram("32GB")
                .storage("1TB SSD")
                .gpu("NVIDIA RTX 3080")
                .os("Windows")
                .build();

        Computer officeComputer = Computer.builder()
                .cpu("Intel i5")
                .ram("16GB")
                .storage("512GB SSD")
                .os("Windows")
                .build();
    }
}
```

The client code uses the builder to construct different types of computers with different configurations.

## Benefits of Builder Pattern

*   **Readability:** The code is more readable and easier to understand, especially when creating complex objects with many parameters.
*   **Immutability:** The builder can be used to create immutable objects, which are inherently thread-safe.
*   **Flexibility:** It's easy to create different representations of an object by using different builder configurations.
*   **No More Telescoping Constructors:** It avoids the problem of having many constructors with different combinations of parameters.