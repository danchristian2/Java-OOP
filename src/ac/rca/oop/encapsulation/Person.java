package ac.rca.oop.encapsulation;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(){}

    public Person(String firstName,String lastName,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(int age, String firstName,String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName,int age,String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int a) {
        this.age = a;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
//an encapsulated class.
