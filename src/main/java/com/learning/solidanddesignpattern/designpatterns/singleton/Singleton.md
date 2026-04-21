# Singleton Pattern

The Singleton Pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to it.

This is useful for managing resources that should be shared across the entire application, such as a database connection, a file manager, or an application configuration object.

## Real-World Analogy

Think of the president of a country. There can only be one president at a time. The president is a global point of access for the country's leadership. You don't create a new president every time you need a decision made. Instead, you go to the one and only president.

## Code Example

We have two examples of the Singleton Pattern: a classic Java implementation and a Spring Boot implementation.

### Classic Java Singleton (`AppConfig.java`)

```java
public class AppConfig {

    private static volatile AppConfig instance;
    private String configData;

    private AppConfig() {
        // Private constructor to prevent instantiation
        this.configData = "Default Configuration";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    // ... getters and setters
}
```

In this classic implementation:
*   The constructor is `private` to prevent other classes from creating new instances.
*   The `getInstance()` method is a `static` method that returns the single instance of the class. It creates the instance if it doesn't exist, and it's thread-safe.

### Spring Boot Singleton (`SpringAppConfig.java`)

```java
import org.springframework.stereotype.Component;

@Component
public class SpringAppConfig {

    private String configData;

    public SpringAppConfig() {
        this.configData = "Default Spring Configuration";
    }

    // ... getters and setters
}
```

In Spring, you don't need to write any special code to create a singleton. By default, all beans in the Spring container are singletons.

*   The `@Component` annotation tells Spring to manage this class as a bean.
*   When you need to use the `SpringAppConfig`, you can just inject it into another class, and Spring will provide the single instance.

For example:
```java
@Service
public class MyService {

    private final SpringAppConfig appConfig;

    public MyService(SpringAppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public void doSomething() {
        System.out.println(appConfig.getConfigData());
    }
}
```

### Benefits of Singleton Pattern

*   **Controlled Access:** The singleton class can have strict control over how and when its instance is accessed.
*   **Resource Management:** It's useful for managing shared resources, preventing multiple instances from conflicting with each other.
*   **Lazy Initialization:** The instance can be created only when it's needed, which can improve performance.

The Singleton Pattern is a simple but powerful tool for managing single instances of a class in your application.