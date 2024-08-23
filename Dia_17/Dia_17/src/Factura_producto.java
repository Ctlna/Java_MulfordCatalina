import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Factura_producto {
    private Conexion conexion;
    private Descuento descuento;

    public Factura_producto() {
        try {
            this.conexion = new Conexion();
            this.descuento = new Descuento();
        } catch (IOException e) {
            System.out.println("Error al cargar la configuración: " + e.getMessage());
        }
    }

    // Método para calcular el total de la compra
    public BigDecimal calcularTotalCompra(int idFactura) {
        BigDecimal total = BigDecimal.ZERO;
        String sql = "SELECT p.precio, fp.cantidad, fp.descuento " +
                     "FROM Factura_producto fp " +
                     "JOIN Producto p ON fp.id_producto = p.id_producto " +
                     "WHERE fp.id_factura = ?";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idFactura);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                BigDecimal precio = rs.getBigDecimal("precio");
                int cantidad = rs.getInt("cantidad");
                BigDecimal porcentajeDescuento = rs.getBigDecimal("descuento");

                BigDecimal precioConDescuento = descuento.calcularPrecioConDescuento(precio, porcentajeDescuento);
                total = total.add(precioConDescuento.multiply(BigDecimal.valueOf(cantidad)));
            }
        } catch (SQLException e) {
            System.out.println("Error al calcular el total de la compra: " + e.getMessage());
        }
        return total;
    }

    // Método para agregar un producto a una factura con un descuento opcional
    public boolean agregarProductoAFactura(FacturaProducto productoFactura, BigDecimal porcentajeDescuento) {
        String sql = "INSERT INTO Factura_producto(id_factura, id_producto, cantidad, descuento) VALUES(?, ?, ?, ?)";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, productoFactura.getIdFactura());
            pstmt.setInt(2, productoFactura.getIdProducto());
            pstmt.setInt(3, productoFactura.getCantidad());
            pstmt.setBigDecimal(4, porcentajeDescuento);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto a la factura: " + e.getMessage());
            return false;
        }
    }
}
