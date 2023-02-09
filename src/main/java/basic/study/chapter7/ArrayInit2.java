package basic.study.chapter7;

public class ArrayInit2 {

    public static void main(String[] args) {

        int[] score = new int[] { 88, 99, 70, 55, 100 };

        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번 학생 성적");
        }

        // 간편 초기화
        int[] score2 = { 88, 99, 70, 55, 100 };
        for (int i = 0; i < score2.length; i++) {
            System.out.print(score2[i]+", ");
        }
        System.out.println();

        // 재초기화
        score2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < score2.length; i++) {
            System.out.print(score2[i] + ", ");
        }
    }
}
