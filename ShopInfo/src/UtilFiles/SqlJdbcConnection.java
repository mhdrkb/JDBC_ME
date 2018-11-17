
package UtilFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlJdbcConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "shopinfo";
    private static final String URL = HOST + "/" + DBNAME;
    private static Connection conn = null;
    
    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(URL,"root","1234");
            System.out.println(":Connected:");
        } catch (SQLException ex) {
            Logger.getLogger(SqlJdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return conn;
    }
}
