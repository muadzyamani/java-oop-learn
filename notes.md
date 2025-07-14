# Introduction
## Why learn about object-oriented programming in Java

*   **Goal:** To learn how to use the object-oriented programming (OOP) model to write code that is reusable, maintainable, secure, scalable, and easier to troubleshoot.
*   The course will explore what object orientation means and how it is fundamentally embedded into the Java language.
*   **Key Concepts to be Covered:**
    *   Classes, instances, and constructors as methods for representing objects in code.
    *   How built-in Java libraries use object orientation.
*   **Approach:** The course will focus on concrete, practical examples to make abstract OOP concepts real.
*   **Core Principle:** It is essential to recognize that Java is an object-oriented language.

## What is object orientation?

*   **Definition:** A programming model based on modeling code around objects and data, which helps make code more flexible, reusable, and easier to maintain.
*   **Example (A Tree Object):**
    *   **Attributes (Data):** Properties like `height` and `trunk diameter`.
    *   **Behaviors (Methods):** Actions the object can perform, like `grow()`, which can change the values of its attributes.
    *   **Object-Oriented Nature:** The attributes and behaviors are contained within a single unit (the "tree object") rather than being organized around a specific action.
*   **The Four Pillars of Object-Oriented Design:**
    1.  Abstraction
    2.  Inheritance
    3.  Encapsulation
    4.  Polymorphism
*   These principles are used in both custom programs and the Java source code itself to reduce complexity and encourage code reuse.

## Chapter Quiz

**Question 1:** What are the four main components of object-oriented design?

*   objects, attributes, behaviors, and classes
*   parameters, operations, functions, and structures
*   **abstraction, inheritance, encapsulation, and polymorphism (Correct)**

---

# 1. Classes and Objects in Java
## Using classes as blueprints

*   **Class Definition:** A class in Java is a blueprint used to model or represent real-life things in code.
*   A class contains a set of **attributes** (data/state) and **behaviors** (actions/methods) that define an object.
*   **Example: `Tree` Class**
    *   **Attributes:** `height`, `trunk diameter`, `treeType`. These are properties every tree has, but their values can differ for each specific tree.
    *   **Behavior:** `grow()`. This is an action the tree can perform, which modifies its attributes.
*   A class can be empty, or have only attributes, or only behaviors, but most classes will have both.
*   **Enum (Enumeration):**
    *   An `enum` is a special type that represents a group of constants.
    *   Using an `enum` for `TreeType` (e.g., `OAK`, `MAPLE`) restricts the possible values, preventing invalid data like a "macaroni tree," which would be possible if a `String` were used.
*   Creating the `Tree` class combines its related attributes and behaviors into a single, organized unit.
*   The class is a **blueprint** because it only defines the structure and behavior; it does not create any actual `Tree` objects itself.

## Building objects with a constructor

*   **Constructor:** A special method used to construct or "bring to life" objects (instances) from a class blueprint.
*   **Creating a Constructor:**
    *   The method name must be the exact same as the class name (e.g., `Tree()`).
    *   It has no return type (not even `void`). The class name itself acts as the return type.
*   Constructors can take **input parameters** to create custom, initialized objects.
*   **The `this` keyword:**
    *   Inside a constructor or instance method, `this` refers to the current object being created or worked on.
    *   It's used to distinguish between instance attributes and constructor parameters with the same name (e.g., `this.height = height;`).
*   **Creating an Instance (Object):**
    *   Use the `new` keyword followed by a call to the class's constructor.
    *   The new object is typically saved in a variable of the class type.
    *   **Example:** `Tree myFavoriteOakTree = new Tree(25, 5, TreeType.OAK);`
*   Once an object is created, you can access its attributes and use its behaviors with the dot (`.`) operator (e.g., `myFavoriteOakTree.treeType`).

## Using concrete instances for application logic

*   **Instance:** A concrete object created from a class. Each instance has its own state (values for its attributes).
*   The attributes of different instances are **independent**. For example, one `Tree` instance can have a height of 25, while another has a height of 120.
*   Changes to the class blueprint (e.g., adding a new attribute or method) will affect **all instances** created from that blueprint.
*   **Code Reusability:** Logic can be moved from the `main` method into the class itself to make it reusable by all instances of that class.
    *   **Example:** Instead of checking if a tree is tall in `main`, create an `announceTallTree()` method inside the `Tree` class.
    *   Inside the instance method, use the `this` keyword to access the attributes (`this.height`, `this.treeType`) of the specific instance that called the method.
*   This approach binds state (attributes) and behavior (methods) into a single unit, making the program more readable and maintainable.

## Understanding the difference between class and instance members

*   **Non-Static Members (Instance Members):**
    *   Belong to a specific **instance** of the class.
    *   Their values can be different for each object.
    *   You must create an instance to access them.
    *   **Examples:** `height`, `trunkDiameter`, and the `announceTallTree()` method are non-static because they depend on the state of a particular tree.
*   **Static Members (Class Members):**
    *   Belong to the **class itself**, not to any single instance.
    *   Shared by all instances of the class.
    *   Accessed via the class name (e.g., `Tree.TRUNK_COLOR`).
    *   Defined using the `static` keyword.
    *   **Static Attribute:** A property that is the same for all instances.
        *   **Example:** `static Color TRUNK_COLOR;` because all trees in this model have the same trunk color.
    *   **Static Method:** A behavior that does not rely on the attributes of a specific instance.
        *   Cannot access non-static (instance) members.
        *   Can be called directly on the class: `Tree.announceTree();`.
        *   The `main` method is `static` because it needs to run without creating an instance of its containing class.
*   **Best Practice:** If a method does not rely on any instance-specific data, it should be made `static`.

## Exploring a built-in Java class

*   You can explore the source code of built-in Java classes (like `java.awt.Color`) to see how these concepts are used in practice.
*   **IDE Tip:** Use `Command+Click` (or `Ctrl+Click`) on a class or method name in an IDE like IntelliJ to navigate directly to its source code.
*   **Analysis of the `Color` Class:**
    *   **Static Attributes:** Contains many `static` attributes for predefined colors (e.g., `Color.WHITE`, `Color.BLUE`), which act as convenient constants.
    *   **Non-Static Attributes:** Contains instance variables to store the specific red, green, and blue values for a particular color object.
    *   **Constructors:** Provides multiple constructors to create a `Color` object in various ways.
    *   **Instance Methods:** Includes methods like `brighter()` and `darker()` that create a new `Color` instance based on the current one. `getGreen()` retrieves an attribute from the current instance.
*   Using built-in classes follows the same rules:
    *   `Color.BLUE` accesses a static attribute.
    *   `myDefaultBlue.brighter()` calls an instance method on a `Color` object.

## Challenge: Build an employee class

*   **Task:** Create an `Employee` class in Java to represent an employee.
*   **Requirements:**
    *   **Attributes:** `name`, `age`, `salary`, `location`.
    *   **Behavior:** A `raiseSalary()` method.
    *   Determine which members should be `static` vs. `non-static`.
    *   In a separate `main` class:
        *   Create at least two `Employee` instances.
        *   Give one employee a raise.
        *   Print both employee salaries to confirm the change.

## Solution: Build an employee class

*   **Class Implementation:**
    *   An `Employee` class is created.
    *   The attributes (`name`, `location`, `salary`, `age`) are all **non-static**, as they are unique to each employee instance.
        *   The solution notes that `location` could be `static` if all employees worked from one office, or an `enum` for a set of defined locations.
    *   A **constructor** is created to initialize all the non-static attributes when a new `Employee` object is created.
    *   A `raiseSalary()` method is added, which modifies the `salary` attribute for the specific instance it's called on.
*   **Main Method Implementation:**
    *   A `main` class is created.
    *   Two `Employee` objects are instantiated using the constructor with unique data.
    *   The `raiseSalary()` behavior is called on one of the employee instances.
    *   The salaries of both employees are printed, showing that only the employee who received the raise has an updated salary.
*   **Conclusion:** This challenge demonstrates a core OOP concept: combining the related state (attributes) and behaviors of an "employee" into a single, reusable `Employee` class.

## Chapter Quiz

**Question 1 of 6**

Kiva created the following constructor for a class called Tree. How should he create a new tree object called myFavOakTree with a height of 25 feet, a diameter of 5 inches, and a treeType of OAK?

```java
Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
     this.heightFt = heightFt;
     this.trunkDiameterInches = trunkDiameterInches;
     this.treeType = treeType;
}
```

*   **`Tree myFavOakTree=new Tree(25, 5,TreeType.OAK);` (Correct)**
*   `this.heightFt=25;this.trunkDiameterInches=5;this.treeType=OAK;`
*   `myFavOakTree.treeType=Tree(heightFt=25,trunkDiameterInches=5,TreeType=OAK);`

**Question 2 of 6**

How should you create a function within a class called Tree with attributes of heightFt, trunkDiameterInches, and treeType that will announce whether a tree is tall if taller than 100 feet?

*   `string announceTallTree() { if (tree.height > 100) { System.out.println("That's a tall " + this.treeType + " tree!"); }}`
*   `Tree(double heightFt, double trunkDiameterInches, TreeType treeType) { this.heightFt = heightFt; this.trunkDiameterInches = trunkDiameterInches; this.treeType = treeType; }`
*   **`void announceTallTree() { if (this.heightFt > 100) { System.out.println("That's a tall " + this.treeType + " tree!"); }}` (Correct)**

**Question 3 of 6**

In Java, how are behaviors typically represented in a class?

*   as string and enum types
*   **as functions or methods (Correct)**
*   as loops and conditionals

**Question 4 of 6**

How are attributes typically defined in a Java class?

*   as conditionals with bool return types
*   **as variables with specified data types (Correct)**
*   as enums with string data types

**Question 5 of 6**

What is a static member?

*   a part of a class that defines specific attributes and behaviors for that class
*   **a part of a class that is accessible through the class and belongs to the class (Correct)**
*   a part of a class that is accessible with an instance and belongs to that instance

**Question 6 of 6**

Kali created the following default blue using the built-in Color class. How should she use the brighter() method from the Color class to create a brighter blue?

```java
Color myDefaultBlue = Color.BLUE;
```

*   **`Color brighterBlue = myDefaultBlue.brighter();` (Correct)**
*   `Color brighterBlue = Color.BLUE.brighter();`
*   `public Color brighter() { Color myDefaultBlue = Color.BLUE }`