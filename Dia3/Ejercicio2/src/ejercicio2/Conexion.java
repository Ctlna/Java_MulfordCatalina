/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection si;
    public Conexion () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            si = DriverManager.getConnection("mysql://uezgrku6encoyi0v:5pNH3nc3ZIfqAwKWCqtX@br9cfbdmn0cso9bzuj8k-mysql.services.clever-cloud.com:3306/br9cfbdmn0cso9bzuj8k ","uezgrku6encoyi0v","5pNH3nc3ZIfqAwKWCqtX");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:" +e);
        }
    }
}