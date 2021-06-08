/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    static Connection conn;
    
    public static Connection connection(){
        if (conn ==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_dutacoding");
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
