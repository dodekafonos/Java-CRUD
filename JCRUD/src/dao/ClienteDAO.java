
package dao;

import factory.ConnectionFactory;
import java.sql.*;
import model.Cliente;

public class ClienteDAO {
    
    private Connection connection;
    
    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona (Cliente cliente) {
        String sql = "INSERT INTO cliente (nome) VALUES (?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException (u);
        }
    }
    
    
}
