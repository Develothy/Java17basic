package basic.study.mission.foodDeliveryApp;

public class YogiyoOrder extends Yogiyo implements Deliverys {

    YogiyoOrder(FOODMENU foodmenu ) {
        this.appName = "요기요!";
        this.foodName = foodmenu.foodName;
        this.price = foodmenu.price;
    }

    @Override
    public void getStatus() {
        System.out.println(Deliverys.dropBy() + "\n다음 번 차례입니다!");
    }

}