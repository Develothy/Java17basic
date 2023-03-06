package basic.study.chapter13.unitExtends;

public class StarTest {

    public static void main(String[] args) {
        //playStar();
        playStarUnit();
    }

    static void playStar() {
        Marine marine = new Marine();
        marine.move();
        marine.attack();
        marine.bunker();

        Zealot zealot = new Zealot();
        zealot.move();
        zealot.attack();
    }

    static void playStarUnit() {
        Unit[] starUnits = {
            new Marine(),
            new Mutal(),
            new Zealot()
        };

        for (Unit unit : starUnits) {
            unit.move();
            unit.attack();
        }

    }
}
