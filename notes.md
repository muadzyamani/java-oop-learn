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

---

# 2. Encapsulation in Java
## What is encapsulation?

*   **Definition:** Encapsulation is the principle of binding an object's state (data) and behavior (code acting on the data) together into a single unit, like a Java class.
*   **Benefit: Loose Coupling:** It prevents classes from being "tightly coupled." This allows you to modify the internal data or behaviors of one class without breaking the rest of the program.
*   **Implementation:**
    *   Achieved by creating a clear interface and restricting direct access to a class's components.
    *   A class's attributes are made "hidden" (e.g., using `private`) from other classes.
    *   The hidden data is accessed indirectly through the public methods of the class (getters and setters).
*   **Advantages:**
    *   **Robustness:** Programs become more robust to changes. If an attribute's name or storage method changes, only the class itself needs to be updated.
    *   **Security & Error Prevention:** It prevents attributes from being overwritten with invalid or unexpected values, making the program more secure and less error-prone.

## Discovering access modifiers

*   In Java, encapsulation is achieved using **access modifiers**, which are keywords that set the visibility level for variables and methods.
*   **The Three Access Modifiers:**
    *   `private`: Visible only within the class they are defined in.
    *   `protected`: Visible to the package and all subclasses.
    *   `public`: Accessible from everywhere within the program.
*   **Default (Package-Private):** If no modifier is provided, the member is only visible within its own package.
*   **Example Application:**
    *   The `main` method is `public` so the Java Virtual Machine (JVM) can execute it.
    *   In the `Tree` class example:
        *   Instance attributes (`height`, `treeType`) were made `private`.
        *   Methods and the constructor were made `public`.
*   **Effect:** Making attributes `private` means they can no longer be accessed directly from other classes (e.g., `myTree.height` will cause an error). Access must now go through public methods.

## Implementing encapsulation with access modifiers

*   The standard way to implement encapsulation for attributes is:
    1.  Declare all attributes as `private`.
    2.  Write `public` methods to get (**getters**) and set (**setters**) the values of the attributes.
*   **Getters:** Public methods that allow other classes to retrieve the value of a private attribute.
    *   Example: `public double getHeightFt() { return heightFt; }`
*   **Setters:** Public methods that allow other classes to modify the value of a private attribute.
    *   Example: `public void setTrunkDiameterInches(double diameter) { ... }`
*   **Controlling Data Modification:**
    *   This pattern gives the class complete control over its data.
    *   The `grow()` method is another way to modify `height`, but it's a controlled change (it only increases).
    *   By *not* providing a setter for an attribute (like `treeType`), it can be made **immutable** (unchangeable) after the object is created.
*   This approach makes programs more scalable and secure by centralizing the logic for how an object can change.

## Exploring encapsulation in Java string class

*   The built-in `java.lang.String` class is a prime example of encapsulation.
*   **Hidden Internals:** A `String` object stores its sequence of characters in a `private` byte array. This internal implementation is completely hidden from the user.
*   **Benefit of Hiding:** In Java 9, the internal storage of `String` was changed from a `char[]` to a `byte[]` to save memory ("Compact Strings"). Because the array was `private` and all access was through public methods (`length()`, `charAt()`, etc.), this major internal change did not break existing Java programs. This demonstrates the power of **loose coupling**.
*   **Immutability:** The `String` class has no public "setter" methods that can modify the internal array. This makes strings immutable, which is a key feature enforced by encapsulation.

## Challenge: Banking application

*   **Task:** Apply encapsulation to a `BankAccount` class.
*   **Starting Point:** A class with `owner` and `balance` attributes.
*   **Requirements:**
    *   Encapsulate the `owner` and `balance` attributes.
    *   Add a `constructor` to create a `BankAccount` instance.
    *   Add `withdrawal()` and `deposit()` methods.
    *   Add getters to retrieve the balance and owner.
    *   In a `main` class, create an account, perform transactions, and print the final balance, ensuring attributes are not accessed directly.

## Solution: Banking application

*   **Implementation Steps:**
    1.  The `owner` and `balance` attributes are made `private`.
    2.  A `public` constructor is created to set the initial owner and balance.
        *   It includes a safety check to prevent negative starting balances: `this.balance = Math.max(startingBalance, 0);`.
    3.  Public `deposit()` and `withdrawal()` methods are created. These act as controlled setters for the `balance`.
        *   The `deposit()` method checks that the deposit amount is positive.
        *   The `withdrawal()` method checks that there are sufficient funds in the account.
    4.  No setter is created for the `owner`, making it immutable after the account is created.
    5.  Getters for `owner` and `balance` are created to allow indirect access.
*   **Outcome:** Encapsulation allows for safety checks and business logic to be built into the class itself, ensuring the object's state (`balance`) is always valid.

## Chapter Quiz

**Question 1 of 4**

How should you define a set of methods to be only visible to their containing class?

*   `protected`
*   `public`
*   **`private` (Correct)**

**Question 2 of 4**

Toren created the following three private attributes for a class called Tree. How should she create a get method within her Tree class that obtains the attribute value of heightFt?

```java
private double heightFt;
private double trunkDiameterInches;
private TreeType treeType;
```

*   `void double getHeightFt() { heightFt = 180; }`
*   `private TreeType getHeightFt() { return heightFt; }`
*   **`public double getHeightFt() { return heightFt; }` (Correct)**

**Question 3 of 4**

How is encapsulation beneficial?

*   It gives direct access to the components of classes.
*   It couples functionality and its related data.
*   **It prevents classes from becoming tightly coupled. (Correct)**

**Question 4 of 4**

You created the following string. How can you use the included methods from the Java string class to determine the length of your string?

```java
String name = "Kathryn";
```

*   `return value.length`
*   **`name.length()` (Correct)**
*   `String.length(name)`

---

# 3. Inheritance in Java

## What is inheritance?

*   **Definition:** Inheritance is an object-oriented principle that allows us to create class hierarchies where one class (a subclass) can inherit properties and behaviors from another class (a superclass).
*   **Key Terminology:**
    *   **Subclass (Child Class):** The class that inherits from another class.
    *   **Superclass (Parent Class):** The class that is being inherited from.
*   **"Is A" Relationship:** Inheritance represents an "is a" relationship. For example, a `Salesperson` is an `Employee`. This means a `Salesperson` has all the attributes and behaviors of an `Employee`, plus its own specific ones.
    *   The reverse is not necessarily true (not all employees are salespersons).
*   **Benefits:**
    *   **Code Reusability:** Common properties and functionality can be written in a single superclass and reused by multiple subclasses, avoiding code duplication.
    *   **Scalability:** Changes made to the superclass are automatically propagated to all its subclasses, making the codebase easier to maintain and extend.

## Leveraging different types of inheritance

*   **Single-Level Inheritance:** A single subclass inherits from a single superclass (e.g., `Salesperson` inherits from `Employee`).
*   **Hierarchical Inheritance:** One superclass has multiple subclasses (e.g., `Salesperson` and `Analyst` both inherit from `Employee`).
*   **Multi-Level Inheritance:** A class inherits from a superclass, which in turn inherits from another superclass, forming a chain (e.g., `Salesperson` -> `Employee` -> `Person`).
*   **Inheritance Not Supported in Java:**
    *   **Multiple Inheritance:** A class inheriting from more than one superclass.
    *   **Hybrid Inheritance:** A mix of different inheritance types that results in multiple inheritance.
    *   **Reason:** These are not supported in Java to avoid unnecessary complexity in areas like casting and constructor chaining.
*   **Core Java Rule:** A class can extend only **one** superclass, but it can have multiple subclasses.

## Using inheritance to reduce code duplication

*   **`extends` Keyword:** Inheritance is implemented in Java using the `extends` keyword in the subclass definition.
    *   Example: `public class Salesperson extends Employee { ... }`
*   **Refactoring Example:**
    *   Instead of `Salesperson` and `Analyst` classes having duplicate code for `name`, `age`, and `salary`, a common `Employee` superclass is created to hold this shared code.
    *   The `Salesperson` and `Analyst` classes then `extend` the `Employee` class.
*   **`super` Keyword:**
    *   Used in a subclass's constructor to call the constructor of its superclass.
    *   This is necessary to initialize the attributes inherited from the parent.
    *   Example: `super(name, salary, age);`
*   **Access Modifiers in Inheritance:**
    *   `private` members of a superclass are **not** accessible to its subclasses.
    *   `protected` members **are** accessible to subclasses. To allow a subclass to access an attribute from its parent, the attribute should be declared `protected` instead of `private`.

## Discovering inheritance in foundational Java classes

*   The Java Development Kit (JDK) itself uses inheritance extensively.
*   **Example: `java.util.Stack`**
    *   The `Stack` class `extends` the `Vector` class.
    *   `Stack` is the **subclass**; `Vector` is the **superclass**.
    *   `Stack` reuses the functionality of `Vector` for its own methods. For instance, the `push()` method in `Stack` calls the `addElement()` method inherited from `Vector`.
    *   `Stack` adds its own specialized behavior (LIFO - Last-In, First-Out) by providing methods like `pop()`, which removes an item from a specific location, but it still relies on the underlying removal logic from `Vector`'s `removeElementAt()` method.
    *   This demonstrates how inheritance allows for reusing well-tested code while adding new, specialized functionality.

## Challenge: Reduce redundant code with inheritance

*   **Task:** Create a `ModArrayList` class that provides a foolproof way of accessing items in a list without causing an out-of-bounds error.
*   **Requirements:**
    *   The class should have all the functionality of a standard `ArrayList`.
    *   It should contain a new method, `getUsingMod(int index)`.
    *   This method should use the modulo (`%`) operator to wrap an invalid index around to a valid one based on the list's size.
    *   It should also handle negative indices by making them positive.
    *   The key is to use **inheritance** to avoid re-implementing all of `ArrayList`'s functionality.

## Solution: Reduce redundant code with inheritance

*   **Implementation:**
    *   The `ModArrayList` class is defined to `extend` `ArrayList`:
        `public class ModArrayList<E> extends ArrayList<E>`
    *   The `getUsingMod` method is implemented:
        1.  It takes an `index` as input.
        2.  It makes the index positive using `Math.abs()`.
        3.  It calculates a `validIndex` using the modulo operator: `validIndex = Math.abs(index) % this.size();`
        4.  It uses the `get()` method inherited from `ArrayList` to retrieve the item at the `validIndex`: `return this.get(validIndex);`
*   **Conclusion:** By using inheritance, the solution only had to focus on the new `mod` logic. All the complex underlying functionality of how to store and retrieve items was provided by the `ArrayList` superclass, significantly reducing code and preventing bugs.

## Chapter Quiz

**Question 1 of 5**

Which inheritance type is not supported by Java, and why?

*   **Hybrid inheritance is not supported because it causes unnecessary complexity. (Correct)**
*   Hierarchical inheritance is not supported because it is not OOP.
*   Single-level inheritance is not supported because it is overly simplified.

**Question 2 of 5**

Tan created a superclass called Employees in Java. He needs to create a subclass called Salesperson. Ignoring attributes and behaviors for now, how should he code the base template for this class?

*   `public class Employee { public class Salesperson { } }`
*   `public Superclass Salesperson Subclass Employee { }`
*   **`public class Salesperson extends Employee { }` (Correct)**

**Question 3 of 5**

The Stack class is a built-in class in Java that extends the Vector class. What does this mean?

*   Stack and Vector are independent classes.
*   **Stack is a subclass of the superclass Vector. (Correct)**
*   Stack is a superclass of the subclass Vector.

**Question 4 of 5**

How is inheritance beneficial in object-oriented programming?

*   **It promotes code reusability and scalability. (Correct)**
*   It allows duplicated code in two different places.
*   It simplifies design by hiding unnecessary details.

**Question 5 of 5**

What is inheritance as an object-oriented programming principle?

*   Implementation details are hidden from users.
*   State and behavior are bound together into a single unit.
*   **Code is organized through class hierarchies. (Correct)**

---

# 4. Polymorphism in Java
## What is polymorphism?

*   **Definition:** Polymorphism is the ability for an object or function to take on many forms. The specific form used depends on the context, making code more flexible and less complex.
*   **Practical Example:** A `ModArrayList` object can be used in the form of a `ModArrayList` (when calling its custom methods) and also in the form of an `ArrayList` (when calling inherited methods like `add`). The object's ability to use functionality from different classes is a key idea in polymorphism.
*   **Types of Polymorphism in Java:**
    1.  **Runtime Polymorphism (Method Overriding)**
    2.  **Compile-time Polymorphism (Method Overloading)**

## Writing reusable algorithms with runtime polymorphism

*   Runtime polymorphism is implemented through **method overriding**.
*   **Method Overriding:** A subclass provides a specific implementation for a method that is already defined in its superclass.
*   **Requirements for Overriding:**
    *   The method in the subclass must have the **exact same name, return type, and parameters** (i.e., the same method signature) as the method in the superclass.
    *   The `@Override` annotation should be used to indicate to the compiler that you intend to override a method. This helps prevent errors.
*   **`super` Keyword:** Inside an overridden method, you can still access the original implementation from the superclass using the `super` keyword (e.g., `super.add(element)`).
*   **Example: `OddArrayList`**
    *   An `OddArrayList` class extends `ArrayList`.
    *   It overrides the `add()`, `addAll()`, and `set()` methods.
    *   The new implementation first checks if a number is odd before calling the original `super` method to actually add the element to the list.
    *   This reuses the core functionality of the superclass while modifying its behavior.

## Exploring different forms in a single object

*   An object of a subclass can be treated as an object of its superclass. This allows for writing generic, reusable functions.
*   **Example:** A function `addRandomNumber(ArrayList<Integer> list)` can accept both a regular `ArrayList` and our custom `OddArrayList`.
*   **Runtime Decision:** When a method like `list.add()` is called inside that function, Java determines **at runtime** which version of the method to execute based on the object's actual type.
    *   If `list` is an `OddArrayList`, the overridden `add()` method is called.
    *   If `list` is a regular `ArrayList`, the standard `add()` method is called.
*   This ability to use a common interface (`ArrayList`) to manipulate objects of different specific types (`ArrayList`, `OddArrayList`) is a core strength of runtime polymorphism.

## Accessing specific object forms with instanceof

*   Sometimes, you need to access methods or attributes that only exist in the more specific subclass.
*   **`instanceof` Operator:** This operator checks if an object is an instance of a particular class. It returns `true` or `false`.
*   **Casting:** If `instanceof` returns `true`, you can safely **cast** the object to its more specific type to access its unique functionality.
*   **Example:** The `addRandomNumber` function can be improved:
    1.  It checks `if (list instanceof ConditionArrayList)`.
    2.  If true, it casts `list` to a `ConditionArrayList`.
    3.  It can then access the `isEligible()` method, which is unique to the `ConditionArrayList`, to ensure a valid number is generated before adding it.
*   This allows you to write general code that can also handle specific cases in a safe, controlled way.
*   **Predicate:** A `Predicate` is an interface that represents a function taking one argument and returning a boolean. It's often used to pass conditions (like "is a number odd?" or "is a number positive?") as parameters.

## Writing flexible code with compile-time polymorphism

*   Compile-time polymorphism is achieved through **method overloading**.
*   **Method Overloading:** Creating multiple methods within the same class that have the **same name** but **different parameters**. The difference can be in the number of parameters or the type of parameters.
*   **How it Works:** The compiler decides which version of the method to call at **compile-time** based on the arguments provided in the method call.
*   **Example:** Overloading the `ConditionArrayList` constructor:
    *   One constructor takes just a `Predicate`.
    *   Another constructor takes a `Predicate` AND a `Collection` of initial numbers.
*   This provides users of the class with more flexibility in how they can create and interact with objects.

## Exploring how built-in Java classes use polymorphism

*   The standard Java library uses both types of polymorphism extensively.
*   **Compile-Time Polymorphism in `ArrayList`:**
    *   `ArrayList` has two `addAll()` methods (method overloading).
    *   `addAll(Collection c)` adds a collection to the end.
    *   `addAll(int index, Collection c)` adds a collection at a specific index.
*   **Runtime Polymorphism in `ArrayList`:**
    *   `ArrayList` extends `AbstractList`.
    *   `AbstractList` has an `add()` method that, by default, just throws an exception.
    *   This forces any concrete subclass like `ArrayList` to `@Override` the `add()` method with a real, working implementation. This is a common design pattern to ensure subclasses implement required functionality.
*   **Which is better?**
    *   Both are essential and serve different purposes.
    *   **Overloading (compile-time)** is for providing multiple ways to call a method with different inputs.
    *   **Overriding (runtime)** is for changing the behavior of a method within a class hierarchy.

## Challenge: Reduce complexity with polymorphism

*   **Task:** Create a `Contact` class that can be instantiated with different sets of information (e.g., name/phone, name/email, or all three).
*   **Goal:** Use polymorphism to reduce complexity for the user creating the contacts.

## Solution: Reduce complexity with polymorphism

*   **Compile-Time Polymorphism:** The solution uses **method overloading** for the `Contact` constructor to provide different ways to create a contact.
    *   An issue arises when two constructors have the same parameter types (`(String name, String phone)` and `(String name, String email)`), as the compiler can't tell them apart.
    *   This is resolved by creating a separate `PhoneNumber` class, which changes the signature of one constructor to `(String name, PhoneNumber phone)`. This also improves the design through encapsulation.
*   **Runtime Polymorphism:** The solution also uses **method overriding** by implementing the `toString()` method in both the `Contact` and `PhoneNumber` classes.
    *   This overrides the default `Object.toString()` behavior, providing a custom, meaningful string representation of the contact's data when printed to the console.

## Chapter Quiz

**Question 1 of 6**

What types of polymorphism does Java support?

*   **runtime and compile-time (Correct)**
*   static and non-static
*   public and private

**Question 2 of 6**

In Java, how does the use of the keyword @Override differ from super?

*   **@Override is used to override a superclass method, while super is used to access methods of the superclass. (Correct)**
*   @Override is used to call the methods of the superclass, while super is used to call the methods of the subclass.
*   @Override is used to create objects of the superclass, while super is used to call methods of the subclass.

**Question 3 of 6**

In general, how should you overload a method or constructor?

*   Use the same name and parameters but use the @Overload keyword.
*   **Use the same name but provide a different set of parameters. (Correct)**
*   Use a different name and a different set of parameters.

**Question 4 of 6**

Each of the different polymorphism types have their use cases, but which one is accomplished by overloading methods?

*   runtime
*   call-time
*   **compile-time (Correct)**

**Question 5 of 6**

You have a class that extends ArrayList and overrides the add method to only add odd elements. How can you fix the following function to always add, using the overloaded method, a random number?

```java
public static void addRandomNumber(ArrayList<Integer> list) {
     Random random = new Random();
     int n = random.nextInt(bound: 1000)
     list.add(n)
}
```

*   Use the add method you made specifically for your extended OddArrayList class.
*   **Test if the array has increased in size by 1 and roll another random number if it has not. (Correct)**
*   Change the random number random range to be from 0 to 999.

**Question 6 of 6**

Which statement best explains predicates in Java?

*   **They take in a value and return true or false. (Correct)**
*   They determine whether an integer is odd or even.
*   They override methods from an extended class.