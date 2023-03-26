package basic.study.chapter22;

public class InnerClassTest {

    public static void main(String[] args) {
        Human lee = new Human(29, "우림", "이");
        lee.intro();
    }
}

class Name {
    String first;
    String family;

    Name(String first, String family) {
        this.first = first;
        this.family = family;
    }
}

class Human {
    int age;
    Name name;

    Human(int age, String first, String family) {
        this.age = age;
        this.name = new Name(first, family);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}