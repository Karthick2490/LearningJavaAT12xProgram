package Exercise32_Collections.List;

import java.util.*;
import java.util.Scanner;

public class Lab230_ArrayList_ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> Names = new ArrayList<>();
        String ContinueInput = "Y";
        while(ContinueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String name = scanner.next();
            Names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to add a name: Y/N");
            ContinueInput = scanner.nextLine();
        }

        for(String name : Names)
            System.out.println(name);

        scanner.close();
    }
}
