package basic.study.chapter15.system;

import basic.study.chapter13.Marine;

public class TimeTest {

    public static void main(String[] args) {

        final int num =300000;
        long start = System.currentTimeMillis();
        byte ar[] = new byte[num];

        for (int i = 0; i < num; i++) {
            ar[i] = (byte) (Math.random() * 255);
        }

        InsertionSort(ar, num);
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0 + "초 걸림");


    }

    static void InsertionSort(byte ar[], int num) {

        int i,j;
        byte temp;

        for (i = 1; i < num; i++) {
            for (temp = ar[i], j = i; j > 0; j--) {
                if (ar[j - 1] > temp) {
                    ar[j] = ar[j-1];
                } else {
                    break;
                }
            }
            ar[j] = temp;
            if (i % 10000 == 0) {
                System.out.println(i + "번째 정렬 중");
            }
        }
    }


    static void startEndTimeTest() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + "번째 줄");
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0 + "초 걸림");
    }
}
