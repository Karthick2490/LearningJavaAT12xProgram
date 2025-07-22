package Exercise20_Polymorphism.MethodOverriding;

public class Lab175_MethodOverriding {
    public static void main(String[] args) {
        Karthick karthick = new Karthick();
        karthick.Garden();
        karthick.Home();

        Father father = new Father();
        father.Home();

        Father dispatch = new Karthick();
        dispatch.Home();
    }
}
