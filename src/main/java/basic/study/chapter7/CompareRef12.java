package basic.study.chapter7;

public class CompareRef12 {

    public static void main(String[] args) {

        int i =123, i2 = 123;
        int[] arr = {1,2,3}, arr2 = {1,2,3};
        int[] arr3 = arr;

        System.out.println("i와 i2 : " + (i == i2 ? "같다" : "다르다"));
        System.out.println("arr와 arr2 : " + (arr == arr2 ? "같다" : "다르다"));
        System.out.println("arr와 arr3 : " + (arr == arr3 ? "같다" : "다르다"));
    }
}
