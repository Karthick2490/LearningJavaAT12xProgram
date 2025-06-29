package Exercise16_Arrays;

public class Lab147_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {91,92,94,90,94,98};
        boolean [] isMarried = {true, true, true, false};

        System.out.println(marks.length);
        System.out.println(marks[1]);
        System.out.println(marks[4]);

        char c = 'A';
        String name = "Karthick";
        String [] splittedName = name.split("");
        System.out.println(splittedName[1]);
    }
}
