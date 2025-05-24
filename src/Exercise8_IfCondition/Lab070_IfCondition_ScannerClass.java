package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab070_IfCondition_ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if(age>6)
        {
            System.out.println("You can join the school");
        }
        else
        {
            System.out.println("You cannot join the school");
        }
    }
}
