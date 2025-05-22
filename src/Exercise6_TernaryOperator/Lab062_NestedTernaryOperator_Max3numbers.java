package Exercise6_TernaryOperator;

public class Lab062_NestedTernaryOperator_Max3numbers {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 18;
        int n3 = 34;
        int result = n1>n2 ? (n1>n3) ? n1 : n3: ((n2>n3) ? n2 : n3);
        System.out.println(result);
    }
}
