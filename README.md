# Polymorphism Example - Shapes

# Shapes Package

The `Shapes` package provides a basic demonstration of object-oriented principles in Java, particularly class extension and inheritance. This package includes the following classes:

- **Circle**: Represents a circle with a specified radius.
- **Rectangle**: Represents a rectangle with a given width and height.
- **Square**: Extends `Rectangle`, enforcing equal width and height.

## Understanding Class Extension in Java

In Java, inheritance allows a class to acquire properties and behaviors from another class. This is achieved using the `extends` keyword.

### Example in the Shapes Package

- `Square` extends `Rectangle`, meaning a square is a specialized form of a rectangle where the width and height are always equal.
- This demonstrates code reuse, as `Square` inherits methods from `Rectangle` without rewriting common functionality.

### Benefits of Inheritance

- **Code Reusability**: Shared attributes and methods reduce redundancy.
- **Maintainability**: Changes in the parent class automatically apply to subclasses.
- **Extensibility**: New features can be added to subclasses without modifying the parent class.

