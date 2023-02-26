package basic.study.chapter12;

import basic.study.chapter11.Human;

public class Soldier extends Human {
    int milnum;

    Soldier(int age, String name, int milnum) {
        super(age, name);
        this.milnum = milnum;
    }

    public void intro() {
        System.out.println("충성충성! 군번: " + milnum + "입니다.");
    }
}
