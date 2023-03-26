package basic.study.chapter22;

class AnonInterface {

    public static void main(String[] args) {

        class AnonInterfaceTest implements Human10{

            @Override
            public void intro() {
                System.out.println("나는 학생입니다!");
            }
        }

        AnonInterfaceTest lee = new AnonInterfaceTest();
        lee.intro();
    }
}

interface Human10 {
    void intro();
}


