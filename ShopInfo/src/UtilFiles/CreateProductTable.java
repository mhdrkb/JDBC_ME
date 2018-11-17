package UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateProductTable {

    private static Connection conn = SqlJdbcConnection.getConnection();

    public static void createProduct() {
        String createTable = "create table product(p_id int(10) auto_increment primary key, p_name varchar(30), p_quantity int(10), p_unitPrice double , p_totalPrice double, p_purchageDate Date, catagory_id int(11), FOREIGN KEY (catagory_id) REFERENCES catagory(c_id))";
        try {
            PreparedStatement ps = conn.prepareStatement(createTable);
            ps.executeUpdate();
            System.out.println("product table created");
        } catch (SQLException ex) {
            Logger.getLogger(CreateProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
