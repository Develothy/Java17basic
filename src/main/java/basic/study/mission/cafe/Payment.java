package basic.study.mission.cafe;

public interface Payment {

    default void pay() {
        System.out.println("결제를 진행합니다!");
    }

    int getTotalPrice(int originPrice, CafeMenu.Size size, int cnt);
    void printRecipe();
    void addPoint();
    void useCoupon();

}
