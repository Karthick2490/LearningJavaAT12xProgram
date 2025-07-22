package Exercise22_AccessModifiers.Theif;

import Exercise22_AccessModifiers.Police.Police;

public class Theif {
    public static void main(String[] args) {
        Police police = new Police(1);
        //System.out.println(police.gun); public to private
        //police.CanIShoot(); private method
    }
}
