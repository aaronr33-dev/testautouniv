package chapter12b;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        //setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //System.out.println(fruit.size());   // return 4 . does not store duplicates
        //System.out.println(fruit); // [banana, orange, apple, lemon]  random order

       var i =  fruit.iterator();
       while(i.hasNext()){
           System.out.println(i.next());

       }
       for(String item: fruit){
           System.out.println(item);
       }

       fruit.forEach(x -> System.out.println(x));
       // OR
       fruit.forEach(System.out::println);
    }
    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); // banana
        System.out.println(fruit.size()); // 5
        System.out.println(fruit); // [apple, lemon, banan, orange, lemon]  // prints out in order FIFO
    }
    public static void queueDemo(){
        List fruit = new LinkedList();  // Queues FIFO
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
    }
    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach( (k,v) -> System.out.println("fruit: " + k + ", Calories " + v));
    }
}
