import logico.Cartera;
import persistencia.LecturaEscritura;

import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection connection;
            int opcion = 3;
            do {
                System.out.println("""
                        1. Consulta general de todas las tarjetas
                        2. Consulta de tarjetas por mes
                        3. Salir
                        Digite una opci\u00f3n del men\u00fa""");
                Scanner sc = new Scanner(System.in);
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> {
                        LecturaEscritura le = new LecturaEscritura("enero");
                        le.leerTarjetas();
                        le.setFileName("febrero");
                        le.leerTarjetas();
                        le.setFileName("marzo");
                        le.leerTarjetas();
                        le.setFileName("abril");
                        le.leerTarjetas();
                        le.setFileName("mayo");
                        le.leerTarjetas();
                        le.setFileName("junio");
                        le.leerTarjetas();
                        le.setFileName("julio");
                        le.leerTarjetas();
                        le.setFileName("agosto");
                        le.leerTarjetas();
                        le.setFileName("septiembre");
                        le.leerTarjetas();
                        le.setFileName("octubre");
                        le.leerTarjetas();
                        le.setFileName("noviembre");
                        le.leerTarjetas();
                        le.setFileName("diciembre");
                        le.leerTarjetas();
                        le.escribirTarjetas(le.getList());//Generar reporte
                        Cartera b1 = new Cartera("2024");
                        b1.setTarjeta(le.getList());
                        b1.imprimirListaDeTarjetas();
                    }
                    case 2 -> {
                        System.out.println("Digite el mes que desea consultar: ");
                        String mes = sc.next();
                        consultarTarjetaMes(mes.toLowerCase());
                    }
                    default -> {
                        System.out.println("Digite una opción correcta del Menú");
                    }
                }
            } while (opcion != 3);

    }

    public static void consultarTarjetaMes(String mes){
        LecturaEscritura l = new LecturaEscritura(mes);
        l.leerTarjetas();
        Cartera c= new Cartera("2024");
        c.setTarjeta(l.getList());
        c.imprimirListaDeTarjetas();
    }
}