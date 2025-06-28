package JavaAdditionalExercises;

public class StringBuilder_Delete_DeleteCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345678");
        sb.delete(4,7);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("JavaisGreat");
        sb1.deleteCharAt(5);
        System.out.println(sb1);

    }
}
