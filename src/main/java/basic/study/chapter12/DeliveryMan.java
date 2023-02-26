package basic.study.chapter12;

public class DeliveryMan {

    void delivery(Transport tran, String food) {
        tran.ride();
        System.out.println(" 타고 가서 " + food + "를 배달합니다.");
    }
}
