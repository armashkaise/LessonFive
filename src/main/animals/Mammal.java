package main.animals;
// млекопитающие
public class Mammal extends Animal {
    private int countLegs; //количество ног
    private boolean horns;//рога

    public Mammal(int countLegs, boolean horns) {
        this.countLegs = countLegs;
        this.horns = horns;
    }

    public void go(){

    }//идти

    public void hunt(){

    }//охотиться

    public int getCountLegs() {
        return countLegs;
    }

    public void setCountLegs(int countLegs) {
        this.countLegs = countLegs;
    }

    public boolean isHorns() {
        return horns;
    }

    public void setHorns(boolean horns) {
        this.horns = horns;
    }

    @Override
    public void breathe() {

    }

    @Override
    public void shout() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
