package basic.study.chapter5;

public class ContinueTest18 {

    public static void main(String[] args) {

        int[] score = {88, 94, -1, 79, 23};
        for (int i = 0; i < 5; i++) {
            if (score[i] == -1) continue;
            System.out.println((i + 1) + "번 학생의 성적: " + score[i]);
        }
    }
}
