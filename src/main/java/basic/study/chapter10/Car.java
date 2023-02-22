package basic.study.chapter10;

public class Car {

    public String name;
    boolean gasoline;
    public static int carNum;      // 객체인스턴스 단위 필드가 아닌 클래스의 정적 필드

    static {
        carNum = 1000;      // 정적 초기화 블록     // 생성자에서 초기화 시 객체 생성 시마다 초기화 됨
    }

    public Car(String name, boolean gasoline) {
        this.name = name;
        this.gasoline = gasoline;
        carNum++;
    }

    public static void resetNum(){
        carNum = 0;
    }
    public static void printNum() {
        System.out.println("현재 출고 대수 : " + carNum);
    }

    void run() {
        if (gasoline) {
            System.out.println("부릉부릉");
        } else {
            System.out.println("덜컹덜컹");
        }
    }
}
