package basic.study.chapter23;

import java.util.function.BiFunction;

public class BiFunctionTest {

    public static void main(String[] args) {
        BiFunction<Integer, String, Human2> creator = Human2::new;
        Human2 lee = creator.apply(22,"이우림");
        System.out.println(lee.age + "세 " + lee.name);
    }
}

class Human2 {
    int age;
    String name;
    Human2(int age, String name) {
        this.age = age;
        this.name = name;
    }
}