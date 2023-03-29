package basic.study.chapter23;

public class LamdaThreadTest {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("스레드가 출력한 문장~"));
        thread.start();
    }
}
