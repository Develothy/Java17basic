package basic.study.mission.foodDeliveryApp;

public class BaeminOrder extends Baemin implements Delivery {

    int orderNum;
    int discountPrice;

    BaeminOrder(Baemin.FOODMENU foodmenu ) {
        this.appName = "배 ~ 민!";
        this.foodName = foodmenu.foodName;
        this.price = foodmenu.price;
    }

    public void shareToFriend() {
        System.out.println("친구에게 공유하기 완료!");
    }

    @Override
    public void getStatus() {
        System.out.println("오직 고객님에게로 가는중입니다!!");
    }

}
