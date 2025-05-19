package Exercise4_JavaOperators;

public class Lab035_LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(!!a);

        boolean b = false;

        boolean c = a && b ;
        System.out.println(c);

        boolean c1 = !a && b;
        System.out.println(c1);

        boolean c2 = a && !b;
        System.out.println(c2);

        boolean c3 = a || b;
        System.out.println(c3);

        boolean c4 = !a || b;
        System.out.println(c4);

        boolean result = false || true;
        System.out.println(result);

        //Only condition for OR operator to be false is false & false
        //Only condition for AND operator to be true is true and trues
    }

}
