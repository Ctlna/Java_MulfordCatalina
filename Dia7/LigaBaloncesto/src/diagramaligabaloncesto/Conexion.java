/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramaligabaloncesto;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection connection;
    
    public Conexion()throws IOException{
        Properties props = new Properties();
        try(InputStream input = getClass().getClassLoader().getResourceAsStream("Config.properties")) {
            
            if(input == null){
                throw new IllegalStateException("Archivo no existente :(");
            }
            
            props.load(input);
            String url=props.getProperty("url");
            String user=props.getProperty("user");
            String password=props.getProperty("password");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection=DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:" +e);
        }
    }
}
