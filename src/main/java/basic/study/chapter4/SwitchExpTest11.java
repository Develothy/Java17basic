package basic.study.chapter4;

public class SwitchExpTest11 {

    public static void main(String[] args) {
        int ranking = 2;
        String medal =
                switch (ranking) {
                case  1 -> "금매달";
                case 2 -> "은메달";
                case 3 -> "동메달";
                default -> "참가상";
                };
        System.out.println(medal + "을 수여합니다.");

        System.out.println(switch (ranking) {
            case  1 -> "금매달";
            case 2 -> "은메달";
            case 3 -> "동메달";
            default -> "참가상";
        } + "을 수여합니다.2");

        String medal2 =
                switch (ranking) {
                    case  1 -> {
                        System.out.println("축하합니다. ");
                        yield "금매달";    // 미니 return문
                    }
                    case 2 -> "은메달";
                    case 3 -> "동메달";
                    default -> "참가상";
                };
        System.out.println(medal + "을 수여합니다.");

    }
}
