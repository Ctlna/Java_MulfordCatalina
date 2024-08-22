public class Conexion {
    Connection connection;

    public Conexion() throws IOException{
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
