package Exercise15_StringBuilder;

public class Lab143_StringBufferandBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Karthick");
        sb.append(" Udayakumar");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Karthick");
        sb1.append(" is Distracted");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Karthick");
        sb2.append( 2490);
        System.out.println(sb2);
    }
}
