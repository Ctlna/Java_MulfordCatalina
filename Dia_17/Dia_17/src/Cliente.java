import com.sun.jdi.connect.spi.Connection;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Cliente {
    private Conexion conexion;

    public Cliente(){
        try {
            this.conexion = new Conexion();
        } catch (IOException e) {
            System.out.println("Error al cargar la configuración: " + e.getMessage());
        }
    }

    // Método para obtener todos los clientes
    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";
        
        try (Connection conn = conexion.connection;
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTipo(rs.getString("tipo"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los clientes: " + e.getMessage());
        }
        return clientes;
    }

    // Método para agregar un nuevo cliente
    public boolean agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO Cliente(nombre, tipo) VALUES(?, ?)";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getTipo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
            return false;
        }
    }    
}
