package basic.study.chapter15;


public class HumanTest {

    public static void main(String[] args) {
        int i = 1234;
        System.out.println(i);

        Human lee = new Human(29, "이사라");
        Human park = new Human(29, "박연진");
        Human parkCopy = park;
        Human park2 = new Human(29, "박연진");
        System.out.println(lee.toString());

        String str =  "범인 : " + lee;
        System.out.println(str);

        System.out.println("============== ==비교 ==============");
        System.out.println("lee == park : " + (lee == park ? "같다" : "다르다"));
        System.out.println("park == parkCopy : " + (park == parkCopy ? "같다" : "다르다"));
        System.out.println("park == park2 : " + (park == park2 ? "같다" : "다르다"));

        System.out.println("============= equals ==============");
        System.out.println("lee equals park : " + (lee.equals(park) ? "같다" : "다르다"));
        System.out.println("park equals parkCopy : " + (park.equals(parkCopy) ? "같다" : "다르다"));
        System.out.println("park equals park2 : " + (park.equals(park2) ? "같다" : "다르다"));
    }
}
