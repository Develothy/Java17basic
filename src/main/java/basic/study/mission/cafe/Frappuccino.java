package basic.study.mission.cafe;

abstract class Frappuccino extends CafeMenu implements IceOnly{

    String name = "프라푸치노";
    String flavor;
    boolean isWithWhip;

    @Override
    public void printRecipe() {
        System.out.println("영수증을 확인해주세요!");
        String orderSuccess ="""
                ===============================
                메뉴 :\s""" + name + size + """
                사이즈
                휘핑 :\s""" + (isWithWhip ? "있음": "없음")+ """
                \n수량 :\s""" + cnt + """
                잔
                총 가격 :\s""" + getTotalPrice(price, size, cnt) + """
                원
                ===============================
                """;
        System.out.println(orderSuccess);
    }

    @Override
    public void addIce() {
        System.out.println("얼음을 블렌더로 갑니다!");
    }

    @Override
    public void selectIceCup() {
        System.out.println("프라푸치노 컵으로 드립니다!");
    }

    @Override
    public void addPoint() {
        System.out.println("프라푸치노 1잔당 2포인트를 적립해드립니다!");
    }

    @Override
    public void useCoupon() {
        System.out.println("쿠폰 결제가 불가능합니다!");
    }
}
