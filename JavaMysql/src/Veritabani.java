import java.sql.*;

public class Veritabani {
    static String url = "jdbc:mysql://localhost:3306/normalogr";
    //uzak serverda ise localhost yerine oranın ip adresi yazılır
    static Connection conn = null;

    static void baglan(){
        try {
            conn = DriverManager.getConnection(url,"root","");
            System.out.println("Veritabanı bağlantısı başarılı");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    static ResultSet listele(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sorgu);
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
