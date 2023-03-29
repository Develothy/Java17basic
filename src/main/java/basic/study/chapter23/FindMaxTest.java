package basic.study.chapter23;

public class FindMaxTest {

    public static void main(String[] args) {
        FindMax2 add = (a, b) -> a + b;
        System.out.println("result : " + add.max(3,7));

        FindMax2 getSum = (a, b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        };
        System.out.println("result : " + getSum.max(3,7));
    }
}

interface FindMax2 {
    int max(int a, int b);
}
