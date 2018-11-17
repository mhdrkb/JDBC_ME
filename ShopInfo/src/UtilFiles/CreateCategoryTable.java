package UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateCategoryTable {

    private static Connection conn = SqlJdbcConnection.getConnection();

    public static void createCatagory() {
        String createTable = "create table catagory(c_id int(11) auto_increment primary key, c_name varchar(30))";
        try {
            PreparedStatement ps = conn.prepareStatement(createTable);
            ps.executeUpdate();
            System.out.println("table created");
        } catch (SQLException ex) {
            Logger.getLogger(CreateCategoryTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
