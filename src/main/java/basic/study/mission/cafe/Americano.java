package basic.study.mission.cafe;

public class Americano extends Coffee {

    // String name = "아메리카노 ";

    Americano() {
        super("오늘의 ");
        this.name = "아메리카노 ";
        this.size = Size.M;
        this.isIce = false;
        this.cnt = 1;
        this.price = 5000;
    }

    Americano(String coffeeBean, Size size, boolean isIce, int cnt) {
        super(coffeeBean);
        this.name = setNameIsIce("아메리카노", isIce);
        this.size = size;
        this.isIce = isIce;
        this.cnt = cnt;
        this.price = 5000;
    }

}
