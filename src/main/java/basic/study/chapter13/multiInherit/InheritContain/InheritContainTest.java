package basic.study.chapter13.multiInherit.InheritContain;

public class InheritContainTest {

    public static void main(String[] args) {

        HandPhoneCamera myPhone = new HandPhoneCamera();
        myPhone.call();
        myPhone.camera.takePicture();
    }

}
