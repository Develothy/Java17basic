package basic.study.chapter18;

import java.util.ArrayList;

public class GenericMethod {

    static <T> void print(T a) {
        System.out.println(a);
    }

    static <T> void printArray(ArrayList<T> ar) {
        for (T a : ar) {
            System.out.println(a);
        }
    }
}
