package Tasks.Assignments;

public class Task21_StringReversal_Recursive {
    public static void main(String[] args) {
        String input = "Program";
        String reversed = stringReverse(input);
        System.out.println(reversed);
    }

    static String stringReverse(String input)
    {
        if(input.isBlank() || input.length() ==1)
        {
            return input;
        }
        return input.charAt(input.length()-1) + stringReverse(input.substring(0, input.length()-1));
    }
}
