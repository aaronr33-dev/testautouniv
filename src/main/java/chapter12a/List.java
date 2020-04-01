package chapter12a;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); // banana
        System.out.println(fruit.size()); // 5
        System.out.println(fruit); // [apple, lemon, banan, orange, lemon]  // prints out in order FIFO
    }
}
