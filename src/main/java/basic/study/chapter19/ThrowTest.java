package basic.study.chapter19;

public class ThrowTest {

    public static void main(String[] args) {
        //nameNullTest();
        nameNullTest2();
    }

    static void nameNullTest2() {
        String name = null;
        try {
            printScore2(name);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    static void printScore2(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException("이름이 무효합니다!");
        }
        System.out.println(name.length());
    }

    static void nameNullTest() {
        String name = null;
        printScore(name);
    }

    static void printScore(String name) {

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("이름이 무효합니다.");
        }
    }
}
