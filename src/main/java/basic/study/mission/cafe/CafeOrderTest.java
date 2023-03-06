package basic.study.mission.cafe;

public class CafeOrderTest {

    public static void main(String[] args) {

        orderAmericano();
        // orderAddShotAmericano();
        // orderBananaFrap();
        // orderStrawberryFrap();
        // orderLatte();
    }

    static void orderAmericano() {
        Coffee americano = new Americano("Kenya", CafeMenu.Size.M, true, 1);
        americano.info();
        americano.grind(americano);
        order(americano);
    }

    static void orderAddShotAmericano() {
        Americano addShotAmericano = new Americano("Ethiopia", CafeMenu.Size.M, true, 1);
        addShotAmericano.info();
        addShotAmericano.addShot(1);
        order(addShotAmericano);
    }
    static void orderBananaFrap() {
        BananaFrap bananaFrap = new BananaFrap();
        bananaFrap.info();
        bananaFrap.addIce();
        bananaFrap.selectIceCup();
        bananaFrap.useCoupon();
        order(bananaFrap);
    }
    static void orderStrawberryFrap() {
        StrawberryFrap strawberryFrap = new StrawberryFrap(false, CafeMenu.Size.S, 1);
        strawberryFrap.info();
        strawberryFrap.addPoint();
        order(strawberryFrap);
    }
    static void orderLatte() {
        Latte latte = new Latte();
        latte.info();
        order(latte);
    }

    static boolean order(CafeMenu cafeMenu) {

        if (cafeMenu.isSoldOut) {
            System.out.println("품절되었습니다....");
            return false;
        }

        if (cafeMenu instanceof Coffee coffeeMenu) {
            if (coffeeMenu instanceof Americano americano) {
                americano.printRecipe();
            } else if (coffeeMenu instanceof Latte latte) {
                latte.printRecipe();
            }else {
                System.out.println("선택하신 메뉴가 없습니다ㅜㅜ");
            }
        } else if (cafeMenu instanceof Frappuccino frap) {
            if (frap instanceof BananaFrap bananaFrap) {
                bananaFrap.printRecipe();
            } else if (frap instanceof StrawberryFrap strawberryFrap) {
                strawberryFrap.printRecipe();
                strawberryFrap.addPoint();
            } else {
                System.out.println("선택하신 메뉴가 없습니다ㅜㅜ");
            }
        } else {
            System.out.println("선택하신 메뉴가 없습니다ㅜㅜ");
        }
        return true;
    }
}
