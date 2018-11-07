
package Test;

import com.mhd.MySqlDbConnection;
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = MySqlDbConnection.getConnection();
    }
}
