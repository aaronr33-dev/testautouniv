package chapter11a;

/*
 Abstraction is defined as something that exists in theory
 but does not have a concrete existence. It defines a template
  for a class or method. It is not designed to be instantiated,
  but intended to be extended. "too abstract of a concept "
 */

public abstract class Shape {

    abstract double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }
}
