package Animals;

import java.util.Objects;

public class Cat extends Mammal implements Animals {
    String name;
    int age;

    public Cat(int countLegs, boolean horns, String name, int age) {
        super(countLegs, horns);
        this.name = name;
        this.age = age;
    }

    @Override
    public void breathe() {//дышать
        System.out.println("Cat breathe");
    }

    @Override
    public void shout() {//кричать
        System.out.println("Cat мяу");
    }

    @Override
    public void eat() {//кушать
        System.out.println("Cat eat");
    }

    @Override
    public void swim() {//плавать
        System.out.println("Cat swim");
    }

    @Override
    public void go() {//идти
        System.out.println("go");
    }

    @Override
    public void hunting() {//охотиться
        System.out.println("hunting");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", countLegs=" + countLegs +
                ", horns=" + horns +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
