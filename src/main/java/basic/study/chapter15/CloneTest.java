package basic.study.chapter15;

public class CloneTest {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = arr.clone();

        arr2[0] = 1000;

        System.out.println("arr[0] : " + arr[0]);
        System.out.println("arr2[0] : " + arr2[0]);
    }

}
