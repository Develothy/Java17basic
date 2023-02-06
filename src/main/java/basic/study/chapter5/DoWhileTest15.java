package basic.study.chapter5;

public class DoWhileTest15 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.println("숫자를 입력하세요(끝낼 때 0) : ");
            num = scanner.nextInt();
            sum = sum + num;
        } while (num != 0);
        System.out.println("총 합계 : " + sum);
        scanner.close();
    }
}