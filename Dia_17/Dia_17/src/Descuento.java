import java.sql.*;
import java.math.BigDecimal;
import java.util.List;

public class Descuento {
      public List<BigDecimal> aplicarDescuento(List<BigDecimal> preciosOriginales, BigDecimal porcentajeDescuento) {
        return preciosOriginales.stream()
                .map(precio -> precio.subtract(precio.multiply(porcentajeDescuento)))
                .collect(Collectors.toList());
    }
}
