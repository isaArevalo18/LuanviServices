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
        String nombreusuario = "";
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
                nombreusuario = rs.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }finally{
            CerrarConexion();
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
            } else {
                JOptionPane.showMessageDialog(null, "Correo no existente.");
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return password;
    }

    public int actualizarClave(String claveanterior, String clave) {
        int r = 0;
        sql = "UPDATE usuario SET clave=? WHERE clave=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, clave);
            ps.setString(2, claveanterior);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar el correo " + e);
        }finally{
            CerrarConexion();
        }
        return r;
    }

    public void CerrarConexion() {
        try {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (Exception e) {
            System.out.println("Error de conexion" + e);
        }
    }

}
