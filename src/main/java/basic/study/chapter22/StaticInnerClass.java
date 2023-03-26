package basic.study.chapter22;

public class StaticInnerClass {

    public static void main(String[] args) {
        Human5 lee = new Human5(29, "우림", "이");
        lee.intro();

        Human5.Name5 name = new Human5.Name5("수린", "린");
        System.out.println("이름 : " + name.family + name.first);
    }


}
class Human5 {
    int age ;
    Name5 name ;

    static class Name5 {
        String first;
        String family;

        Name5(String first, String family) {
            this.first = first;
            this.family = family;
        }
    }
    Human5(int age, String first, String family) {
        this.age = age;
        this.name = new Name5(first, family);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}
