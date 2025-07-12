package Exercise19_Inheritance.RealTime;

public class Lab172_MainClass_SingleInheritance {
    public static void main(String[] args) {
        TestCase1 TC1 = new TestCase1();
        TC1.LaunchBrowser();
        TC1.CloseBrowser();

        TestCase2 TC2 = new TestCase2();
        TC2.LaunchBrowser();
        TC2.CloseBrowser();
    }
}
