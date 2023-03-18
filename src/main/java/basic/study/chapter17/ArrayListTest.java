package basic.study.chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        //arrayList1();
        //listSize1();
        //listEdit1();

    }


    static void arrayList1() {
        var arNum = new ArrayList<Integer>();   // var 타입추론 시 new 생성자에 타입 필수
        arNum.add(1);
        arNum.add(2);
        arNum.add(3);
        arNum.add(4);
        arNum.add(5);
        arNum.add(2, 100);

        for (Integer i : arNum) {
            System.out.println(i + " ");
        }
    }

    static void listSize1() {
        ArrayList<Integer> arNum2 = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            arNum2.add((int) (Math.random() * 10));

        }
        for (Integer i : arNum2) {
            System.out.print(i + " ");
        }
    }

    static void listEdit1() {
        ArrayList<String> arName = new ArrayList<>();
        arName.add("전두환");
        arName.add("김영삼");
        arName.add("김대중");
        arName.add("노태우");
        for (String s : arName) {
            System.out.println(s);
        }
        System.out.println("==================");

        arName.remove(2);
        arName.set(2, "김바비");
        for (String s : arName) {
            System.out.println(s);
        }
        if (arName.indexOf("노태우") != -1) {
            System.out.println("있다");
        } else {
            System.out.println("없다");
        }
    }

}
