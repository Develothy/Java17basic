package basic.study.chapter15;

public class Network {

    void connect() {
        System.out.println("연결되었습니다.");
    }

    void disconnect() {
        System.out.println("연결이 끊겼습니다.");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        disconnect();
    }
}
