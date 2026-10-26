
package excel;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("students.xlsx");

        if (file.exists()) {
            System.out.println("Excel file found!");
        } else {
            System.out.println("Excel file not found!");
        }
    }
}
    