package basic.study.chapter22;

public class InnerThisTest2 {

    public static void main(String[] args) {
        Human4 lee = new Human4();
        lee.name.intro();
    }
}

class Human4 {
    int age = 3;
    Name4 name = new Name4();

    class Name4 {
        int age = 20;
        void intro() {
            System.out.println("age : " + age);
            System.out.println("this.age : " + this.age);
            System.out.println("Human4.this.age : " + Human4.this.age);
        }
    }
}