package basic.study.chapter7;

public class ArrayRectangular4 {

    public static void main(String[] args) {

        int[][] score = {
            {77, 56, 70, 82},
            {99, 96, 89, 88},
            {81, 69, 62, 80}
        };

        for (int student = 0; student < score.length; student++) {
            System.out.print((student + 1) + "번 학생 성적 : ");
            for (int subject = 0; subject < score[0].length; subject++) {
                System.out.print(score[student][subject] + " ");
            }
            System.out.println();
        }
    }
}
