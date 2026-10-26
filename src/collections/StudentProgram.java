package collections;

import java.util.*;
import java.util.Iterator;
public class StudentProgram {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(227, "Melanin", "ndikubwimana", "mel@gmail.com", 15));
        students.add(new Student(227, "Melanin", "ndikubwimana", "mel@gmail.com", 15));
        students.add(new Student(227, "Melanin", "ndikubwimana", "mel@gmail.com", 15));
        // end of melanin duplicate
        Student s1 = new Student(249, "John", "Mugisha", "jmugisha@gmail.com", 19);
        Student s2 = new Student(250,"John","Augabo","jmugisha@gmail.com",19);
        Student s3 = new Student(249,"John","Gasana","muneza@gmail.com",19);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("List of Students " + students.size());
        //Collections.sort(students);
        Student s4 =  new Student(303,"clever","Manzi","cmanzi@gmail.com",12);
        Student s5 = new Student(303,"clever","Manzi","cmanzi@gmail.com",12);
        //List<Student> others = new ArrayList<>();
        //others.add(s4);
        //others.add(s5);
        //students.addAll(2,others);
        students.addAll(Arrays.asList(s4,s5));
//        Collections.sort(students);
        Set<Student>sts = new TreeSet<>();
        sts.addAll(students);
//        Collections.sort(sts);
        //for(Student s:students) {
          //  System.out.println(s);
        //}
        sts.forEach(e->{
            System.out.println(e);
        });
//        Iterator<Student> studentIterator = students.iterator();
//
//        while (studentIterator.hasNext()) {
//            System.out.println(studentIterator.next());
//        }
        HashMap map = new HashMap();
        map.put("message","hello");
        map.put("count",123);
        int count = (Integer) map.get("count");
        //here you cast because in hashmap object declaration you didn't put the data types.
        System.out.println(count);
    }
}
