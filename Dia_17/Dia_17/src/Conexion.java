import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    Connection connection;
    public Conexion() throws IOException{
        Properties props = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("Config.properties")){
            if (input == null){
                throw new IllegalStateException("Archivo Innexistente :(");
            }
            props.load(input);
            String url= props.getProperty("url");
            String user = props.getProperty("user");
            String passw = props.getProperty("password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,passw);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
    }
}
