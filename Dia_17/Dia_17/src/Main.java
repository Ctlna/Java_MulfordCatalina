import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    private static Cliente cliente = new Cliente();
    private static Producto producto = new Producto();
    private static Factura_cliente facturaCliente = new Factura_cliente();
    private static Factura_producto facturaProducto = new Factura_producto();
    private static Descuento descuento = new Descuento();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Crear nuevo producto");
            System.out.println("3. Crear nueva factura de cliente");
            System.out.println("4. Agregar producto a factura");
            System.out.println("5. Calcular total de la compra");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearCliente(scanner);
                    break;
                case 2:
                    crearProducto(scanner);
                    break;
                case 3:
                    crearFacturaCliente(scanner);
                    break;
                case 4:
                    agregarProductoAFactura(scanner);
                    break;
                case 5:
                    calcularTotalCompra(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void crearCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el tipo de cliente: ");
        String tipo = scanner.next();

        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setTipo(tipo);

        if (cliente.agregarCliente(nuevoCliente)) {
            System.out.println("Cliente creado exitosamente.");
        } else {
            System.out.println("Error al crear el cliente.");
        }
    }

    private static void crearProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        BigDecimal precio = scanner.nextBigDecimal();

        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre(nombre);
        nuevoProducto.setPrecio(precio);

        if (producto.agregarProducto(nuevoProducto)) {
            System.out.println("Producto creado exitosamente.");
        } else {
            System.out.println("Error al crear el producto.");
        }
    }

    private static void crearFacturaCliente(Scanner scanner) {
        System.out.print("Ingrese el ID del cliente: ");
        int idCliente = scanner.nextInt();
        System.out.print("Ingrese el total de la factura: ");
        BigDecimal total = scanner.nextBigDecimal();

        FacturaCliente nuevaFacturaCliente = new FacturaCliente();
        nuevaFacturaCliente.setIdCliente(idCliente);
        nuevaFacturaCliente.setTotal(total);

        if (facturaCliente.agregarFacturaCliente(nuevaFacturaCliente)) {
            System.out.println("Factura de cliente creada exitosamente.");
        } else {
            System.out.println("Error al crear la factura de cliente.");
        }
    }

    private static void agregarProductoAFactura(Scanner scanner) {
        System.out.print("Ingrese el ID de la factura: ");
        int idFactura = scanner.nextInt();
        System.out.print("Ingrese el ID del producto: ");
        int idProducto = scanner.nextInt();
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        System.out.print("Ingrese el porcentaje de descuento (como decimal, ej. 0.10 para 10%): ");
        BigDecimal porcentajeDescuento = scanner.nextBigDecimal();

        FacturaProducto nuevoProductoFactura = new FacturaProducto();
        nuevoProductoFactura.setIdFactura(idFactura);
        nuevoProductoFactura.setIdProducto(idProducto);
        nuevoProductoFactura.setCantidad(cantidad);

        if (facturaProducto.agregarProductoAFactura(nuevoProductoFactura, porcentajeDescuento)) {
            System.out.println("Producto agregado a la factura exitosamente.");
        } else {
            System.out.println("Error al agregar el producto a la factura.");
        }
    }

    private static void calcularTotalCompra(Scanner scanner) {
        System.out.print("Ingrese el ID de la factura: ");
        int idFactura = scanner.nextInt();
        BigDecimal total = facturaProducto.calcularTotalCompra(idFactura);
        System.out.println("El total de la compra es: " + total);
    }
}
