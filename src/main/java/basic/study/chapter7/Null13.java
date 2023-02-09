package basic.study.chapter7;

public class Null13 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(arr[0]);

        // NPE
        arr = null;
        System.out.println(arr[0]);
    }
}
