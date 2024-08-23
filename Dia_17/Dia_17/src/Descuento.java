import java.sql.*;
import java.math.BigDecimal;

public class Descuento {
    private Conexion conexion;

    public Descuento() {
        try {
            this.conexion = new Conexion();
        } catch (IOException e) {
            System.out.println("Error al cargar la configuración: " + e.getMessage());
        }
    }

    public boolean aplicarDescuento(int idProducto, BigDecimal porcentajeDescuento) {
        String sql = "UPDATE Producto SET precio = precio - (precio * ?) WHERE id_producto = ?";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setBigDecimal(1, porcentajeDescuento);
            pstmt.setInt(2, idProducto);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al aplicar el descuento: " + e.getMessage());
            return false;
        }
    }
    
    public boolean revertirDescuento(int idProducto, BigDecimal porcentajeDescuento) {
        String sql = "UPDATE Producto SET precio = precio / (1 - ?) WHERE id_producto = ?";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setBigDecimal(1, porcentajeDescuento);
            pstmt.setInt(2, idProducto);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al revertir el descuento: " + e.getMessage());
            return false;
        }
    }
}
