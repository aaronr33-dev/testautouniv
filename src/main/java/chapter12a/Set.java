package chapter12a;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());   // return 4 . does not store duplicates
        System.out.println(fruit); // [banana, orange, apple, lemon]  random order

    }
}
