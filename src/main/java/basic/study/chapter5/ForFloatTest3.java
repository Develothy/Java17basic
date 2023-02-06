package basic.study.chapter5;

public class ForFloatTest3 {

    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            System.out.println(i + ", ");
        }
        System.out.println();
        for (double d = 0; d < 3.0; d = d + 0.5) {
            System.out.println(d + ", ");
        }
    }
}
