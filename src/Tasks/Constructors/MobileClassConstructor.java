package Tasks.Constructors;

import java.lang.classfile.instruction.BranchInstruction;

public class MobileClassConstructor {

    public static void main(String[] args) {
        Mobile mobile = new Mobile("OnePlus", 10000);
        mobile.DisplayPhoneDetails();
    }

    public static class Mobile
    {
        private String brand;
        private int Price;

        public Mobile(String brand)
        {
            this.brand = brand;
        }

        public Mobile(String brand, int Price)
        {
            this.brand = brand;
            this.Price = Price;
        }

        public void DisplayPhoneDetails()
        {
            System.out.println("Brand Name: " + brand);
            System.out.println("Price is :" + Price);
        }
    }
}
