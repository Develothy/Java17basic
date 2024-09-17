package basic.study.mission.foodDeliveryApp;

public class Yogiyo extends FoodDeliveryApp {

    
    public enum FOODMENU {
        RIMUS_PASTA("파스타", 10000),
        RIMUS_SALAD("샐러드", 5000),
        RIMUS_PIZZA("피자",20000),
        BEIJING_MARA_TANG("마라탕",11000),
        BEIJING_MARA_XIANGGUO("마라샹궈",11000),
        NEWYORK_HAMBURGER("햄버거",9000),
        NEWYORK_FRI("감자튀김",9000);

        public String foodName;
        public int price;
        FOODMENU(String foodName, int price) {
            this.foodName = foodName;
            this.price = price;
        }
    }

    public void giftForFriend() {
        System.out.println("친구에서 선물하기 완료!");
    }
}
