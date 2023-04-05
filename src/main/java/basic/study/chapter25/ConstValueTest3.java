package basic.study.chapter25;

public class ConstValueTest3 {

    public static void main(String[] args) {

        JavaType Type;
        Type = JavaType.INT;

        System.out.println("타입 : " + Type + ", 이름 : " + Type.getName() + ", 길이 : " + Type.getLength());
    }
}

enum JavaType {

    SHORT("짧은 정수형", 2),
    INT("정수형", 4),
    DOUBLE("실수형", 8);

    final private String typeName;
    final private int length;

    JavaType(String name, int byteNum) {
        typeName = name;
        length = byteNum;
    }

    String getName() { return typeName; }
    int getLength() { return length; }
}
