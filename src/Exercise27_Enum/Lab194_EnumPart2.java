package Exercise27_Enum;

public class Lab194_EnumPart2 {
    public static void main(String[] args) {
        if(URLs.Google.name().equals("Google"))
        {
            System.out.println("Google.com");
        }
    }
}
enum URLs
{
    Google, Katalon, Amazon
}
