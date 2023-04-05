package basic.study.chapter25;

public class ConstValueTest {

    public static void main(String[] args) {
        value1();
    }

    static void value1() {
        Direction2[] ways = Direction2.values();
        for (Direction2 way : ways) {
            System.out.print(way + " ");
        }
        System.out.println("중 하나를 선택하세요~");
    }

    static void value2() {
        Direction2 origin = Direction2.valueOf("EAST");
        System.out.println(origin);
    }


}

enum Direction2 { EAST, WEST, SOUTH, NORTH };


