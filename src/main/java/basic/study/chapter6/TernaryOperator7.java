package basic.study.chapter6;

public class TernaryOperator7 {

    public static void main(String[] args) {

        int value = -5;
        System.out.println("절댓값 = " + (value > 0 ? value : -value));

        int value2 = 3;
        System.out.println("value2는 " + (value2 % 2 == 0 ? "짝" : "홀") + "수입니다.");
    }
}
