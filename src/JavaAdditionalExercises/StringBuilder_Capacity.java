package JavaAdditionalExercises;

public class StringBuilder_Capacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        for(int i = 0; i < 100; i++)
        {
            System.out.println(sb.append(i));
        }
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("Hello World");
        System.out.println(sb1.length());
        sb1.setLength(15);
        System.out.println("Char at 12: " + (int)sb1.charAt(12)); // 0

        sb1.setLength(5);
        System.out.println(sb1);
        sb1.append(" World");
        sb1.trimToSize();
        System.out.println(sb1);
        System.out.println("Capacity: " +sb1.capacity());

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.ensureCapacity(15);
        sb2.append("World");
        sb2.trimToSize();
        System.out.println(sb2.capacity());


    }
}
