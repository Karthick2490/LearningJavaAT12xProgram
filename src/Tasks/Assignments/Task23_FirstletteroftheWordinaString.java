package Tasks.Assignments;

public class Task23_FirstletteroftheWordinaString {
    public static void main(String[] args) {
        String input = "This is a test Program in Java";
        String output = FirstLetter(input);
        System.out.println(output);
    }

    static String FirstLetter(String input)
    {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        String normalized = input.replaceAll("\s+", " ");
        String[] str = normalized.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length;i++)
        {
            if(!str[i].isEmpty()) {
                sb.append(str[i].charAt(0));
            }
        }
        return sb.toString();
    }
}
