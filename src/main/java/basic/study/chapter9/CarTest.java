package basic.study.chapter9;

public class CarTest {

    public static void main(String[] args) {
        CarTest1();
    }

    static void CarTest1() {
        Car korando = new Car();
        korando.name = "코란도C";
        korando.gasoline = false;

        System.out.print(korando.name + " : ");
        korando.run();
        korando.stop();


        Car equus = new Car();
        equus.name = "에쿠스";
        equus.gasoline = true;

        System.out.print(equus.name + " : ");
        equus.run();
        equus.stop();
    }
}
