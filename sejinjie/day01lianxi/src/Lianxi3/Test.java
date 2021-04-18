package Lianxi3;

public class Test {
    public static void main(String[] args) {
        Catapult c=new Catapult();
        Bird b=new BlackBird();
        c.launch(b);
        b=new BlueBird();
        c.launch(b);
        b=new YellowBird();
        c.launch(b);
    }
}
