package basic.study.chapter19;

public class FinallyTest {

    public static void main(String[] args) {

        System.out.println("접속");
        useFinally();

    }

    static void noFinally() {
        try {
            System.out.println("전송");
            System.out.println("해제");
        } catch (Exception e) {
            System.out.println("예외 처리");
            System.out.println("해제");
        }
    }

    static void useFinally() {
        try {
            System.out.println("전송");
        } catch (Exception e) {
            System.out.println("예외 처리");
        } finally {
            System.out.println("해제");
        }
    }


}
