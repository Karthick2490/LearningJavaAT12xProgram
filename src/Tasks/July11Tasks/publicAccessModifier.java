package Tasks.July11Tasks;

public class publicAccessModifier {
    public static void main(String[] args) {
        StudentPublic studentPublic = new StudentPublic();
        studentPublic.showInfo();
    }
}

class StudentPublic
{
    void showInfo()
    {
        System.out.println("Public Access: Student Info");
    }
}
