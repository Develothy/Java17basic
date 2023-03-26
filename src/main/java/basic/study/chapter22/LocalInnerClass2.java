package basic.study.chapter22;

public class LocalInnerClass2 {

    public static void main(String[] args) {
        Human8 lee = new Human8(29, "이우린");
        lee.intro();
    }
}
class Human8 {
    int age;
    String name;

    Human8(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void intro() {
        final String nameCaption = "이름";
        final String ageCaption = "나이";

        class Formatter {
            void outInfo() {
                System.out.println(nameCaption + " : " + name);
                System.out.println(ageCaption + " : " + age);
            }
        }
        Formatter format = new Formatter();
        format.outInfo();
    }
}
