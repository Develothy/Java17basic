package basic.study.chapter23;

import java.util.function.Predicate;

public class PredicateTest {
    static Human[] members = {
            new Human(21, "김김기"),
            new Human(25, "김라라"),
            new Human(14, "밴틀리"),
            new Human(66, "이순재"),
    };
    public static void main(String[] args) {

        Human lee = new Human(29, "이우림");
        Predicate<Human> isAdult = h -> h.age >= 19;
        System.out.println(isAdult.test(lee));

        listHuman("성인", h -> h.age >= 19);
        listHuman("김가", h -> h.name.startsWith("김"));
        listHuman("미성년 김가", h -> h.age >= 19 && h.name.startsWith("김"));

    }

    static void listHuman(String cap, Predicate<Human> pred) {
        System.out.println(cap + "인 사람 목록 : ");
        for (Human h : members) {
            if (pred.test(h)) {
                System.out.println(h.name + " ");
            }
        }
        System.out.println();
    }

}

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
