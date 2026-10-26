package ac.rca.oop.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
        int [] scores = new int[3];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 40;
        try {
            int c = scores[1];
            System.out.println("The result is " + c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("After running");
        }
    }
}

