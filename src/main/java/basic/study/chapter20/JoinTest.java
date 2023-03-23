package basic.study.chapter20;

public class JoinTest {

    public static void main(String[] args) {

        Memory4 mem = new Memory4(64);
        Download4 down = new Download4(mem);
        Play4 play = new Play4(mem);

        down.start();
        play.start();

        try {
            down.join();
            play.join();
        } catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("다운로드가 완료되었습니다. 전송을 시작합니다!");
    }
}
