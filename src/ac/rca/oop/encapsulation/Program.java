package ac.rca.oop.encapsulation;

import ac.rca.oop.inheritance.Student;

public class Program {
    public static int value = 10;
    public int value2 = 30;
    public int addition(int a,int b) {
        return a + value;
    }
    public static int addition(int a,int b,int c){
        return a + b + c;
    }
    public static void main(String[] args) {

        // Using the no-argument constructor
        Laptop laptop1 = new Laptop();

        // Using setters to set the values
        laptop1.setSerialNumber(15);
        laptop1.setManufacturer("HP");
        laptop1.setModel("ProBook");
        laptop1.setManufacturedYear(2025);

        // Using the parameterized constructor
        Laptop laptop2 = new Laptop(
                201,
                "Lenovo",
                "ThinkBook",
                2025
        );
        //System.out.println(value);
        //System.out.println(addition(1,2,3));
        Program pr1 = new Program();
        System.out.println(pr1.value2);
        System.out.println(pr1.addition(2,6));
        }
    }