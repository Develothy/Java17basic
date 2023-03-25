package basic.study.chapter21.serial;

import java.io.*;

public class SerialTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car pride = new Car("프라이드", "pink", true);

        // 파일로 출력
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
        out.writeObject(pride);
        out.close();
        System.out.println("파일을 기록");

        // 파일로부터 입력
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("pride.car"));
        Car pride2 = (Car) in.readObject();
        in.close();
        pride2.outInfo();
    }
}

class Car implements Serializable {
    String name;
    String color;
    boolean gasoline;

    Car (String name, String color, boolean gasoline) {
        this.name = name;
        this.color = color;
        this.gasoline = gasoline;
    }

    void outInfo() {
        System.out.printf("이름 = %s, 색상 %s, 연료 = %s", name, color, gasoline ? "휘발유" : "경유");
    }
}