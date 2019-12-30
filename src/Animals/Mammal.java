package Animals;
// млекопитающие
abstract public class Mammal {
    int countLegs; //количество ног
    boolean horns;//рога

    public Mammal(int countLegs, boolean horns) {
        this.countLegs = countLegs;
        this.horns = horns;
    }

    public abstract void go();//идти

    public abstract void hunting();//охотиться

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
