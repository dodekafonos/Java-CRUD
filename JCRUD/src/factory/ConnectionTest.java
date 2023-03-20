
package factory;

import java.sql.*;

public class ConnectionTest {

    public static void main(String[] args) throws SQLException {

        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Database connection is up.");
        conn.close();

    }
    
}
