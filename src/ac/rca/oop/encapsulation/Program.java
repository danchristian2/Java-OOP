package ac.rca.oop.encapsulation;

import ac.rca.oop.inheritance.Student;

public class Program {

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

        System.out.println(laptop1);
        System.out.println(laptop2);
        Student s1 = new Student("Dan","Christian",12,"RCA","SPE","l4");
        System.out.println(s1);
        Person p2 = new Person("Dan","Iradukunda",15);
        System.out.println(p2);
        Person p3 = new Student("Jack","Rosa",11,"RCA","SPE","l8");
        System.out.println(p3);
        Object s5 = new Student("Amanda","Ishimwe",12,"RCA","SDE","l8");
        System.out.println(s5);
    }
}