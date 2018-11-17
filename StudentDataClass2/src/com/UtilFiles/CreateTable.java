
package com.UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTable {
    private static Connection conn = SqlConnection.getConnection();
    
    
    public static void createStudentTable(){
    String create = "create table student_info(id int(11) auto_increment primary key, name varchar(30), email varchar(30))";
        try {
            PreparedStatement ps = conn.prepareStatement(create);
            ps.executeUpdate();
            System.out.println("Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
