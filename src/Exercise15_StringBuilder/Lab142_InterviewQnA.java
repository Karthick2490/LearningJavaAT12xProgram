package Exercise15_StringBuilder;

public class Lab142_InterviewQnA {

    public static void main(String[] args) {
        String name = "Programming";
        String reverse = "";
        int length = name.length();
        for(int i = length-1;i>=0;i--)
        {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);

        String builder = "Karthick";
        StringBuilder sb = new StringBuilder(builder);
        sb.reverse();
        System.out.println(sb);
    }
}
