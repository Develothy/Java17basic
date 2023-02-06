package basic.study.chapter5;

public class ForSumTest2 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("합계 : " + sum);

        // 제어 변수
        int sum2 = 0;
        for (int i = 1; i <= 100; i = i + 2) {
            sum2 = sum2 + i;
        }
        System.out.println("제어 변수 합계 : " + sum2);
    }
}
