package Animals;

abstract public class Bird {
    public Bird(boolean wings) {
        this.wings = wings;
    }

    boolean wings;//крылья

    abstract void fly();
}
