package basic.study.chapter22;

class Staff2 {

    interface Workable {
        void work(String what, int time);
    }
    void doWork(Workable w, String what, int time) {
        w.work(what, time);
    }
}
public class InnerInterface2 {
    public static void main(String[] args) {
        Staff2 lee = new Staff2();
        lee.doWork(new Staff2.Workable() {
            @Override
            public void work(String what, int time) {
                System.out.println(what + " 작업을 " + time + "시간동안 열심히 하기");
            }
        }, "보고서 작성", 2);

        Staff2 kim = new Staff2();
        kim.doWork(new Staff2.Workable() {
            @Override
            public void work(String what, int time) {
                System.out.println(time + "시간동안 빈둥대며 " + what);

            }
        }, "커피 마시기", 3);
    }
}
