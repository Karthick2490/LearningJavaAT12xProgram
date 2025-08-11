package Tasks.Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        CommontoAll commontoAll = new CommontoAll();
        commontoAll.CommontoAllTestCase();
    }

    public static class BaseClass
    {
        public void Setup()
        {
            System.out.println("Initialize the browser");
        }
    }

    public static class LoginTest extends BaseClass
    {
        public void LoginTest()
        {
            Setup();
            System.out.println("Test the login functionality");
        }
    }

    public static class CommontoAll extends LoginTest
    {
        public void CommontoAllTestCase()
        {
            LoginTest();
            System.out.println("Common test Execution!");
        }

    }
}
