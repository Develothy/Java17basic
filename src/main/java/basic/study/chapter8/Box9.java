package basic.study.chapter8;

public class Box9 {

    public static void main(String[] args) {
        outStarsln('-', 5+4);
        System.out.println("| Hello |");
        outStarsln('-', 5+4);

        outStarsln('-', 14+4);
        System.out.println("| Congraturation |");
        outStarsln('-', 14+4);
    }

    static void outStarsln(char ch, int num) {
        outStars(ch, num);
        System.out.println();
    }
    static void outStars(char ch, int num) {
        for (int i =0; i < num; i++) {
            System.out.print(ch);
        }
    }

}
