package basic.study.mission.Cafe;

public class CafeOrderTest {


    public static void main(String[] args) {

        Americano americano = new Americano("Kenya", CafeMenu.Size.M, true, 1);
        order(americano);

        Americano addShotAmericano = new Americano("Ethiopia", CafeMenu.Size.M, true, 1);
        addShotAmericano.addShot(1);
        order(addShotAmericano);

        BananaFrap bananaFrap = new BananaFrap();
        order(bananaFrap);

        StrawberryFrap strawberryFrap = new StrawberryFrap(false, CafeMenu.Size.S, 1);
        order(strawberryFrap);

        Latte latte = new Latte();
        order(latte);

    }

    static boolean order(CafeMenu cafeMenu) {

        if (cafeMenu.isSoldOut) {
            System.out.println("품절되었습니다....");
            return false;
        }

        System.out.println("영수증을 확인해주세요~!");
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
