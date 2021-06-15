package mvc.Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    static Connection conn;
    
    public static Connection connection(){
        if (conn ==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_barang");
            data.setPassword("");
            data.setUser("root");
            try {
                conn = (Connection) data.getConnection();
            } catch (SQLException e) {
                System.out.println("Tidak tersambung");
            }
        }
        return conn;
    }
}
