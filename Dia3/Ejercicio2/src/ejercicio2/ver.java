/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ver {
    Conexion n = new Conexion();
    Scanner sc = new Scanner(System.in);
    Connection cn = n.establecerConexion();
    PreparedStatement p = null;
    Statement st;
    ResultSet rs;
    
    try{
        st = (Statement) cn.createStatement();
        rs = st.executeQuery("select id, nombre from hospital");
        while (rs.next()){
            System.out.printIn(rs.getInt("id")+ " "+rs.getString("nombre"));
        }
    }catch (Exception e){
        System.err.print("Error "+ e);
    }
}
