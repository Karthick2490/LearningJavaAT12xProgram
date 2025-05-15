package Exercise2_JavaBasics_Part2;

public class Lab019_JavaInterview_QnA {
    public static void main(String[] args) {
        int _2 = 90; //_2 is a valid identifier
        //identifier starts with _ or $
        int $2 = 80;
        System.out.println(_2);
        System.out.println($2);

        // int enum = 2; Not Valid as enum is keyword which cannot be used as a identifier
        int Enum = 79; //this is a valid identifier
        int Karthick$Udayakumar = 35; //Valid Identifier
        System.out.println(Enum);
        System.out.println(Karthick$Udayakumar);
    }

}
