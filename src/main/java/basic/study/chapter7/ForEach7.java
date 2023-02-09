package basic.study.chapter7;

public class ForEach7 {

    public static void main(String[] args) {

        int[] score = { 88, 94, 72, 75, 23};
        int sum = 0;
        for (int s : score) {
            sum += s;
        }
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (float)sum/score.length);
    }
}
