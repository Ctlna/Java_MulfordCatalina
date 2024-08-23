import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Factura_producto {
    private Conexion conexion;

    public Factura_producto() {
        try {
            this.conexion = new Conexion();
        } catch (IOException e) {
            System.out.println("Error al cargar la configuración: " + e.getMessage());
        }
    }
    public List<FacturaProducto> obtenerProductosDeFactura(int idFactura) {
        List<FacturaProducto> productosFactura = new ArrayList<>();
        String sql = "SELECT * FROM Factura_producto WHERE id_factura = ?";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idFactura);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                FacturaProducto productoFactura = new FacturaProducto();
                productoFactura.setIdFactura(rs.getInt("id_factura"));
                productoFactura.setIdProducto(rs.getInt("id_producto"));
                productoFactura.setCantidad(rs.getInt("cantidad"));
                productosFactura.add(productoFactura);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los productos de la factura: " + e.getMessage());
        }
        return productosFactura;
    }
    public boolean agregarProductoAFactura(FacturaProducto productoFactura) {
        String sql = "INSERT INTO Factura_producto(id_factura, id_producto, cantidad) VALUES(?, ?, ?)";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, productoFactura.getIdFactura());
            pstmt.setInt(2, productoFactura.getIdProducto());
            pstmt.setInt(3, productoFactura.getCantidad());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto a la factura: " + e.getMessage());
            return false;
        }
    }
}
