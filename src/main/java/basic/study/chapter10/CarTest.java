package basic.study.chapter10;

public class CarTest {
    public static void main(String[] args) {

        System.out.println("생성 전 carNum : "+Car.carNum);

        Car korando = new Car("코란도C", false);
        System.out.println(korando.name+" : "+Car.carNum);

        Car equus = new Car("에꿍스", true);
        System.out.println(equus.name+" : "+Car.carNum);

        Car.printNum();
        Car.resetNum();

        Car pride = new Car("프라이드", true);
        System.out.println(pride.name+" : "+Car.carNum);

        Car.printNum();

        Car pride2 = new Car("프라이드2", true);
        System.out.println(pride2.name+" : "+Car.carNum);

        Car.printNum();


    }
}
