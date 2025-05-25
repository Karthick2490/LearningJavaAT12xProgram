package Exercise8_IfCondition;

//Write a Java method that checks the strength of a password based on the following criteria:

//Weak:
//Length < 6 characters
//Medium:
//Length ≥ 6 but < 10 characters
//Strong:
//Length ≥ 10 characters
//Very Strong:
//Length ≥ 10 characters and
//Contains at least one digit (0-9)
//Contains at least one uppercase letter (A-Z)
//Contains at least one special character (!@#$%^&*)

import java.util.Scanner;

public class Lab076_PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";
        while(password.isEmpty()) {
            System.out.println("Enter a password to check its strength");
            password = scanner.nextLine();
            if(password.isEmpty())
            {
                System.out.println("Password cannot be empty!");
            }
            else {
                break;
            }
        }
        int length = password.length();
        if(length < 6)
        {
            System.out.println("Entered password is Weak");
        }
        else if(length >=6 && length < 10)
        {
            System.out.println("Entered password is Medium");
        }
        else if(password.matches(".*[0-9].*") && (password.matches(".*[A-Z].*"))
        && (password.matches(".*[!@#$%^&*.]*")))
        {
            System.out.println("Entered password is Very Strong");
        }
        else
        {
            System.out.println("Entered Password is Strong");
        }
    }
}
