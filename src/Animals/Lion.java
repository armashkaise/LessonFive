package Animals;

public class Lion extends Mammal implements Animals {
    public Lion(int countLegs, boolean horns) {
        super(countLegs, horns);
    }

    @Override
    public void go() {//идти
        System.out.println("Lion go");
    }

    @Override
    public void hunting() {//охотиться
        System.out.println("Lion hunting");
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
    public String toString() {
        return "Lion{" +
                "countLegs=" + countLegs +
                ", horns=" + horns +
                '}';
    }


}
