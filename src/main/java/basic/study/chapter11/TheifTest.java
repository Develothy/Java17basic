package basic.study.chapter11;

public class TheifTest {

    public static void main(String[] args) {

        Student rothy = new Student(28, "이우림", 950403, "전산");
        rothy.study();

        Soldier kang = new Soldier(33, "강감찬", 12345);
        kang.fight();

        Theif hong = new Theif(15, "홍길동", "부자집", 2);
        hong.steal();    }
}
