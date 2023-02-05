package basic.study.chapter4;

public class IfRangeTest10 {

    public static void main(String[] args) {

        double richter = 6.5;

        if (richter < 3.5) {
            System.out.println("느낄 수 없거나 피해가 거의 없음.");
        } else if (richter < 4.8) {
            System.out.println("물건이 흔들리거나 경미한 피해를 입는다.");
        } else if (richter < 6.1) {
            System.out.println("좁은 지역에 부실한 건물에만 피해를 입힌다.");
        } else if (richter < 7.5) {
            System.out.println("반경 160km 영역의 건물을 파괴한다.");
        } else if (richter < 8.9) {
            System.out.println("넓은 지역에 심각한 피해를 입힌다.");
        } else {
            System.out.println("수천 km 영역을 초토화시킨다.");
        }
    }
}
