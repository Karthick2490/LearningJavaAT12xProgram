package Tasks.Assignments;

public class Task26_SmallestNumberinanArrray {
    public static void main(String[] args) {
        int [] array = {3,5,66,4,1,67,99};
        int smallest = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < smallest)
            {
                smallest = array[i];
            }
        }
        System.out.println("Smallest Mumber is : " +smallest);
    }
}
