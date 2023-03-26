package basic.study.chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkTest {

    public static void main(String[] args) {

        //bulkList1();
        //bulkListAddAll();
        //listRemoveAll();
        listToArray();
    }


    static void bulkList1() {
        List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    static void bulkListAddAll() {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arNum2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        arNum.addAll(arNum2);
        for (Integer i : arNum) {
            System.out.print(i + " ");
        }
    }

    static void listRemoveAll() {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> arNum2 = new ArrayList<>(Arrays.asList(2, 3));

        System.out.print("차집합 => ");
        ArrayList<Integer> arNumRemove = new ArrayList<>(arNum);
        arNumRemove.removeAll(arNum2);
        for (Integer i : arNumRemove) {
            System.out.print(i + " ");
        }

        System.out.print("\n교집합 => ");
        ArrayList<Integer> arNumRetain = new ArrayList<>(arNum);
        arNumRetain.retainAll(arNum2);
        for (Integer i : arNumRetain) {
            System.out.print(i + " ");
        }

        System.out.print("\n부분집합 => ");
        if (arNum.containsAll(arNum2)) {
            System.out.print("부분집합임");
        } else {
            System.out.print("부분집합이 아님");
        }

    }

    static void listToArray() {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(12, 34, 56));

        Integer[] ar = new Integer[arNum.size()];
        arNum.toArray(ar);
        // Integer[] ar = arNum.toArray(new Integer[0]);
        for (int a : ar) {
            System.out.print(a + " ");
        }
    }
}
