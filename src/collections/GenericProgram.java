package collections;

import java.util.*;

public class GenericProgram {
    public static void main(String[] args) {
        Point p1 = new Point(20,30);
        Point p2 = new Point(30,"Dan");
        System.out.println("p1 is " + p1 + "and p2 is" + p2);
        Point<Integer> p3 = new Point<Integer>(20,40);
        Point<Double> p4 = new Point<Double>(20.3,10.8);
        Point<String> joint = new Point<String>("Dan","Christian");

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        for(int i:nums) {
            //System.out.println(i);
        }
        List<String> districts = new Stack<String>();
        districts.add("Gasabo");
        districts.add("Kicukiro");
        districts.add("Nyabihu");
        districts.add("Musanze");
        districts.add("Muhanga");
        for(String s:districts) {
            //System.out.println(s);
        }
        //System.out.println(districts.getLast());
        //System.out.println(districts.get(0));
        for(int i = districts.size() - 1;i >= 0;i--) {
            //System.out.println(districts.get(i));
        }
        Set<String> ds = new TreeSet<>();
        ds.add("Gasabo");
        ds.add("Kicukiro");
        ds.add("Nyarugenge");
        ds.add("Nyabihu");
        ds.add("Gasabo");
        ds.add("Abana");
        ds.add("Bugesera");
       for(String s:ds) {
           System.out.println(s);
       }
    }
}
