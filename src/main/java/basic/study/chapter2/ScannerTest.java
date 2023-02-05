package basic.study.chapter2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = scanner.nextLine();
        System.out.println("안녕하세요. "+name+"님!");

        System.out.println("나이를 입력하세요");
        String age = scanner.nextLine();
        System.out.println("당신은 "+age+"살 입니다!");

        scanner.close();

    }
}
