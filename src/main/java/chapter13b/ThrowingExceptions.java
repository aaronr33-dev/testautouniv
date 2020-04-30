package chapter13b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {
        //createNewFile();
        //numbersExceptionHandling();
        //createNewFileRethrow();
        divideByZero();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }
    public static void createNewFileRethrow() throws Exception{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void divideByZero(){
        try {
            int c = 30/0;
        } catch (ArithmeticException e) {
            System.out.println("Division is fun");
        }



    }
    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        try (Scanner fileReader = new Scanner(file)){
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException |InputMismatchException  e){
            e.printStackTrace();
        }
    }
}
