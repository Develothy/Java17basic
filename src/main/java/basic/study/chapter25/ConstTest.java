package basic.study.chapter25;

public class ConstTest {

    public static void main(String[] args) {
        constTest1();
        constTest2();
        constTest3();
    }

    static void constTest1() {
        final int EAST = 1;
        final int WEST = 2;
        final int SOUTH = 3;
        final int NORTH = 4;

        int origin = EAST;
        origin = SOUTH;
        if (origin == WEST) {};
        if (origin != NORTH) {};
    }

    static void constTest2() {
        Direction origin = Direction.EAST;
        origin = Direction.SOUTH;
        if ( origin == Direction.WEST) {};
        if ( origin != Direction.NORTH) {};
    }

    static void constTest3() {
        Direction origin = Direction.EAST;
        System.out.println(origin);
        // origin = 9; // error
        // if (origin == Yoil.SUN) {};
    }
}
enum Direction { EAST, WEST, SOUTH, NORTH };
enum Yoil { SUN, MON, TUE, WED, THU, FRI, SAT };
