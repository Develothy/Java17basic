package basic.study.chapter22;

public class InnerThisTest {

    public static void main(String[] args) {
        Human3 lee = new Human3(29, "우림", "이");
        lee.name.outName();
        lee.name.outWho();
    }
}

class Human3 {
    int age;
    Name3 name;
    class Name3 {
        String first;
        String family;

        Name3(String first, String family) {
            this.first = first;
            this.family = family;
        }

        void outName() {
            Util.outName(this);
        }
        void outWho() {
            Util.outWho(Human3.this);
        }

    }
    Human3(int age, String first, String family) {
        this.age = age;
        this.name = new Name3(first, family);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}

class Util {
    static void outName(Human3.Name3 name) {
        System.out.println(name.family + name.first + "입니다.");
    }

    static void outWho(Human3 who) {
        who.intro();
    }
}



