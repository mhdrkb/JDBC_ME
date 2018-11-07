package com.mhd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryInTableWithObject {
    
    private static Connection conn = MySqlDbConnection.getConnection();
    
    
    public static ResultSet getDataUsingQueryObject(int id){
       ResultSet rs = null;
    String sqlQuery = "select * from division where id = ?";
        try {
            PreparedStatement psQuery = conn.prepareStatement(sqlQuery);
            psQuery.setInt(1, id);
            rs = psQuery.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(QueryInTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
