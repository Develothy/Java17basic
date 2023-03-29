package basic.study.chapter23;

public class FuncInterfaceTest2 {

    public static void main(String[] args) {
        FindMax fm = (a, b) -> a > b ? a : b;
        System.out.println("result : " + fm.max(3, 7));
        GetTime gt = () -> System.currentTimeMillis();
        System.out.println("now : " + gt.systemTime());
    }
}

interface FindMax {
    int max(int a, int b);
}

interface GetTime {
    long systemTime();
}