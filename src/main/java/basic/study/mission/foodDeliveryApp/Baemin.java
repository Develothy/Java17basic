package basic.study.mission.foodDeliveryApp;

public class Baemin extends FoodDeliveryApp {

    String bMartName;

    public enum FOODMENU {
        VIKING_SEAFOOD("해물모둠", 40000),
        VIKING_SUSHI("초밥모둠", 15000),
        DONGDAEMUN_DDUKBOKKI("떡볶이",12000),
        SUBWAY_SANDWICH("서브웨이 샌드위치",10000),
        SUBWAY_SALAD("서브웨이 샐러드",9000);

        public String foodName;
        public int price;
        FOODMENU(String foodName, int price) {
            this.foodName = foodName;
            this.price = price;
        }
    }

    public void shareToFriend() {
        System.out.println("친구에게 공유하기 완료!");
    }

}
