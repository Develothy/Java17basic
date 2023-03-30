package basic.study.chapter24;

import java.util.*;

public class CountryTest {

    public static void main(String[] args) {

        oecdTop3();
        oecdTop3Stream();
    }

    static void oecdTop3Stream() {
        int total = Data.nara.stream()
                .filter(c -> c.oecd)
                .sorted(Comparator.comparing(Country::getPopu).reversed())
                .limit(3)
                .map(Country::getPopu)
                .reduce(0, Integer::sum);
        System.out.println("OECD 상위 3개국의 인구수 : " + total);
    }

    static void oecdTop3() {
        List<Country> oecd = new ArrayList<>();
        for (Country c : Data.nara) {
            if (c.oecd) {
                oecd.add(c);
            }
        }

        Collections.sort(oecd, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o2.popu - o1.popu;
            }
        });

        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += oecd.get(i).popu;
        }
        System.out.println("OECD 상위 3개국의 인구수 : " + total);
    }


}

enum Cont { ASIA, AFRICA, AMERICA, EUROPE }

class Country implements Comparable<Country> {

    String name;
    Cont cont;
    int popu;
    boolean oecd;

    Country (String name, Cont cont, int popu, boolean oecd) {
        this.name = name;
        this. cont = cont;
        this.popu = popu;
        this.oecd = oecd;
    }

    String getName() {return name;}
    Cont getCont() {return cont;}
    int getPopu() {return popu;}
    boolean isOecd() {return oecd;}
    public String toString() {
        return name + " in " + cont + " : " + popu + (oecd ? "(o)":"");
    }

    @Override
    public int compareTo(Country o) {
        return popu - o.popu;
    }
}
class Data {
    static List<Country> nara = Arrays.asList(
            new Country("한국", Cont.ASIA, 49, true),
            new Country("미국", Cont.AMERICA, 318, true),
            new Country("중국", Cont.ASIA, 1355, false),
            new Country("프랑스", Cont.EUROPE, 66, true),
            new Country("나이지리아", Cont.AFRICA, 177, false),
            new Country("독일", Cont.EUROPE, 80, true),
            new Country("헝가리", Cont.EUROPE, 9, true),
            new Country("베트남", Cont.ASIA, 93, false),
            new Country("칠레", Cont.AMERICA, 17, false),
            new Country("캐나다", Cont.AMERICA, 24, true)
    );
}
