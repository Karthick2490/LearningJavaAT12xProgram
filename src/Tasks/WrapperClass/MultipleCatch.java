package Tasks.WrapperClass;

public class MultipleCatch {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 20};
        int index = 3;  // This will cause ArrayIndexOutOfBoundsException
        int divisor = 0;  // This will cause ArithmeticException if used

        try {
            // First operation that might throw ArrayIndexOutOfBoundsException
            System.out.println("Accessing array element: " + numbers[index]);

            // Second operation that might throw ArithmeticException
            int result = numbers[0] / divisor;
            System.out.println("Division result: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("General error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("This block always executes");
        }
    }
}

