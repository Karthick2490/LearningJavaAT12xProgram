package Exercise13_Functions;

public class Lab129_UserDefinedFunctions {
    public static void main(String[] args) {
        noargumentsnoreturntypes();
        Argumentswithnoreturntypes("Karthick");
        ArgumentsandReturnType("Karthick", "Udayakumar");
        int result = NoargumentswithReturnType();
    }
    //Function with no arguments and no return types
    static void noargumentsnoreturntypes()
    {
        System.out.println("No Arguments and no Return Types");
    }

    //Function with arguments and no return types
    static void Argumentswithnoreturntypes(String Name)
    {
        System.out.println(Name);
    }

    //Function with no arguments and return type
    static int NoargumentswithReturnType()
    {
        return 12;
    }

    //Function with Arguments and Return Type
    static String ArgumentsandReturnType(String FirstName, String LastName)
    {
        return FirstName.concat(LastName);
    }
}
