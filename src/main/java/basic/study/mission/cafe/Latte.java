package basic.study.mission.cafe;

public class Latte extends Coffee{
    // String name = "라떼 ";

    Latte() {
        super("오늘의 ");
        this.name = "라떼 ";
        this.size = Size.M;
        this.isIce = false;
        this.cnt = 1;
        this.price = 5500;
    }

    Latte(String coffeeBean, CafeMenu.Size size, boolean isIce, int cnt) {
        super(coffeeBean);
        this.name = setNameIsIce("라떼", isIce);
        this.size = size;
        this.isIce = isIce;
        this.cnt = cnt;
        this.price = 5500;
    }
}
