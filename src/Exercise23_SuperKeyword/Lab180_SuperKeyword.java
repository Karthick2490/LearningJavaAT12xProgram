package Exercise23_SuperKeyword;

public class Lab180_SuperKeyword {
}

class BaseClass
{
    private String Browser;

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser) {
        Browser = browser;
    }

    public BaseClass(String browser) {
        Browser = browser;
    }

    void openBrowser()
    {
        System.out.println("Opening the Browser");
    }

    void openBrowser(String BrowserName)
    {
        System.out.println("Opening the browser - Parameterized Constructor - Overloading");
    }

    void CloseBrowser()
    {
        System.out.println("Closing the browser");
    }
}

class TestCase extends BaseClass
{

    public TestCase(String browser) {
        super(browser);
        super.CloseBrowser();
        super.openBrowser();
        super.openBrowser("Chrome");
        super.getBrowser();
    }


}
