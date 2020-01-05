package main.animals;

public abstract class Bird extends Animal{

    private boolean wings;//крылья

    public Bird(boolean alive, boolean wings) {
        super(alive);
        this.wings = wings;
    }

    public abstract void fly();

    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }


}
