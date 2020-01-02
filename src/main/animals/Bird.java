package main.animals;

public class Bird extends Animal {
    public Bird(boolean wings) {
        this.wings = wings;
    }

    private boolean wings;//крылья

    public void fly(){

    }

    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
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
