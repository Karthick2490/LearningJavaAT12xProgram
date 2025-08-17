package Tasks.Assignments;

public class Task24_ArrayinReverseOrder {
    public static void main(String[] args) {
        int [] array = {6,5,4,3,2,1};
        for(int i = array.length - 1; i >= 0; i--)
        {
            System.out.println("Reversed Array Result: " + array[i]);
        }

        int [] inputArray = {5,4,3,2,1,0};
        int [] ReversedArray = new int [inputArray.length];

        for(int i = 0; i < inputArray.length; i++)
        {
            ReversedArray[i] = inputArray[inputArray.length - 1 - i];
        }
        System.out.print("[ ");
        for(int i = 0; i < ReversedArray.length ; i++)
        {
            System.out.print(ReversedArray[i]);

            if(i < ReversedArray.length -1)
            {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
}
