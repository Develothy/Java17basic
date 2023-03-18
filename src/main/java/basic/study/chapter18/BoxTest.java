package basic.study.chapter18;

public class BoxTest {

    public static void main(String[] args) {
        //intTypeBox();
        //doubleTypeBox();
        //objectTypeBox();
        //genericTypeBox();
        //rawTypeBox();
        //rawTypeBox2();
        rawTypeBox3();

    }

    static void genericTypeBox() {
        GenericBox<Integer> ib = new GenericBox<>(1234);
        int ibv = ib.get();
        System.out.println(ibv);

        GenericBox<Double> db = new GenericBox<>(56.78);
        double dbv = db.get();
        System.out.println(dbv);

        System.out.println("ib.getClass() == db.getClass() : " + (ib.getClass() == db.getClass()));
    }

    static void rawTypeBox() {
        GenericBox rb = new GenericBox<>(1234);
        int rbv = (int) rb.get();   // 타입 명시 안해서 캐스팅 필요 (과거 소스 호환때문에 사용)
        System.out.println(rbv);
    }

    static void rawTypeBox2() {
        GenericBox raw = new GenericBox<>(1234);
        GenericBox<Integer> para = new GenericBox<>(5678);
        raw = para;
        int value = (int) raw.get();    // raw는 타입정보가 없어서 반드시 캐스팅
        System.out.println(value);
    }

    static void rawTypeBox3() {
        GenericBox raw = new GenericBox<>(1234);
        GenericBox<Integer> para = new GenericBox<>(5678);
        para = raw;                 // raw는 타입이 확실하지 않아서 안전하지 않다는 경고
        int value = para.get();     // para는 타입정보가 있어서 캐스팅 없이도 가능
        System.out.println(value);
    }

    static void intTypeBox() {
        IntBox ib = new IntBox(1234);
        int biv = ib.get();
        System.out.println(biv);
    }

    static void doubleTypeBox() {
        DoubleBox db = new DoubleBox(56.78);
        double dbv = db.get();
        System.out.println(dbv);
    }

    static void objectTypeBox() {
        ObjectBox ob = new ObjectBox(1234);
        int ibv = (int) ob.get();
        System.out.println(ibv);

        ObjectBox ob2 = new ObjectBox(56.78);
        double dbv = (double) ob2.get();
        System.out.println(dbv);
    }


}
