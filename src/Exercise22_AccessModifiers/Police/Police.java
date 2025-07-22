package Exercise22_AccessModifiers.Police;

public class Police {
    private int gun;
    String Icard;

    public Police(int gun)
    {
        this.gun = gun;
    }

    protected void CanIShoot()
    {
        System.out.println("You can shoot");
    }
}
