package Tasks.July9Tasks;

public class MultilevelLoginSystem {
    public static void main(String[] args) {
        superAdmin superAdmin = new superAdmin();
        superAdmin.MethodLogin();
        superAdmin.AccessAdminPanel();
        superAdmin.MethodLogin();
    }
}

class User
{
    public void MethodLogin()
    {
        System.out.println("Login into Application");
    }
}

class AdminUser extends User
{
    public void AccessAdminPanel()
    {
        System.out.println("Admin Panel Method");
    }
}

class superAdmin extends AdminUser
{
    public void ShutDownSystem()
    {
        System.out.println("Shut down the system!");
    }
}
