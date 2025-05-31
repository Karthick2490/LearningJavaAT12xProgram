package Exercise10_ForLoop;

import java.util.Scanner;

public class Lab107_FibbonaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a upper limit to generate fibonacci series");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Valid number");
        }
        int number = scanner.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Fibbonaci Series -> " + a + "," + b);
        for(int i = 0; i <=number; i++)
        {
            c= a+b;
            System.out.print(", " +c);
            a=b;
            b=c;
        }
    }
}
