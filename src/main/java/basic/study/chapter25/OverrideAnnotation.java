package basic.study.chapter25;

public class OverrideAnnotation {

    public static void main(String[] args) {

        Student lee = new Student();
        lee.move(0, 0);
    }
}

class Human {
    void move(int x, int y) {
        System.out.println("사람 : 뚜벅뚜벅");
    }

    int think(String what) {
        return 0;
    }
}

class Student extends Human {

    @Override   // 재정의. 없어도 동작하지만 정확한 재졍의 유도
    void move(int x, int y) {
        System.out.println("학생 : 아장아장");
    }

    int think(float what) {
        return 0;
    }
}