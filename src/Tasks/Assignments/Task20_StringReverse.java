package Tasks.Assignments;

public class Task20_StringReverse {
    public static void main(String[] args) {
        String input = "Programming";
        String reversedString = "";
        for(int i = input.length() - 1; i >= 0; i--)
        {
            reversedString += input.charAt(i);
        }
        System.out.println("Original String is : " + input);
        System.out.println("Reversed String is : " +reversedString);

        StringBuilder sb = new StringBuilder("Udayakumar");
        String reversesbString = sb.reverse().toString();
        System.out.println("Reversed String using String Buffer: " +reversesbString);

    }
}
