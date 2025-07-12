package Exercise19_Inheritance;

public class Lab171_SingleInheritance {
    public static void main(String[] args) {
        Lab_SonClass karthick = new Lab_SonClass();
        karthick.bhk3();
        karthick.bhk2();
        System.out.println(karthick.gold);

        Lab_NonBloodRelative cousin = new Lab_NonBloodRelative();
        cousin.BHK3(); //Cannot access Father or son class
    }

}
