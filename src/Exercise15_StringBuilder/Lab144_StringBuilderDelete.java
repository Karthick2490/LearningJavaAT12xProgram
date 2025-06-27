package Exercise15_StringBuilder;

public class Lab144_StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Karthick249012");
        sb.delete(9,12);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Java Programming");
        sb1.replace(0,4,"C##");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2);
        sb2.insert(5, " Java");
        System.out.println(sb2);
        sb2.delete(5,11);
        System.out.println(sb2);
    }
}
