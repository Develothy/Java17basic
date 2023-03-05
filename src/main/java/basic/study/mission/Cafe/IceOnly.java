package basic.study.mission.Cafe;

public interface IceOnly {

    default void straw() {
        System.out.println("Ice 전용 빨대를 지급합니다!");
    }

    void addIce();

    void selectIceCup();
}
