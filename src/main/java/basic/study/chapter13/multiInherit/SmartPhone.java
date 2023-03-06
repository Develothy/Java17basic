package basic.study.chapter13.multiInherit;

public class SmartPhone extends HandPhone implements Camera, Mp3 {

    public void takePicture() {
        System.out.println("찰칵! 찰칵!");
    }

    public void play() {
        System.out.println("띵~ 띵~ 음악 재생~");
    }
}
