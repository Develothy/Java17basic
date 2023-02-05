package basic.study.chapter4;

public class SwitchStringCase8 {
    public static void main(String[] args) {

        String country = "CHINA";

        switch (country.toLowerCase()) {
            case "korea" :
                System.out.println("Seoul");
                break;
            case "china" :
                System.out.println("Beijing");
                break;
            case "japan" :
                System.out.println("Tokyo");
                break;
        }
    }
}
