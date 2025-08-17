package Tasks.Assignments;

public class Task28_OddorEvennumbersinanArray {
    public static void main(String[] args) {
        int [] array = {2,3,4,5,6,7,8,9};
        System.out.print("Even numbers: ");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }

        System.out.print("Odd Numbers: ");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 != 0)
            {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }    }
}
