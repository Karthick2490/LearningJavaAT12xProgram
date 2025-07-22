package Exercise21_Encapsulation;

public class Lab176_Encapsulation {
    public static void main(String[] args) {
        Login login = new Login("admin", "Password");
        System.out.println(login.Password);
        login.Password = "123Admin";
        System.out.println(login.Password);

        encapsulatedLogin login1 = new encapsulatedLogin("admin", "Password");
        //login1.Password; Cannot be accessible as it is private

        System.out.println(login1.getUsername());
        login1.setUsername("Karthick");
        System.out.println(login1.getUsername());
        login1.setPassword("123London#", false);
        System.out.println(login1.getPassword());
        login1.setPassword("123Mumbai#", true);
        System.out.println(login1.getPassword());
    }
}

class Login {
    String UserName;
    String Password;

    public Login(String userName, String password) {
        UserName = userName;
        Password = password;
    }
}

class encapsulatedLogin
{
    private String Username;
    private String Password;

    public encapsulatedLogin(String username, String password) {
        Username = username;
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin)
        {
            Password = password;
        }
        else {
            System.out.println("You are not a admin!!");
        }
    }
}
