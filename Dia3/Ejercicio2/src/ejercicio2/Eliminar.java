/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Eliminar {
    Conexion n = new Conexion();
    Scanner sc = new Scanner(System.in);
    PreparedStatement p = null;
    Connection cn = n.establecerConexion();
    int hospital;
    
    public static void eliminar(){
    try {
        p = cn.prepareStatement("delete from hospital where id = ?");
        System.out.printIn("ID del hospital que deseas eliminar:");
        hospital = sc.nextInt();
        p.setInt(1,hospital);
        p.executeUpdate();
    } catch (Exception e){
        System.err.print("Error "+ e);
}
}
}