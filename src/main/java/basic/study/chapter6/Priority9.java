package basic.study.chapter6;

public class Priority9 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        if (a == 1 || b == 2 && c == 10 || d == 10) {
            System.out.println("진실");
        } else {
            System.out.println("거짓");
        }
    }
}
