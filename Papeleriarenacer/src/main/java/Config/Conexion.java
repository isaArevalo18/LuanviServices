package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private Connection con = null;
    private String url = "jdbc:postgresql://localhost:5432/papeleriarenacerbd";
    private String user = "postgres";
    private String password = "1234";

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConexion() {
        return con;
    }
}
