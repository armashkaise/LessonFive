package main.animals;

public interface Shoutable {//может говорить
    String shout();

    default void someMethod(){

    }
}
