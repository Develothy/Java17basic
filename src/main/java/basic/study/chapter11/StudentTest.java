package basic.study.chapter11;

public class StudentTest {

    public static void main(String[] args) {
        System.out.println("======== Human ========");
        Human rothy = new Human(29, "이우림", "M1", 8, 2000);
        rothy.intro();

        System.out.println("======== Student ========");
        Student lee = new Student(28, "이우림", 950403, "플랫폼기술본부");
        lee.intro();
        lee.study();
    }
}
