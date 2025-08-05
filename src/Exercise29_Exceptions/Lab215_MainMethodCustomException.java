package Exercise29_Exceptions;

public class Lab215_MainMethodCustomException {
    public static void main(String[] args) {
        Lab214_CustomException SBI = new Lab214_CustomException("INR", 100);
        Lab214_CustomException ICICI = new Lab214_CustomException("INR", 100);
        Integer total = SBI.Add(ICICI);
        System.out.println(total);

        Lab214_CustomException JPMorgan = new Lab214_CustomException("USD", 120);
        Integer totalwithUSD = SBI.Add(JPMorgan);
        System.out.println(totalwithUSD);
    }
}
