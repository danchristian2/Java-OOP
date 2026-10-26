package ac.rca.oop.exception;

class ThrowDemo {
   public static void main(String[] args) {
       int age = 18;
       try {
           if (age < 20) {
               throw new IllegalArgumentException("Invalid age");
           }
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       System.out.println("My name");
   }
}
