package Exercise20_Polymorphism.MethodOverriding;

public class RealExample {

    public static void main(String[] args) {
        TC_Chrome tcChrome = new TC_Chrome();
        tcChrome.OpenBrowser();
    }
}

    class TC_CommontoAll{
        void OpenBrowser()
        {
            System.out.println("Opening the Chrome");
        }
    }

    class TC_Chrome extends TC_CommontoAll
    {
        @Override
        void OpenBrowser()
        {
            System.out.println("Starting a Chrome");
            //ChromeDriver driver = new ChromeDriver();
        }
    }
