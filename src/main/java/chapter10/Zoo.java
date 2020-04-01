package chapter10;

public class Zoo {
    public static void main(String[] args) {
        // Normal Output
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        // Polymorphism
        Animal sasha = new Dog();
        sasha.makeSound(); // prints woof
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound(); // prints "meow"
        ((Cat) sasha).scratch(); // type Casting
        feed(sasha);


    }

    public static void feed(Animal animal){                    // The instanceOf operator is used to
        if(animal instanceof Dog){                             // to determine if an object is an
            System.out.println("here's your dog food");        // instance of a certain class
        } else if(animal instanceof  Cat){
            System.out.println("Here's your cat food");
        }
    }
}
//   Polymorphism Key Points

/*
Type vs. Instance
 - an object can have a superclass type, and a subclass instance

 Access
 - Polymorphic objects can only access the methods of their type ( not their instance)
 - Casting is required in order to access the methods of their instance

 Overridden Methods
 - If a method is overridden by the subclass, th polymorphic object will execute the
 - overridden method at runtime
 */