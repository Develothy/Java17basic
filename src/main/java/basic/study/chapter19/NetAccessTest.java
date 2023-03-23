package basic.study.chapter19;

public class NetAccessTest {

    public static void main(String[] args) throws Exception {

        try(NetAccess na = new NetAccess();) {
            na.open();
            na.send();
        }
    }
}
