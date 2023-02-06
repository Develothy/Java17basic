package basic.study.chapter5;

public class ForInfiniteTest7 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int grade;

        for (;;) {
            System.out.println("몇 학년입니까?(1~6) : ");
            grade = scanner.nextInt();
            if (grade >= 1 && grade <= 6) break;
                System.out.println("다시 입력하세요");
        }
        System.out.println(grade + "학년입니다.");
        scanner.close();
    }
}
