package basic.study.chapter9;

public class Car2 {
    String name;
    boolean gasoline;

    Car2(String aName, boolean aGasoline) { //객체 필드와 인자 이름이 달라야함. 또는 객체 필드를 this로 표현
        name = aName;
        gasoline = aGasoline;
    }
    // 재초기화용을 보통 새로 선언한다.
    void init(String name, boolean gasoline) {
        this.name = name;
        this.gasoline = gasoline;
    }

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
