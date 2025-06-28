package JavaAdditionalExercises;

public class StringBuilder_Replace_Reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I Like Java");
        sb.replace(7,12,"Python");
        System.out.println(sb);

        StringBuilder palindrome = new StringBuilder("madam");
        System.out.println(palindrome.toString().equals((palindrome.reverse().toString())));
    }
}
