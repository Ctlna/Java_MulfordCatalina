/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Ingrese Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese Dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Ingrese Título: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese Fecha de Nacimiento (Año-Mes-Día): ");
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
    }
    
}
