package basic.study.chapter23;

public class AgeCountTest1 {

    static  int[] arAge = { 29, 30, 34, 32, 30, 31, 28, 31, 29, 30 };

    public static void main(String[] args) {
        //System.out.println("30세 : " + count30());
        //System.out.println("31세 : " + count31());
        System.out.println("33세 : " + count(30));
        System.out.println("31세 : " + count(31));

        //System.out.println("over : " + countOver());
        //System.out.println("under : " + countUnder());
        System.out.println("over : " + operation(1));
        System.out.println("under : " + operation(2));
    }

    static int operation(int op) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            switch (op) {
                case 0 :
                    if (arAge[i] == 30) num++;
                    break;
                case 1 :
                    if (arAge[i] > 30) num++;
                    break;
                case 2 :
                    if (arAge[i] < 30) num++;
                    break;
            }
        }
        return num;
    }

    static int countOver() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] > 30) { num++; }
        }
        return num;
    }
    static int countUnder() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] < 30) { num++; }
        }
        return num;
    }

    static int count(int age) {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] == age) { num++; }
        }
        return num;
    }

    static int count30() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] == 30) { num++; }
        }
        return num;
    }

    static int count31() {
        int num = 0;
        for (int i = 0; i < arAge.length; i++) {
            if (arAge[i] == 31) { num++; }
        }
        return num;
    }
}
