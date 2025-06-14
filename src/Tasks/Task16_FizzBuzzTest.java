package Tasks;

public class Task16_FizzBuzzTest {
    public static void main(String[] args) {
        int number = 100;
        String output = fizzBuzzUsingSwitch(number);
        String builderOutput = fizzBuzzusingStringBuilder(number);
        String ternaryOutput = fizzbuzzusingTernaryOperator(number);
        System.out.println(ternaryOutput);
    }

    static String fizzBuzzUsingSwitch(int number)
    {
        String result = null;
        for(int i = 1; i <= number; i++)
        {
            result = switch (i % 15)
            {
                case 0 -> "FizzBuzz";
                case 3,6,9,12 -> "Fizz";
                case 5,10 -> "Buzz";
                default -> String.valueOf(i);
            };
            System.out.println(result);
        }
        return result;
    }

    static String fizzBuzzusingStringBuilder(int number)
    {
        StringBuilder output = new StringBuilder();
        for(int i = 1; i <=number; i++)
        {
            String result = switch (i % 15)
            {
                case 0 -> "FizzBuzz";
                case 3,6,9,12 -> "Fizz";
                case 5,10 -> "Buzz";
                default -> String.valueOf(i);
            };
            output.append(result).append("\n");
        }
        return output.toString();
    }

    static String fizzbuzzusingTernaryOperator(int number)
    {
        String result = (number % 15 == 0) ? "FizzBuzz" :(number % 3 ==0) ? "Fizz" : (number % 5 == 0) ? "Buzz" : String.valueOf(number);
        return result;
    }
    }

