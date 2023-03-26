package basic.study.chapter22;

public class AnonInterface2 {

    public static void main(String[] args) {

        // 익명 클래스
        Human11 lee = new Human11() {
            @Override
            public void intro() {
                System.out.println("나는 학생입니다!");
            }
        };
    }
}

interface Human11 {
    void intro();
}
