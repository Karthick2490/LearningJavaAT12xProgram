package Exercise29_Exceptions;

public class Lab201_Exceptions_Unchecked {
    public static void main(String[] args) {
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        String input = "Karthick";
        int a = Integer.parseInt(input); //java.lang.NumberFormatException.
        int b = 0;
        int c = 100/a; //java.lang.ArithmeticException


    }
}
