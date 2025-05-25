package Tasks;

import java.util.Scanner;

public class Task8_GradeRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        switch(input)
        {
            case "A" -> System.out.println("Excellent");
            case "B" -> System.out.println("Very Good");
            case "C" -> System.out.println("Good");
            case "D" -> System.out.println("Needs Improvement");
            case "F" -> System.out.println("Fail");
            default -> System.out.println("Invalid Grade");
        }
    }
}
