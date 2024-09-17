package basic.study.mission.foodDeliveryApp;


public class DeliveryOrderTest {

    public static void main(String[] args) {

        order(FoodDeliveryApp.OS.ANDROID,  new YogiyoOrder(Yogiyo.FOODMENU.BEIJING_MARA_TANG));
        order(FoodDeliveryApp.OS.IOS,  new BaeminOrder(Baemin.FOODMENU.VIKING_SUSHI));
    }

    static void order(FoodDeliveryApp.OS os, FoodDeliveryApp foodDeliveryApp) {

        System.out.println("====================================");
        osInfo(os);
        Delivery.orderSuccess(foodDeliveryApp);
        getStatus(foodDeliveryApp);
        System.out.println("====================================");

    }
    static void osInfo(FoodDeliveryApp.OS os) {
        switch (os) {
            case IOS -> {
                Ios.downloadInAppStore();
                Ios.useIos();
                break;
            }
            case ANDROID -> {
                Android.downloadInPlayStore();
                Android.useAos();
                break;
            }
        }
    }

    static void getStatus(FoodDeliveryApp foodDeliveryApp) {

        if (foodDeliveryApp instanceof BaeminOrder baemin) {
            baemin.getStatus();
            baemin.shareToFriend();
        } else if (foodDeliveryApp instanceof YogiyoOrder yogiyo) {
            yogiyo.giftForFriend();
            yogiyo.getStatus();
        }
    }




}
