package Tasks;

public class Task5_JavaOperators {
    public static void main(String[] args) {
        //Task 3

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;
        //Logic
        //i = 1 i-- = 0
        //j = 2 j-- = 1
        //k = 3 k-- = 2
        //m=-4


        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
