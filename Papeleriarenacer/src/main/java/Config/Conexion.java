package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private Connection con = null;
    //URL de conexion a la base de datos
    private String url = "jdbc:postgresql://localhost:5432/papeleriarenacerbd";
    //Usuario de la base de datos
    private String user = "postgres";
    //Clave de la base de datos
    private String password = "12345";

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            //Conexion a la base usando la URL, usuario y clave
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            //Mensaje de error al conectar a la base
            System.out.println(e);
        }
    }

    public Connection getConexion() {
        //Retorna la conexion 
        return con;
    }
}
