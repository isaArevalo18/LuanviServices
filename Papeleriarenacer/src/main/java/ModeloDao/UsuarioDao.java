package ModeloDao;

import Config.Conexion;
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

    public String IniciarSesion(String correo, String clave) {
        String nombreusuario ="";
        sql = "Select usuario from usuario where correo=? and clave=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreusuario=rs.getString(1);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    
        return nombreusuario;
    }

    public String recuperarContraseña(String correo) {
        String password = "";
        sql = "Select clave from usuario where correo=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();
            if (rs.next()) {
                password = rs.getString(1);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return password;
    }
}
