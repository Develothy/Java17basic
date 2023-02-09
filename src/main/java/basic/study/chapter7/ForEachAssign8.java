package basic.study.chapter7;

public class ForEachAssign8 {

    public static void main(String[] args) {

        int[] score = { 88, 94, 72, 75, 23};
        int sum = 0;

        for (int s : score) {
            s++;
            sum += s;
            System.out.println(s);
            System.out.println(sum);
        }
        System.out.println("score[0] = " + score[0]);
    }
}
