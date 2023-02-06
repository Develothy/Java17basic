package basic.study.chapter5;

public class ForTriangleTest10 {

    public static void main(String[] args) {

        // 1
        System.out.println("1");
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // 2
        System.out.println("2");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j > 10 - i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        // 3
        System.out.println("3");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j > 10 - i ? '*' : " ");
            }
            System.out.println();
        }

        // 4
        System.out.println("4");
        for (int i = 1; i <= 10; System.out.println(), i++) {
            for (int j = 1; j <= 10; System.out.print(j > 10-i ? '*' : ' '), j++);
        }

    }
}
