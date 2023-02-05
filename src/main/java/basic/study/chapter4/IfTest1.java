package basic.study.chapter4;

public class IfTest1 {

    public static void main(String[] args) {
        //int age = 21;
        int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("몇살인가요?"));

        if (age >= 19) {
            System.out.println("성인입니다~");
        }

        int age2 = 15;

        if (age2 >= 19)
            System.out.println("성인입니다~2");
            System.out.println("술집입장");
    }
}
