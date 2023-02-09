package basic.study.chapter8;

public class Parameter13 {

    public static void main(String[] args) {

        System.out.println(getSum(1,2));
        System.out.println(getSum(1,2,3,4));
        System.out.println(getSum(8,9,6,2,9));
    }

    static int getSum(int...a) {    // int[] a 를 인자로 해도 같은 효과. 결국 배열로 받기 때문
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
