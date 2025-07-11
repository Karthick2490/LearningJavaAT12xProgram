package Exercise17_OOPs;

public class Lab163_ClasswithinClass {
    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.name = "Karthick";
    }
}
class Profile
{
    String name;
    int age;
    void speak(){};
}
