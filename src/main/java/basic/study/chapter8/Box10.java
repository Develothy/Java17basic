package basic.study.chapter8;

public class Box10 {

    public static void main(String[] args) {

        outBox("Hello");
        outBox("Congraturation");
        outBox("Good Morning");
    }

    static void outBox(String message) {
        outStarsln('-', message.length()+4);
        System.out.println("| "+ message +" |");
        outStarsln('-', message.length()+4);
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
