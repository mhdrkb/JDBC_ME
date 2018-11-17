
package com.OperationFiles;

import com.UtilFiles.SqlConnection;
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = SqlConnection.getConnection();
    }
}
