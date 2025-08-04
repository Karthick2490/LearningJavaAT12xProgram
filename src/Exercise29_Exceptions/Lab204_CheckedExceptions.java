package Exercise29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab204_CheckedExceptions {
    public static void main(String[] args) {
        //Checked Exceptions - Jvm will know about the exceptions
        try {
            FileInputStream File = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());        }
        //java.io.FileNotFoundException
    }
}
