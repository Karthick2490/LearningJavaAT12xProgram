package Tasks.Assignments;

public class Task22_CountWordsinStrings {
    public static void main(String[] args) {
        String input = "Java is a programming language";
        int result = WordCount(input);
        System.out.println("Word Count: " +result);
    }

    static int WordCount(String input)
    {
        input.replaceAll("\s+", " ");
        String [] words = input.split(" ");
        return words.length;
    }
}
