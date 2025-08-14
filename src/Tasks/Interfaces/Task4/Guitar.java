package Tasks.Interfaces.Task4;

interface Playable{
    void play();
}
class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable
{
    @Override
    public void play(){
        System.out.println("Playing Piano");
    }
}

class main
{
    public static void main(String[] args) {
        Playable playable1 = new Piano();
        Playable playable = new Guitar();

        playable1.play();
        playable.play();
    }
}
