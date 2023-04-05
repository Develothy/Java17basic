package basic.study.chapter26;

import java.sql.*;

public class JDBCTest {

    public static void main(String[] args) {
        try {

            // 드라이버 로드
            //Class.forName("com.mysql.jdbc.Driver");
            // 연결
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Study", "root", "1234");

            // 명령 실행
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM City");

            // 결과셋 읽음
            while (rs.next()) {
                String name = rs.getString("name");
                int popu = rs.getInt("popu");
                int aria = rs.getInt("area");
                System.out.printf("%s : %4d만명, %4dkm", name, popu, aria);
            }

            // 정리
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("실패~");
            e.getMessage();
        }
    }
}
