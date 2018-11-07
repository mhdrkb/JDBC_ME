
package com.mhd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryInTable {
    private static Connection conn = MySqlDbConnection.getConnection();
    public static void getDataUsingQuery(int id){
    String sqlQuery = "select * from division where id = ?";
        try {
            PreparedStatement psQuery = conn.prepareStatement(sqlQuery);
            psQuery.setInt(1, id);
            ResultSet rs = psQuery.executeQuery();
            while(rs.next()){
                System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryInTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    /**/
    
}
