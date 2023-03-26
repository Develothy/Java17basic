package basic.study.chapter22;

public class LocalInnerClass {
    public static void main(String[] args) {

        class Human7 {
            int age;
            String name;

            Human7(int age, String name) {
                this.age = age;
                this.name = name;
            }
            void intro() {
                System.out.println("안녕, " + age + "살 " + name +"입니다.");
            }
        }
        Human7 lee = new Human7(29, "리무무");
        lee.intro();
    }
    static void outMethod() {
        // Human7 lee = new Human7(29, "리무무");
    }
}
