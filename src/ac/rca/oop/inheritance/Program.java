package ac.rca.oop.inheritance;

import ac.rca.oop.encapsulation.Person;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Student("Dan","Christian",18,"RCA","SPE","L4");
        Student s1 = (Student)p1;
    }
}
