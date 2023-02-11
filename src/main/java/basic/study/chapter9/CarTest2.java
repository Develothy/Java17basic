package basic.study.chapter9;

public class CarTest2 {

    public static void main(String[] args) {

        Car2 korando = new Car2("코란도C", false);

        System.out.println(korando.name);
        korando.run();
        korando.stop();

        System.out.println("korando init Gv80");
        korando.init("Gv80", true);
        System.out.println(korando.name);
        korando.run();
        korando.stop();

    }
}
