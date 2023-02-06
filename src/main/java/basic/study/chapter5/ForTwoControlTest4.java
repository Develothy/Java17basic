package basic.study.chapter5;

public class ForTwoControlTest4 {

    public static void main(String[] args) {
        for (int i = 0, j = 1; i < 5; i++, j = j + 2) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
