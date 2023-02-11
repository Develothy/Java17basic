package basic.study.chapter9;

public class Car {

    String name;
    boolean gasoline;

    void run() {
        if(gasoline) {
            System.out.println("부릉부릉");
        } else {
            System.out.println("덜컹덜컹");
        }
    }

    void stop() {
        System.out.println("끼이익");
    }

}
