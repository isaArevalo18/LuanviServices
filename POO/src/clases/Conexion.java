
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con=null;
    private String bd="proyectoaguadb";
    private String url="jdbc:mysql://localhost:3306/"+bd;
    private String user="root";
    private String password="";

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public Connection getConexion(){
        return con;
    }

}
