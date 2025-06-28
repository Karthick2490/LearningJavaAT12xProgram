package JavaAdditionalExercises;

public class StringBuilder_CharAt_Indexof {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello karthick");
        System.out.println(sb.indexOf("K")); //-1 Not found
        System.out.println(sb.lastIndexOf("k"));
        sb.setCharAt(6, 'K');
        System.out.println(sb);
    }
}
