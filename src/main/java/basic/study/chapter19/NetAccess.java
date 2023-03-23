package basic.study.chapter19;

public class NetAccess implements AutoCloseable {

    public void open() {
        System.out.println("접속");
    }
    public void send() {
        System.out.println("전송");
    }
    public void close() {
        System.out.println("해제");
    }

}
