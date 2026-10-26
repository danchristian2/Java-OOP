package oop.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args) throws IOException {
        try{
            FileOutputStream file = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            Student s1 = new Student(101,"Jane","Mugisha",17);
            out.writeObject(s1);
            Student s2 = new Student(202,"Dan","Christian",11);
            out.writeObject(s2);
            file.close();
            out.close();
        }catch(IOException e) {
            System.out.println("Exception" + e.toString());
        }
    }
}
