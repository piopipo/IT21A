
# Lesson 6: Polymorphism and Abstraction

## Part 1: Polymorphism

### Program: Employee Work Management System

The Employee Work Management System demonstrates how different employees can perform different tasks using the same method. In a company, employees have different responsibilities depending on their job roles. This program uses polymorphism to show how a Programmer and a Designer perform their assigned tasks differently.

### How Polymorphism Works in the Code

- **Parent Class:** `Employee` serves as the parent class. It contains the employee's name and the `performWork()` method.
- **Child Classes:** `Programmer` and `Designer` inherit from `Employee` using `extends`.
- **Method Overriding:** Both child classes override the `performWork()` method using `@Override`. The Programmer develops and debugs software, while the Designer creates user interfaces and visual designs.
- **Polymorphism:** In the main method, parent class references are used to create Programmer and Designer objects. When `performWork()` is called, Java executes the method based on the actual object.

### Expected Output

    EMPLOYEE WORK MANAGEMENT SYSTEM
    ================================
    Employee Task Assignments
    --------------------------------
    Alex is developing and debugging software.
    Jamie is creating user interfaces and visual designs.
    --------------------------------
    Employee task assignments completed.

---

## Part 2: Abstraction

### Program: Smart Home Device System

The Smart Home Device System demonstrates how different smart home devices share common features but perform different functions. For example, a smart light turns on, while a smart speaker plays music. This program uses abstraction to provide a common structure for these devices while allowing each one to have its own activation behavior.

### How Abstraction Works in the Code

- **Abstract Class:** `SmartDevice` serves as the abstract parent class and contains the common structure of smart home devices.
- **Abstract Method:** `activate()` is an abstract method that requires every child class to provide its own implementation.
- **Concrete Method:** `showStatus()` is a regular method that displays the device's status and can be used by the child classes.
- **Child Classes:** `SmartLight` and `SmartSpeaker` inherit from `SmartDevice` using `extends`.
- **Method Implementation:** Both child classes override `activate()` using `@Override`. The SmartLight displays that it is turned on, while the SmartSpeaker displays that it is playing music.
- **Main Method:** The program creates SmartLight and SmartSpeaker objects using `SmartDevice` references and calls their activation methods.

### Expected Output

    SMART HOME DEVICE SYSTEM
    =========================
    Device Activation
    -------------------------
    Living Room Light is ready to use.
    Living Room Light is now turned on.

    Bedroom Speaker is ready to use.
    Bedroom Speaker is now playing music.
    -------------------------
    All devices have been processed.

---

## Difference Between Polymorphism and Abstraction

**Polymorphism** allows different objects to use the same method but perform different actions. In the Employee Work Management System, both Programmer and Designer use `performWork()`, but each performs a different task.

**Abstraction** focuses on providing a common structure while hiding specific implementation details. In the Smart Home Device System, `SmartDevice` defines the common structure and requires each device to implement its own `activate()` method.

In simple terms, polymorphism focuses on different behaviors using the same method, while abstraction focuses on defining common features and required behaviors for related classes.

---

## Reflection Questions

### 1. Why is method overriding important in polymorphism? What would happen if a child class does not override the parent method?

Method overriding is important because it allows a child class to provide its own behavior for a method inherited from its parent. If a child class does not override the method, it will use the original implementation from the parent class instead.

### 2. Why can't we create an object from an abstract class? What is the purpose of an abstract class?

We cannot directly create an object from an abstract class because it is designed to serve as a common structure for other classes. Its purpose is to define shared features and require child classes to provide implementations for abstract methods.

### 3. If you want to add another child class to your polymorphism program, what changes would you make?

I can create another class, such as `Accountant`, that extends `Employee`. I would override the `performWork()` method to display the accountant's responsibilities. Then, I would create an `Employee` reference for the new object and call the same method. This allows me to add another employee role without changing the existing classes.

### 4. Can polymorphism and abstraction work together in one program? Explain with an example.

Yes, polymorphism and abstraction can work together. For example, an abstract class called `Vehicle` can have an abstract method called `start()`. Classes such as `Car` and `Motorcycle` can extend it and provide their own implementations. Using `Vehicle` references to call `start()` demonstrates polymorphism, while the abstract class demonstrates abstraction.

### 5. When would you use polymorphism instead of abstraction, or vice versa, in your future programming projects?

I would use polymorphism when different objects need to perform similar actions in different ways, such as employees performing different tasks. I would use abstraction when I want to establish a common structure for related classes while allowing each class to define its own specific behavior, such as different smart home devices.

---

## Personal Reflection

Through this activity, I learned how polymorphism and abstraction help organize Java programs. Polymorphism allows different objects to respond differently using the same method, while abstraction provides a common structure that child classes can follow. Understanding these concepts will help me create programs that are easier to manage, understand, and expand in the future.
