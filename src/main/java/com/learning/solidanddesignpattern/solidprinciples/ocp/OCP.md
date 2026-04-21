# Open/Closed Principle (OCP)

The Open/Closed Principle is the second of the five SOLID principles. It states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

This means that you should be able to add new functionality to a system without changing the existing code.

## Real-World Analogy

Think about your smartphone. You can install new apps to add new functionality, like a new game or a social media app. You don't have to send your phone back to the manufacturer to have them add the new app for you. Your phone is "open for extension" because you can add new apps, but it's "closed for modification" because you can't change the phone's operating system.

## Code Example

In our code, we have a `PaymentProcessor` that can process different types of payments.

### Payment.java (Interface)

```java
package com.learning.solidanddesignpattern.solidprinciples.ocp;

public interface Payment {
    void processPayment();
}
```

This is the core of our extensible design. It defines a contract that all payment methods must follow.

### CreditCardPayment.java, PayPalPayment.java, BitcoinPayment.java (Implementations)

```java
// CreditCardPayment.java
@Component("CreditCard")
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

// PayPalPayment.java
@Component("PayPal")
public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

// BitcoinPayment.java
@Component("Bitcoin")
public class BitcoinPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Bitcoin payment...");
    }
}
```

Each of these classes provides a specific implementation of the `Payment` interface.

### PaymentProcessor.java

```java
package com.learning.solidanddesignpattern.solidprinciples.ocp;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentProcessor {

    private final Map<String, Payment> payments;

    public PaymentProcessor(Map<String, Payment> payments) {
        this.payments = payments;
    }

    public void processPayment(String paymentType) {
        Payment payment = payments.get(paymentType);
        if (payment == null) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        payment.processPayment();
    }
}
```

The `PaymentProcessor` is "closed for modification." It doesn't need to change to support new payment types. It's also "open for extension" because we can add new payment types by creating new classes that implement the `Payment` interface and Spring will automatically inject them into the `payments` map.

### Benefits of OCP

*   **Flexibility:** New functionality can be added with minimal changes to existing code.
*   **Maintainability:** Reduces the risk of introducing bugs into existing, working code.
*   **Scalability:** The system can grow and evolve without becoming overly complex.

By following the Open/Closed Principle, we've created a payment processing system that is easy to extend and maintain.