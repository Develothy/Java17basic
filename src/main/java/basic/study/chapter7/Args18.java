package basic.study.chapter7;

public class Args18 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }
        System.out.println("총 합계 : " + sum);
    }
}
