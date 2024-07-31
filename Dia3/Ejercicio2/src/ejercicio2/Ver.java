/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ver {
    Scanner sc = new Scanner(System.in);
    public Ver(){}

    public void ver_hospital() throws IOException {
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;

        try{
            st = (Statement) cn.connection.createStatement();
            rs = st.executeQuery("select * from hospital;");
            while (rs.next()){
                System.out.println(rs.getInt("id")+ " "+rs.getString("nombre"));
            }
        }catch (SQLException e){
            System.err.print("Error "+ e);
        }
    }
}
