package Exercise15_StringBuilder;

public class Lab141_StringBuildervsStringBuffer {
    public static void main(String[] args) {
        String s0 = "Karthick";
        String s1 = new String("Karthick");

        StringBuilder stringBuilder = new StringBuilder(s0);
        StringBuffer stringBuffer = new StringBuffer(s1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());
        stringBuilder.append("Udayakumar");
        System.out.println(stringBuilder);
    }
}
