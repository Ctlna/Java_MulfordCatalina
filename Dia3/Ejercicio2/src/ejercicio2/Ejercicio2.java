/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import com.mysql.cj.xdevapi.Statement;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion n = new Conexion();
        Scanner sc = new Scanner(System.in);
        Connection cn = n.establecerConexion();
        PreparedStatement p = null;
        Statement st;
        ResultSet rs;
        int hacer;
        

        do {
            System.out.print("Que deseas hacer:");
            System.out.print("1. Ver hospital \n2. Eliminar hospital \n3. Actualizar hospital \n4. Nuevo hospital");
            hacer=sc.nextInt(); 

            switch (hacer){
                case 1:
                    cn.ver.java();
                    break;
                case 2:
                    cn.Eliminar.java();
                    break;
            } while (hacer != 5);
            System.out.print("Se ingreso mal el número");
}
            
            /*System.out.print("Ingrese Fecha de Nacimiento (Año-Mes-Día): ");
            String nacimientoStr = sc.nextLine();
            LocalDate nacimiento = LocalDate.parse(nacimientoStr);


            // La edad
            LocalDate hoy = LocalDate.now();
            Period periodo = Period.between(nacimiento, hoy);
            int edad = periodo.getYears();

            System.out.println("Datos de la persona añadidos:");
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Dirección: " + direccion);
                System.out.println("Título: " + titulo);
                System.out.println("Fecha de Nacimiento: " + nacimiento);
                System.out.println("Edad: " + edad);
        */