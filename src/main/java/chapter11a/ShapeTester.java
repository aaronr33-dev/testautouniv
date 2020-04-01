package chapter11a;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();;
        System.out.println(rectangle.calculateArea());

    }
}

/*  Abstraction Key Point

Templates
- Abstract classes and method are declared templates that are meant
to be implement by their subclasses

Reserved Word
- Classes and method are declared abstract by using the abstract keyword

Implementation Required on Inheritance
- If ia subclass extends from an abstract class, it must implement
- its abstract method or be declared abstract itself

Abstract Classes
-  Abstract classes cannot be instantiated. It is only to be used
- as a superclass. If even one method in a class is abstract, the
- class must be abstract as well

 */
