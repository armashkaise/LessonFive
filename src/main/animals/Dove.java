package main.animals;

public class Dove extends Bird implements Shoutable {//голубь


    public Dove(boolean alive, boolean wings) {
        super(alive, wings);
    }

    @Override
    public void breathe() {//дышать
        System.out.println("Dove breathe");
    }

    @Override
    public String shout() {
        return "Dove shout";
    }

    @Override
    public void eat() {//кушать
        System.out.println("Dove eat");
    }



    @Override
    public void fly() {
        System.out.println("Dove fly");//летать
    }
}
