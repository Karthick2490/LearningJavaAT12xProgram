package Exercise9_Switch;

public class Lab087_InterviewQnA4 {
    public static void main(String[] args) {
        int itemcode = 001;
        switch(itemcode)
        {
            case 001,002,003 -> System.out.println("Case 1 Passed");
            case 004,005,006 -> System.out.println("Case 2 Passed");
            default -> System.out.println("Default Value");
        }
    }
}
