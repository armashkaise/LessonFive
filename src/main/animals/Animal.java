package main.animals;

abstract class Animal {

    private boolean alive;

    public Animal(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    abstract public void breathe();//дышать
    abstract public void eat();//кушать
}
