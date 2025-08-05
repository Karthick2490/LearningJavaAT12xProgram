package Exercise29_Exceptions;

public class Lab216_CustomExceptionExamples {
    public static void main(String[] args) {
        ValidateAgeforVoting(27);
        ValidateAgeforVoting(11);
    }

    static void ValidateAgeforVoting(Integer age)
    {
        if(age < 18)
        {
            try {
                throw new Exception(("You are not allowed to Vote"));
            } catch (Exception e) {
                System.out.println(e.getMessage());            }
        }
        else {
            System.out.println("You are allowed to Vote. Enjoy");
        }
    }
}
