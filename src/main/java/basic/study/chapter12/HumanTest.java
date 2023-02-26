package basic.study.chapter12;

import basic.study.chapter11.Human;
import basic.study.chapter11.Student;

public class HumanTest {

    public static void main(String[] args) {
        Human lee = new Human(29, "이우림");
        Student roro = new Student(42, "로로", 950403, "레진");

        introHuman(lee);
        introHuman(roro);

    }

    static void introHuman(Human who) {
        who.intro();
    }
}
