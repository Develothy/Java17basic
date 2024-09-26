package basic.study.mission.cafe;

abstract class CafeMenu implements Payment{

    String name;
    Size size = Size.M;
    boolean isIce;
    int price ;
    int cnt = 1;
    boolean isSoldOut;

    enum Size {
        S, M
    }

    public void info() {
        System.out.println("어서오세요~ 카페입니당~");
    }

    public void setSoldOut(){
        isSoldOut = !isSoldOut;
    }

    @Override
    public int getTotalPrice(int originPrice, Size size, int cnt) {
        switch (size) {
            case M -> {
                return originPrice * cnt;
            }
            default -> {
                return (originPrice - 1000) * cnt;
            }
        }
    }
}
