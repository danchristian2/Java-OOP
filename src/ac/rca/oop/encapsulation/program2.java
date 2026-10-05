package ac.rca.oop.encapsulation;

public class program2 {
    public static void main(String[] args) {
        char c = 200;
        char c1 = 'A';
        short a = 10;
        Short b = 15;
        int myScore = 10;
        double d1 = 20;
        Double d2 = 25.0;
        Integer myScore2 = 20;
        int abc = c;
        short fgh = (short)myScore;
        String name1 = new String("Mary");
        String name2 = new String("Mary");
        String name3 = new String("John");
        String s4 = name2;
        System.out.println(myScore2.hashCode());
        if(name1 == name2) {
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }
        if (name1.equals(name2)) {
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }
        int[] scores = new int[5];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 22;
        int[] marks = {1,2,3,4};
    }
}
