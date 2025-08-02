package Exercise26_Static;

public class Lab192_Static_Automation {
    public static void main(String[] args) {
        Automation automation = new Automation();
        Automation.driver = "Chrome";
        System.out.println(Automation.driver);
        Automation.driver2 = "FireFox";
        System.out.println(Automation.driver2);
        Automation.driver2 = "Safari";
        System.out.println(Automation.driver2);
    }
}

class Automation
{
    static String driver;
    static String driver2;
}
