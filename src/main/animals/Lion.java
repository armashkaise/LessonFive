package main.animals;

public class Lion extends Mammal {
    public Lion(int countLegs, boolean horns) {
        super(countLegs, horns);
    }

    @Override
    public void go() {//идти
        System.out.println("Lion go");
    }

    @Override
    public void hunt() {//охотиться
        System.out.println("Lion hunting");
    }

    @Override
    public void breathe() {//дышать
        System.out.println("Lion breathe");
    }

    @Override
    public void shout() {//кричать
        System.out.println("Lion shout");
    }

    @Override
    public void eat() {//кушать
        System.out.println("Lion eat");
    }

    @Override
    public void swim() {//плавать
        System.out.println("Lion swim");
    }

}
