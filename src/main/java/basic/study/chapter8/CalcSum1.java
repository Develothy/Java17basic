package basic.study.chapter8;

public class CalcSum1 {

    public static void main(String[] args){

        int sum;
        sum = 0;
        for (int i=0; i <=10; i++) {
            sum += i;
        }
        System.out.println("1~10 = "+ sum);

        sum = 0;
        for (int i=0; i <=15; i++) {
            sum += i;
        }
        System.out.println("1~15 = "+ sum);


        System.out.println("calcSum 호출");
        System.out.println("1~10 = "+ calcSum(1,10));
        System.out.println("1~15 = "+ calcSum(1,15));
    }
    static int calcSum(int from, int to) {
        int sum = 0;
        for (int i =from; i <=to; i++) {
            sum += i;
        }
        return sum;
    }

}
