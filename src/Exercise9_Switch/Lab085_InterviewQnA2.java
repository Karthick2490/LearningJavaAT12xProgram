package Exercise9_Switch;

public class Lab085_InterviewQnA2 {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch)
        {
            case 65 -> System.out.println("Matched ASCII");
            default -> System.out.println("Not Matched ASCII");
        }
    }
}
