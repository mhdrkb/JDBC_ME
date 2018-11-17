
package UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertIntoCatagory {
    private static Connection conn = SqlJdbcConnection.getConnection();
    
    
    public static void insert(Catagory catagory){
    String insrtSql = "insert into catagory(c_name) values(?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insrtSql);
            ps.setString(1, catagory.getName());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoCatagory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Catagory> getCatagory() {
          List<Catagory> list = new ArrayList<>();
        
            Catagory s;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from catagory");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Catagory();
                s.setC_id(rs.getInt(1));
                s.setName(rs.getString(2));             
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoCatagory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        return list;
    }
}

