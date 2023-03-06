package basic.study.mission.foodDeliveryApp;

public interface App {
    
    default void login() {
        System.out.println("로그인 합니다~");

    };
    default void logout() {
        System.out.println("로그아웃 합니다~");
    };
}
