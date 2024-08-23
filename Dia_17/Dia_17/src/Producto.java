import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private Conexion conexion;

    public Producto() {
        try {
            this.conexion = new Conexion();
        } catch (IOException e) {
            System.out.println("Error al cargar la configuración: " + e.getMessage());
        }
    }

    public List<Producto> obtenerTodosLosProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM Producto";
        
        try (Connection conn = conexion.connection;
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId(rs.getInt("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getBigDecimal("precio"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los productos: " + e.getMessage());
        }
        return productos;
    }

    public boolean agregarProducto(Producto producto) {
        String sql = "INSERT INTO Producto(nombre, precio) VALUES(?, ?)";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, producto.getNombre());
            pstmt.setBigDecimal(2, producto.getPrecio());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
            return false;
        }
    }
}
