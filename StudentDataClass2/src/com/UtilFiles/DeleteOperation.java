package com.UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteOperation {

    private static Connection conn = SqlConnection.getConnection();

    public static void deleteTableRow() {
        Student s = new Student();
        String sqlDelete = "delete from student_info where id = ?";
        try {
            PreparedStatement psDelete = conn.prepareStatement(sqlDelete);
            s.getId();
            psDelete.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DeleteOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
