package Exercise29_Exceptions;

public class Lab214_CustomException {
        private String Currency;
        private Integer Salary;

    public Lab214_CustomException(String currency, Integer salary) {
        Currency = currency;
        Salary = salary;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public Integer Add(Lab214_CustomException bankName)
    {
        if(bankName.Currency.equalsIgnoreCase(("INR")))
        {
            return bankName.Salary + this.Salary;
        }
        else {
            try {
                throw new CustomException("Currency Mismatch Exception - Custom Exception");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CustomException extends Exception
{
    CustomException(String msg)
    {
        super(msg); // Calling parent constructor [Exception Class]
    }
}