package basic.study.chapter25;

public class ConstValueTest2 {

    public static void main(String[] args) {

        Direction3 origin = Direction3.EAST;
        System.out.println(origin.getHanDir() + "쪽으로 갑니다~");
    }

}

enum Direction3 {
    EAST("동"), WEST("서"), SOUTH("남"), NORTH("북");

    final private String hanDir;

    Direction3(String han) {
        this.hanDir = han;
    }
    String getHanDir() {
        return hanDir;
    }
};

