package Tasks.Inheritance;

public class SingleInheritance {

    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.login();
    }

    public static class BaseTest
    {
        public void Setup()
        {
            System.out.println("Initialize and Set up the tests");
        }
    }

    public static class LoginTest extends BaseTest
    {
        public void login()
        {
            Setup();
            System.out.println("Test Login Functionality");
        }
    }
}
