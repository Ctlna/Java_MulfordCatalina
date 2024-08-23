import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Factura_cliente {
    private Conexion conexion;

    public Factura_cliente() {
        try {
            this.conexion = new Conexion();
        } catch (IOException e) {
            System.out.println("Error al cargar la configuración: " + e.getMessage());
        }
    }
    public List<FacturaCliente> obtenerTodasLasFacturas() {
        List<FacturaCliente> facturas = new ArrayList<>();
        String sql = "SELECT * FROM Factura_cliente";
        
        try (Connection conn = conexion.connection;
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                FacturaCliente factura = new FacturaCliente();
                factura.setIdFaCli(rs.getInt("id_FaCli"));
                factura.setIdCliente(rs.getInt("id_cliente"));
                factura.setTotal(rs.getBigDecimal("total"));
                facturas.add(factura);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las facturas: " + e.getMessage());
        }
        return facturas;
    }
    public boolean agregarFacturaCliente(FacturaCliente factura) {
        String sql = "INSERT INTO Factura_cliente(id_cliente, total) VALUES(?, ?)";
        
        try (Connection conn = conexion.connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, factura.getIdCliente());
            pstmt.setBigDecimal(2, factura.getTotal());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar la factura: " + e.getMessage());
            return false;
        }
    }
}
