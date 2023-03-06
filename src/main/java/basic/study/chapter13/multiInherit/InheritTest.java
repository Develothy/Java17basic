package basic.study.chapter13.multiInherit;

public class InheritTest {

    public static void main(String[] args) {

        System.out.println("======== 핸드폰 =========");
        HandPhoneCamera myPhone = new HandPhoneCamera();
        myPhone.call();
        myPhone.receive();
        myPhone.takePicture();

        System.out.println("======== 스마트폰 =========");
        SmartPhone galaxy = new SmartPhone();
        galaxy.call();
        galaxy.takePicture();
        galaxy.play();
    }


}
