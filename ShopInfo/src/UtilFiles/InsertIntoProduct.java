package UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertIntoProduct {

    private static Connection conn = SqlJdbcConnection.getConnection();

    public static void insert(Product product) {
        String insrtSql = "insert into product(p_name , p_quantity , p_unitPrice  , p_totalPrice , p_purchageDate , catagory_id) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insrtSql);
            ps.setString(1, product.getP_name());
            ps.setInt(2, product.getP_quantity());
            ps.setDouble(3, product.getP_unitPrice());
            ps.setDouble(4, product.getP_totalPrice());
            ps.setDate(5, new java.sql.Date(product.getP_purchaseDate().getTime()));
            ps.setInt(6, product.getCatragory().getC_id());
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
