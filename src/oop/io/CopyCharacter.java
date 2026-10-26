package oop.io;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class CopyCharacter {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("cputin.txt");
            out = new FileWriter("cput.txt");

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("Program finished");
    }
}
