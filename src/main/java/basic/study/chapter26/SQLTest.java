package basic.study.chapter26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLTest {

    public static void main(String[] args) {
        try {

            // 드라이버 로드
            Class.forName("com.mysql.jdbc.Driver");
            // 연결
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Study", "root", "1234");

            // 명령 실행
            Statement stmt = conn.createStatement();

            // 테이블 재초기화
            stmt.executeUpdate("DROP TABLE IF EXISTS Staff");
            stmt.executeUpdate("CREATE TABLE Staff (name NVARCHAR(30) NOT NULL PRIMARY KEY," +
                    "depart NVARCHAR (10) NOT NULL," +
                    "salary INT NOT NULL," +
                    "achieve INT NULL," +
                    "workMonth INT NULL);");

            // 샘플 레코드 삽입
            stmt.executeUpdate("INSERT INTO Staff VALUES ('김유신','관리부',180,88,12);");
            stmt.executeUpdate("INSERT INTO Staff VALUES ('이우림','말리부',160,78,19);");
            stmt.executeUpdate("INSERT INTO Staff VALUES ('김바비','바비부',150,28,3);");
            stmt.executeUpdate("INSERT INTO Staff VALUES ('박새리','골프부',170,88,12);");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");

            // 결과셋 읽음
            while (rs.next()) {
                System.out.println( rs.getString("name"));

            }

            stmt.executeUpdate("UPDATE Staff SET salary SET salary = 250 WHRER name='김유신';");
            stmt.executeUpdate("DELETE FROM Staff WHERE depart='골프부';");

            // 정리
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }


}
