package basic.study.chapter2;

public class SwingTest {
    public static void main(String[] args) {
        String name = javax.swing.JOptionPane.showInputDialog("이름을 입력하세요.");
        System.out.println("안녕하세요. " + name + "님!");

        String agestr = javax.swing.JOptionPane.showInputDialog("나이를 입력하세요.");
        int age = Integer.parseInt(agestr);
        System.out.println("당신은 " + age + "살입니다.");
    }
}
