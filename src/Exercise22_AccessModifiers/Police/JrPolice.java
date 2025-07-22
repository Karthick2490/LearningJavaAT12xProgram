package Exercise22_AccessModifiers.Police;

public class JrPolice {
    public static void main(String[] args) {
        Police police = new Police(1);
        police.CanIShoot(); //Protected - Can access methods within in the package

    }
}
