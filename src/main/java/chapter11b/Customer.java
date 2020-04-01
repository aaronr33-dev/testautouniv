package chapter11b;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setPrice(9.99);
    }
}

/*
  Interface Key Points

 Not for Instantiation
- Interfaces cannot be instantiated

Implement
- Interfaces are implemented ( not extended )

Abstract if not implemented
- Any class that implements an interface, must implement all of its methods
- or it must declared itself abstract

Abstract Methods
- Methods in an interface must be abstract ( no explicit declaration needed)
- or default
 */

//  A class can implement multiple interfaces
// public class Book implements Product, KindleItem {