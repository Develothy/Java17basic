package basic.study.chapter11;

import basic.study.chapter11.Car;

public class Truck extends Car {

    int ton;

    public Truck(String name, int ton) {
        super(name, false);
        this.ton = ton;
    }

    void load() {
        System.out.println("짐을 싣는다.");
    }

}
