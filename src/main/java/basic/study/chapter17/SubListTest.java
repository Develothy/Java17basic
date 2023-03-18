package basic.study.chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SubListTest {

    public static void main(String[] args) {
        //subList();
        subList2();
    }

    static void subList() {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> sub = arNum.subList(1, 4); // 1~3

        System.out.println("arNum = " + arNum);
        System.out.print("sub = ");
        for (Integer i : sub) {
            System.out.print(i + " ");
        }
        System.out.println();

        arNum.set(2, 100);
        System.out.println("arNum.set(2, 100), print sub");
        for (Integer i : sub) {
            System.out.print(i + " ");
        }
        System.out.println();

        sub.set(1, 200);
        System.out.println("sub.set(1, 200), print arNum");
        for (Integer i : arNum) {
            System.out.print(i + " ");
        }
        System.out.println();

        sub.clear();
        System.out.println("sub.clear, print arNum");
        for (Integer i : arNum) {
            System.out.print(i + " ");
        }
    }

    static void subList2() {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> sub = arNum.subList(1, 4);
        // arNum.remove(2);
        // 컴파일 에러 _ subList(뷰) 생성 후 원본 구조가 변경되고 참조하면 에러. 요소 값 변경은 되지만 길이 등 구조는 안됨
        for (Integer i : sub) {
            System.out.print(i + " ");
        }
    }
}
