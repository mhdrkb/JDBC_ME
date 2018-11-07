package com.mhd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TableOperations {
    private  static Connection conn = MySqlDbConnection.getConnection();
    
    public  static  void insertData(){
    String sqlInsert = "insert into division(id,name) values (1,'dhaka')";
       
        try {
            PreparedStatement psInsert = conn.prepareStatement(sqlInsert);
            psInsert.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(TableOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  static  void insertData2(int divisionID, String divisionName){
    String sqlInsert = "insert into division(id,name) values (?,?)";
       
        try {
            PreparedStatement psInsert1 = conn.prepareStatement(sqlInsert);
            psInsert1.setInt(1, divisionID);
            psInsert1.setString(2, divisionName);
            psInsert1.executeUpdate();
            System.out.println("Data inserted");
        } catch (SQLException ex) {
            Logger.getLogger(TableOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public  static  void UpdateTable(int divisionID, String divisionName ){
    String sqlUpdate = "update division set name = ? where id = ?";
       
        try {
            PreparedStatement psUpdate = conn.prepareStatement(sqlUpdate);
            psUpdate.setString(1, divisionName);
            psUpdate.setInt(2, divisionID);
            psUpdate.executeUpdate();
            System.out.println("Data Updated");
        } catch (SQLException ex) {
            Logger.getLogger(TableOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  static  void deleteTableRow(int divisionID ){
    String sqlDelete = "delete from division where id = ?";
       
        try {
            PreparedStatement psDelete = conn.prepareStatement(sqlDelete);
            psDelete.setInt(1, divisionID);
            psDelete.executeUpdate();
            System.out.println("1 row deleted");
        } catch (SQLException ex) {
            Logger.getLogger(TableOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
