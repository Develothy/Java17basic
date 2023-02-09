package basic.study.chapter8;

public class OutStars8 {

    public static void main(String[] args) {

        for (int i =1; i <= 10; i++) {
            outStars(' ', 10-i);
            outStarsln('*', i);
            System.out.println();
        }

    }

    static void outStars(char ch, int num) {
        for (int i =0; i < num; i++) {
            System.out.print(ch);
        }
    }

    static void outStarsln(char ch, int num) {
        outStars(ch, num);
        System.out.println();
    }

}
