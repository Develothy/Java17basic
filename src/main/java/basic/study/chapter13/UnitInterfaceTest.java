package basic.study.chapter13;

import static basic.study.chapter13.Unit.moveAttack;

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
                new Firebat(),
                new DarkTempler(),
                new Medic()
        };

        for (Unit unit : starUnits) {
            System.out.println("======== " + unit.getClass().getSimpleName() + " ========");
            moveAttack(unit);
            // unit.move();
            // unit.attack();
            unit.die(); // 질럿만 재정의 함
        }

    }
}
