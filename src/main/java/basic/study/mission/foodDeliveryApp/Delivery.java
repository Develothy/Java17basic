package basic.study.mission.foodDeliveryApp;

public interface Delivery {

    void getStatus();

    static void orderSuccess(FoodDeliveryApp foodDeliveryApp) {
        foodDeliveryApp.pay();
        foodDeliveryApp.order();
        deliveryStart();
        System.out.println("""
        ★★★★★★★★★★""" + foodDeliveryApp.appName + """
        ★★★★★★★★★★\n
        주문 상품 :\s""" + foodDeliveryApp.foodName + """
        \n결제 금액 :\s""" + foodDeliveryApp.price + """
        원\n★★★★★★★★★★★★★★★★★★★★★★★★★★★
        """);
    }

    static void deliveryStart() {
        System.out.println("배달을 시작합니다!");
    }

}
