
package factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConnection() {
        
        try {
            return DriverManager.getConnection
        ("jdbc:mysql://localhost/jcruddb", "root", "mulinhas");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }

}
