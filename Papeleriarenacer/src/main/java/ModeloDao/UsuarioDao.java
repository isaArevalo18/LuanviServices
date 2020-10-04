package ModeloDao;

import Config.Conexion;
import Controlador.CtrlUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDao extends Conexion {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String sql = "";
    int respuesta = 0;

    //Método de inicio de sesio, consulta a la base de datos
    public String IniciarSesion(String correo, String clave) {
        String nombreusuario ="";
        //Se define la consulta a realizar
        sql = "Select usuario from usuario where usuario=? and clave=?";
        System.out.println(con);
        try {
            //Obtenemos la conexion
            con = getConexion();
            System.out.println(con);
            //Se prepara la consulta
            ps = con.prepareStatement(sql);
            //Se reemplaza los ? por los datos (correo y clave)
            ps.setString(1, correo);
            ps.setString(2, clave);
            //Se ejecuta la consulta
            rs = ps.executeQuery();
            //Si se obtuvo resultados se obtiene el nombre de usuario
            if (rs.next()) {
                nombreusuario=rs.getString(1);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return nombreusuario;
    }

    
    //Método para comprobar que el correo exisyte en la base de datos
    public String comprobarCorreo(String correo) {
        String password = "";
        //Se define la consulta a realizar
        sql = "Select clave from usuario where correo=?";
        try {
            //Obtenemos la conexion
            con = getConexion();
            //Se prepara la consulta
            ps = con.prepareStatement(sql);
            //Se remplaza el ? por el dato (correo)
            ps.setString(1, correo);
            rs = ps.executeQuery();
            //Si se obtuvo resultados se obtiene el nombre de usuario
            if (rs.next()) {
                password = rs.getString(1);
            }else{
                JOptionPane.showMessageDialog(null, "Correo no existente.");
            }
            //Cierra la conexion a la base de datos
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return password;
    }
}
