package Tasks.June18Tasks;

public class Tableof5 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Multiplication Table of " + number);
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }
    }
}
