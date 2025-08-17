package Tasks.Assignments;

public class Task19_StringRemoveWhiteSpaces {
    public static void main(String[] args) {
        String input = "Karthick  Udayakumar";
        String removeWhiteSpacesString = IsRemoveWhiteSpaces(input);
        System.out.println(removeWhiteSpacesString);
    }

    static String IsRemoveWhiteSpaces(String input)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= input.length() - 1; i++)
        {
            if(!Character.isWhitespace(input.charAt(i)))
            {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
