package ac.rca.oop.inheritance;

import ac.rca.oop.encapsulation.Person;

public class Student extends Person {
    private String school;
    private String combination;
    private String level;

    public Student(String firstName,String lastName,int age,String school, String combination, String level) {
        super(firstName, lastName, age);
        this.school = school;
        this.combination = combination;
        this.level = level;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public int getAge() {
        return 17;
    }
    @Override
    public String toString() {
        return "FirstName:" + this.getFirstName() + "Lastname:" + this.getLastName() +
                "school='" + school + '\'' +
                ", AGE='" + this.getAge() + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
