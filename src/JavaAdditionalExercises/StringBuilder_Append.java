package JavaAdditionalExercises;

public class StringBuilder_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("-").append(1234).append("-").append(45.67).append("-").append('c').append("-").append(true);
        System.out.println(sb);

        //Append a SubArray
        char[] chars = {'a','b','c','d'};
        sb.append(chars,0,2);
        System.out.println(sb);
    }
}
