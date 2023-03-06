package basic.study.chapter13.multiInherit;

public class HandPhoneCamera implements HandPhone, Camera {

    public void takePicture() {
        System.out.println("찰칵! 사진을 찍는다");
    }

    public void call() {
        System.out.println("전화를 걸다!");
    }

    public void receive() {
        System.out.println("전화를 받다!");
    }
}
