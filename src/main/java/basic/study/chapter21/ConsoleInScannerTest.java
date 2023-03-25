package basic.study.chapter21;

import java.util.Scanner;

public class ConsoleInScannerTest {

    public static void main(String[] args) {
        System.out.println("정수를 입력하세요~!");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        System.out.println("입력값의 2배 = " + i*2);
        // 문자 입력 시 InputMismatchException
    }
}
