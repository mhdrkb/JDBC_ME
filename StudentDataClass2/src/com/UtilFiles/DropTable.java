package com.UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DropTable {

    private static Connection conn = SqlConnection.getConnection();

    public static void dropTable() {
        String delete = "drop table students";
        try {
            PreparedStatement ps = conn.prepareStatement(delete);
        } catch (SQLException ex) {
            Logger.getLogger(DropTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
