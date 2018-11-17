package com.UtilFiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentList {

    private static Connection conn = SqlConnection.getConnection();

    public static List<Student> getStudent() {
        Student s;
        List<Student> list = new ArrayList<>();
        String sqlQuery = "select * from student_info";
        try {
            PreparedStatement sqlStmnt = conn.prepareStatement(sqlQuery);
            ResultSet rs = sqlStmnt.executeQuery();
            while (rs.next()) {     
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setEmail(rs.getString(3));
                list.add(s);
               // list.add(new Student (rs.getInt(1),rs.getString(2),rs.getString(3))); whilw using costructor directly assigned
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return list;
    }
}
