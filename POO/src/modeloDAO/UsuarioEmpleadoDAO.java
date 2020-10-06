package modeloDAO;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Empleado;

public class UsuarioEmpleadoDAO extends Conexion {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String sql = "";
    int respuesta = 0;

    public int insertarUsuario(Empleado eu) {
        sql = "insert into Usuario(cedula,nombre,apellido,fechaNacimiento,direccion,telefono,correo) values(?,?,?,?,?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, eu.getCedula());
            ps.setString(2, eu.getNombre());
            ps.setString(3, eu.getApellido());
            ps.setString(4, eu.getFechaNacimiento());
            ps.setString(5, eu.getDireccion());
            ps.setString(6, eu.getTelefono());
            ps.setString(7, eu.getCorreo());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar usuario" + e);
        }
        return respuesta;
    }

    public int insertarEmpleado(Empleado eu) {
        sql = "INSERT INTO empleado(cargo,clave,usuario,fechaCreacion,idusuario) VALUES (?,?,?,?,?)";
        // sql = "INSERT INTO empleado (cargo,clave,usuario,idusuario) VALUES cargo=?,clave=?,usuario=?,idusuario=?;";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, eu.getCargo());
            ps.setString(2, eu.getClave());
            ps.setString(3, eu.getUsuario());
            ps.setString(4, eu.getFechaCreacion());
            ps.setInt(5, eu.getIdusuario());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar Empleado" + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }

    public List<Empleado> Listar() {
        sql = "SELECT u.idusuario,cedula,nombre,apellido,fechaNacimiento,fechaCreacion,direccion,telefono,correo,cargo,clave,usuario "
                + "FROM usuario u INNER JOIN empleado e ON u.idusuario = e.idusuario ORDER BY u.idusuario DESC";
        List<Empleado> empleados = new ArrayList<>();
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado eu = new Empleado();
                eu.setIdusuario(rs.getInt(1));
                eu.setCedula(rs.getString(2));
                eu.setNombre(rs.getString(3));
                eu.setApellido(rs.getString(4));
                eu.setFechaNacimiento(rs.getString(5));
                eu.setFechaCreacion(rs.getString(6));
                eu.setDireccion(rs.getString(7));
                eu.setTelefono(rs.getString(8));
                eu.setCorreo(rs.getString(9));
                eu.setCargo(rs.getString(10));
                eu.setClave(rs.getString(11));
                eu.setUsuario(rs.getString(12));
                empleados.add(eu);
            }
        } catch (Exception e) {
            System.out.println("Error al listar empleado " + e);
        } finally {
            CerrarConexion();
        }
        return empleados;
    }

    public int Actualizar(Empleado eu) {
        sql = "UPDATE usuario u INNER JOIN empleado e ON  u.idusuario=e.idusuario"
                + " SET cedula=?,nombre=?,apellido=?,fechaNacimiento=?,fechaCreacion=?,direccion=?,telefono=?,correo=?,cargo=?,clave=?,usuario=? "
                + "WHERE u.idusuario=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, eu.getCedula());
            ps.setString(2, eu.getNombre());
            ps.setString(3, eu.getApellido());
            ps.setString(4, eu.getFechaNacimiento());
            ps.setString(5, eu.getFechaCreacion());
            ps.setString(6, eu.getDireccion());
            ps.setString(7, eu.getTelefono());
            ps.setString(8, eu.getCorreo());
            ps.setString(9, eu.getCargo());
            ps.setString(10, eu.getClave());
            ps.setString(11, eu.getUsuario());
            ps.setInt(12, eu.getIdusuario());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error de actualizacion empleado" + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }

    public int Eliminar(int id) {
        try {
            sql = "DELETE FROM Usuario where idusuario=" + id;
            con = getConexion();
            ps = con.prepareStatement(sql);
            respuesta = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error de Eliminacion empleado " + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }

    //Metodo parqa obtener el id del usuario
    public int IdUsuario() {
        int id = 0;
        sql = "select max(idusuario) from usuario";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener id_usuario" + e);
        }
        return id;
    }
    
    public boolean iniciar_sesion(String usuario, String clave){
        Boolean sesion = false;
        sql = "SELECT usuario FROM `empleado` WHERE usuario=? AND clave=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                sesion = true;
            }
        } catch (Exception e) {
            System.out.println("Error al iniciar sesion" + e);
        }
        return sesion;
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
