package Exercise23_SuperKeyword;

public class Lab181_SuperKeyword_Method {
}

class Father
{
    void Home()
    {
        System.out.println("3 BHK Home");
    }

    int gold = 10;
}

class Son extends  Father{

    void car()
    {

    }
    void sonHome()
    {
        super.Home();
        System.out.println(super.gold);;
        this.car(); //access method within the class using this keyword refers tp current instance of the class
    }
}
