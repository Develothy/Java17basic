package basic.study.chapter4;

public class SwitchStringCase7 {

    public static void main(String[] args) {

        String country = "China";

        switch (country) {
            case "Korea" :
                System.out.println("Seoul");
                break;
            case "China" :
                System.out.println("Beijing");
                break;
            case "Japan" :
                System.out.println("Tokyo");
                break;
        }
    }
}
