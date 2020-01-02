package main.animals;

public class Dove extends Bird {//голубь

    public Dove(boolean wings) {
        super(wings);
    }

    @Override
    public void breathe() {//дышать
        System.out.println("Dove breathe");
    }

    @Override
    public void shout() {//кричать
        System.out.println("Dove shout");
    }

    @Override
    public void eat() {//кушать
        System.out.println("Dove eat");
    }

    @Override
    public void swim() {//плавать
        System.out.println("Dove swim");
    }

    @Override
    public void fly() {
        System.out.println("Dove fly");//летать
    }
}
