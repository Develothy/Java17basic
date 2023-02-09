package basic.study.chapter7;

public class CopyRef11 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = arr;

        arr2[0] = 1000;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr2[0] = " + arr2[0]);
    }
}
