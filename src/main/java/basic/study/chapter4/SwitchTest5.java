package basic.study.chapter4;

public class SwitchTest5 {

    public static void main(String[] args) {
        int ranking = 2;

        switch (ranking) {
            case 1:
                System.out.println("축하합니다. 금메달입니다!");
                break;
            case 2:
                System.out.println("은메달을 수여합니다!");
                break;
            case 3:
            case 4:
                System.out.println("동메달을 수여합니다.");
                break;
            default:
                System.out.println("참가상을 수여합니다!");
                break;
        }



        /*
         * if else if 일때
        if (ranking == 1) {
            System.out.println("축하합니다. 금메달이에요");
        } else if (ranking == 2){
            System.out.println("은메달입니다.");
        } else if (ranking == 3) {
            System.out.println("동메달입니다.");
        } else {
            System.out.println("참가상을 드립니다.");
        }

         */
    }
}
