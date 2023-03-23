package basic.study.chapter19;

public class ThrowsMainTest2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("프로그램 시작");
        Thread.sleep(3000);
        // throw new InterruptedException("e");
        System.out.println("프로그램 종료");
    }
}
