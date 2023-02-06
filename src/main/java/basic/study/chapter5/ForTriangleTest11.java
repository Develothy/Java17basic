package basic.study.chapter5;

public class ForTriangleTest11 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
