package main.animals;

public class Lion extends Mammal implements Shoutable, CanRun, Defensible, CanHunt {
    public Lion(boolean alive, int countLegs, boolean horns) {
        super(alive, countLegs, horns);
    }

    @Override
    public String shout() {
        return "Рррррр";
    }

    @Override
    public void breathe() {//дышать
        System.out.println("Lion breathe");
    }

    @Override
    public void someMethod() {

    }

    @Override
    public void eat() {//кушать
        System.out.println("Lion eat");
    }

}
