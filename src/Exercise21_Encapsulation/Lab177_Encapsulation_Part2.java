package Exercise21_Encapsulation;

import javax.management.MBeanAttributeInfo;

public class Lab177_Encapsulation_Part2 {
    public static void main(String[] args) {
        ICICIBank bank = new ICICIBank("Karthick", 10000);
        System.out.println(bank.getBalance());
        bank.setBalance(12000, false);
        System.out.println(bank.getBalance());
        bank.setBalance(12500, true);
        System.out.println(bank.getBalance());
    }
}

class ICICIBank
{
    private long balance;
    private String name;
    public String bank = "ICICI";

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean IsCashier) {
        if(IsCashier)
        {
            this.balance = balance;
        }
        else {
            System.out.println("Not a Cashier");
        }
    }
}


