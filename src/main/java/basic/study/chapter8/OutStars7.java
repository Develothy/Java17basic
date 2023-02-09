package basic.study.chapter8;

public class OutStars7 {

    public static void main(String[] args) {

        for (int i =1; i <= 10; i++) {
            outStars(' ', 10-i);
            outStars('*', i);
            System.out.println();
        }
    }

    static void outStars(char ch, int num) {
        for (int i =0; i < num; i++) {
            System.out.print(ch);
        }
    }
}
