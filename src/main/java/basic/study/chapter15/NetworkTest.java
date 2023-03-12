package basic.study.chapter15;

public class NetworkTest {

    public static void main(String[] args) {
        comunication();
        System.gc();
        System.runFinalization();
    }

    static void comunication() {
        Network net = new Network();
        net.connect();
        //net.disconnect();
    }
}
