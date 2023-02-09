package basic.study.chapter7;

public class RootDouble17 {

    public static void main(String[] args) {

        double[] root = new double[100];

        for (int i = 0; i < 100; i++) {
            root[i] = Math.sqrt(i);
        }
        System.out.println("2의 제곱근 : " + root[2]);

        System.out.println("static double 호출");
        System.out.println("2의 제곱근 : " + getRoot2(2));
        System.out.println("5의 제곱근 : " + getRoot2(5));
        System.out.println("2의 제곱근 : " + getRoot2(2));


    }

    static double[] root2 = new double[100];
    static double getRoot2(int i) {
        if (root2[i] == 0) {
            root2[i] = Math.sqrt(i);
        }
        return root2[i];
    }
}
