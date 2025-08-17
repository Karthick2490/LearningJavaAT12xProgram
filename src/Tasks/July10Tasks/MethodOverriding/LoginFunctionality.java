package Tasks.July10Tasks.MethodOverriding;

public class LoginFunctionality {
    public static void main(String[] args) {
        User user = new User();
        user.login();
        User Adminuser = new AdminUser();
        Adminuser.login();
        User Regularuser = new RegularUser();
        Regularuser.login();
    }
}

class User
{
    public void login()
    {
        System.out.println("User Login");
    }
}

class AdminUser extends User
{
    @Override
    public void login() {
        System.out.println("Admin User Login");
    }
}

class RegularUser extends User
{
    @Override
    public void login() {
        System.out.println("Regular User Login");
    }
}