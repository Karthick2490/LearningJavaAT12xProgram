package Exercise9_Switch;

import java.util.Scanner;

public class Lab083_BrowserSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");

        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch (browser)
        {
            case "chrome" -> System.out.println("Selected Browser is Chrome");
            case "edge" -> System.out.println("Selected Browser is edge");
            case "safari" -> System.out.println("Selected Browser is Safari");
            default -> System.out.println("Invalid Browser");
        }
    }
}
