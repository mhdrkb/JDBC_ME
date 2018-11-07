package Test;

import com.mhd.QueryInTableWithObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestQueryObject {
    public static void main(String[] args) {
        ResultSet rs = QueryInTableWithObject.getDataUsingQueryObject(6);
        try {
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestQueryObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
