package basic.study.mission.Cafe;

public class BananaFrap extends Frappuccino {

    String flavor = "바나나 ";

    BananaFrap(){
        this.name = flavor + name;
        this.isWithWhip = true;
        this.size = Size.M;
        this.cnt = 1;
        this.price = 7000;
        this.isSoldOut = false;
    }
    BananaFrap(boolean isWithWhip, Size size, int cnt) {
        this.name = flavor + name;
        this.isWithWhip = isWithWhip;
        this.size = size;
        this.cnt = cnt;
        this.price = 7000;
    }

}
