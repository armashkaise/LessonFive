package Animals;

public class Dove extends Bird implements Animals {//голубь

    public Dove(boolean wings) {
        super(wings);
    }

    @Override
    public void breathe() {//дышать
        System.out.println("breathe");
    }

    @Override
    public void shout() {//кричать
        System.out.println("shout");
    }

    @Override
    public void eat() {//кушать
        System.out.println("eat");
    }

    @Override
    public void swim() {//плавать
        System.out.println("swim");
    }

    @Override
    void fly() {
        System.out.println("fly");//летать
    }
}
