package Exercise27_Enum;

public class Lab195_EnumLocators {
    public static void main(String[] args) {
        System.out.println(Locators.page_btn.GetLocator());
    }
}

enum Locators
{
    page_btn("#btn"),
    page_input("input");

    private String locator;

    Locators(String Locator)
    {
        this.locator = Locator;
    }

    public String GetLocator()
    {
        return this.locator;
    }
}
