package Tasks.Assignments;

public class Task25_PrintLargestElementinanArray {
    public static void main(String[] args) {
        int [] array = {5,88,9,33,44,99,101};
        int largest = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
            }
        }
        System.out.println("Largest Number is : " +largest);
    }
}
