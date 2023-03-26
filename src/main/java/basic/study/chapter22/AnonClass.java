package basic.study.chapter22;

public class AnonClass {

    public static void main(String[] args) {

//        class Student extends Human9 {
//            @Override
//            void intro() {
//                System.out.println("나는 학생입니다~!");
//            }
//        }

        Human9 lee = new Human9() {
          void intro() {
              System.out.println("나는 학생입니다!!");
          }
        };
        lee.intro();
    }
}
class Human9 {
    void intro() {
        System.out.println("나는 사람입니다~!");
    }
}