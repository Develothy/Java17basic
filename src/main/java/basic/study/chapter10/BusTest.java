package basic.study.chapter10;

import static basic.study.chapter10.Car.printNum;
import static basic.study.chapter10.NoteBook.GIGA;

public class BusTest {

    public static void main(String[] args) {

        Bus bus1 = new Bus();
        bus1.printFare(1, 5);

        Bus bus2 = new Bus();
        bus2.printFare(2, 4);

        // static 독립메서드 테스트 (Car 생성 X)
        printNum();

        // static 상수 GIGA (NoteBook 생성 X)
        System.out.println(GIGA);
    }
}
