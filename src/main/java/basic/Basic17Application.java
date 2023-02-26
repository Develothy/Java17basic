package basic;

import basic.study.chapter9.Car;
import basic.study.mission.Cache;

public class Basic17Application {

    public static void main(String[] args) {
        System.out.println("Classloader of this class:"
                + Basic17Application.class.getClassLoader());
    }

}
