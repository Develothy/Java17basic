package basic.study.chapter23;

public class LamdaThreadTest {

    public static void main(String[] args) {
        /**
         * run() 메서드는 리턴이 없기 때문에 () -> 람다식으로 작성
         * 이 람다식이 Runnable 객체가 되고, Thread 내부에서 호출
         */
        new Thread(() -> System.out.println("스레드가 출력한 문장~")).start();

        /**
         * 위 코드와 동일
         * Thread는 기동(start())만 해두면 어차피 run()되니 굳이 변수명도 필요없지만.....
         */
        Thread thread2 = new Thread(() -> System.out.println("스레드가 출력한 문장~"));
        thread2.start();

        /**
         * 위 코드와 동일
         * 임시로 사용할 익명 객체 생성
         * Runnable 인터페이스는 run() 단 1개의 추상메서드만이 존재하고
         * Thread의 생성자로 전달하면 된다!!
         */
        Thread thread3 = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드가 출력한 문장~");
            }
        });
        thread3.start();
    }
}
