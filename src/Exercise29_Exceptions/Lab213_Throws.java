package Exercise29_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab213_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader(new File("C://log.txt"));
    }
}
