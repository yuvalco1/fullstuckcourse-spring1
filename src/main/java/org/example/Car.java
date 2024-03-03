package org.example;

public class Car {

    public Car(Engine engine) {
        this.engine = engine;
    }

    Engine engine;

    public void go(){
        engine.run();
        System.out.println("I am going");
}

}
