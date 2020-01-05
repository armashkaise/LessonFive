package main.animals;
// млекопитающие
abstract public class Mammal extends Animal {
    private int countLegs; //количество ног
    private boolean horns;//рога

    public Mammal(boolean alive, int countLegs, boolean horns) {
        super(alive);
        this.countLegs = countLegs;
        this.horns = horns;
    }

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








}
