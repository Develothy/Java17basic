package basic.study.mission.foodDeliveryApp;

public class FoodDeliveryApp extends Food {

    OS os;
    String appName;
    String foodMarketName;
    int totalPrice;
    String address;

    public enum OS {
        ANDROID, IOS
    }

    public void order() {
        System.out.println("주문 완료!");
    }

    public void pay() {
        System.out.println("결제 완료!");
    }

}
