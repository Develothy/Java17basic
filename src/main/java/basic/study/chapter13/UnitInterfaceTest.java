package basic.study.chapter13;

public class UnitInterfaceTest {

    public static void main(String[] args) {

        playStarUnit();

    }

    static void playStarUnit() {
        Unit[] starUnits = {
                new Marine(),
                new Mutal(),
                new Zealot(),
                new SuperMan(),
                new Firebat()
        };

        for (Unit unit : starUnits) {
            unit.move();
            unit.attack();
        }

    }
}
