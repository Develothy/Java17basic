package basic.study.chapter18;

import java.util.ArrayList;

public class GenericMethodTest {

    public static void main(String[] args) {
        //GenericMethod.<Integer>print(1234);
        //GenericMethod.<String>print("문자열");

        //weekArray();
        scoreArray();

    }
    static void weekArray() {
        ArrayList<String> yoil = new ArrayList<>();
        yoil.add("일요일");
        yoil.add("월요일");
        GenericMethod.<String>printArray(yoil);
    }

    static void scoreArray() {
        ArrayList<Integer> score = new ArrayList<>();
        score.add(23);
        score.add(45);
        GenericMethod.printArray(score);
    }

}
