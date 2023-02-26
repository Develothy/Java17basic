package basic.study.chapter12;

import basic.study.chapter11.Human;

public class Theif extends Human {

    String item;
    int star;

    public Theif(int age, String name, String item, int star) {
        super(age, name);
        this.item = item;
        this.star = star;
    }

    public void intro() {
        System.out.println(item + " 전문 털이범 전과 " + star + "범입니다.");
    }
}
