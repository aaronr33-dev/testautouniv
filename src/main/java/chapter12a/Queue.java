package chapter12a;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList fruit = new LinkedList();  // Queues FIFO
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());  // 5
        System.out.println(fruit);  // [ apple, lemon, banana,orange, lemon

        fruit.remove();
        System.out.println(fruit);  // [lemon, banana, orange, lemon]
        System.out.println(fruit.peek()); // lemon
    }
}
