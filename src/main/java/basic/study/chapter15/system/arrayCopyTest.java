package basic.study.chapter15.system;

import java.util.Arrays;

public class arrayCopyTest {

    public static void main(String[] args) {

        int[] ar = { 1,2,3,4,5 };

        // 배열 복사
        int[] ar2 = new int[5];

        System.arraycopy(ar, 0, ar2, 0, ar.length);
        for (int a : ar2) {
            System.out.print(a + " ");
        }
        System.out.println();


        // 배열 지정 길이 복사
        int[] ar3 = new int[5];

        System.arraycopy(ar, 1, ar3, 2, 2);
        for (int a : ar3) {
            System.out.print(a + " ");
        }
        System.out.println();


        // 원본 배열과 대상 배열이 같은 복사
        int[] ar4 = { 1,2,3,4,5,6,7,8,9 };

        System.arraycopy(ar4, 2, ar4, 4, 3);
        for (int a : ar4) {
            System.out.print(a + " ");
        }
        System.out.println();


        // Arrays 클래스의 배열 복사
        int[] ar5 = Arrays.copyOf(ar, ar.length);
        for (int a : ar5) {
            System.out.print(a + " ");
        }
        System.out.println();

        int[] ar6 = Arrays.copyOfRange(ar, 1, 3);
        for (int a : ar6) {
            System.out.print(a + " ");
        }

    }
}
