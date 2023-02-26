package basic.study.chapter12;

public class DeliveryTest {

    public static void main(String[] args) {

        DeliveryMan bae = new DeliveryMan();
        bae.delivery(new Bike(), "마라탕");
        bae.delivery(new AutoBike(), "피자");
        bae.delivery(new SkyKongKong(), "햄버거");
    }
}
