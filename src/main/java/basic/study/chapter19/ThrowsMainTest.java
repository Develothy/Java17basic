package basic.study.chapter19;

public class ThrowsMainTest {

    public static void main(String[] args) throws Exception {
        String name = null;
        printScore(name);
    }

    static void printScore(String name) throws Exception {

        if (name == null) {
            throw new NullPointerException("이름이 무효합니다!");
        }
        System.out.println(name.length());
    }
}
