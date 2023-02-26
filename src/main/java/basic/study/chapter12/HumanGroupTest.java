package basic.study.chapter12;

import basic.study.chapter11.Human;
import basic.study.chapter11.Student;

public class HumanGroupTest {

    public static void main(String[] args) {

        Human[] arHuman = {
                new Human(29, "이우림"),
                new Student(22, "로로", 20021212, "베이킹"),
                new Soldier(32, "손석구", 1234),
                new Theif(15, "홍길동", "부자집", 2),
                new Graduate(45, "한광식", 828282, "전산", "웹 보안에 대한 연구"),
        };

        dumpGroup(arHuman);
    }

    static void dumpGroup(Human[] group) {
        for (Human h : group) {
            h.intro();
        }
    }
}
