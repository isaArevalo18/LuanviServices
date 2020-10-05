package modeloDAO;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class UsuarioClienteDAO extends Conexion {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String sql = "";
    int respuesta = 0;

    public int InsertarUsuario(Cliente cu) {
        sql = "insert into Usuario(cedula,nombre,apellido,fechaNacimiento,direccion,telefono,correo) values(?,?,?,?,?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cu.getCedula());
            ps.setString(2, cu.getNombre());
            ps.setString(3, cu.getApellido());
            ps.setString(4, cu.getFechaNacimiento());
            ps.setString(5, cu.getDireccion());
            ps.setString(6, cu.getTelefono());
            ps.setString(7, cu.getCorreo());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar usuario" + e);
        }
        return respuesta;
    }

    public int InsertarCliente(Cliente c) {
        sql = "insert into Cliente(fechaCreacion,numeromedidor,idUsuario) values(?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getFechaCreacion());
            ps.setString(2, c.getNum_medidor());
            ps.setInt(3, c.getIdusuario());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar cliente" + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }

    public List<Cliente> Listar() {
        sql = "SELECT c.idUsuario,cedula,nombre,apellido,fechaNacimiento,fechacreacion,direccion,telefono,correo,numeromedidor"
                + " FROM usuario u INNER JOIN  cliente c ON u.idusuario=c.idUsuario ORDER BY c.idUsuario DESC";
        List<Cliente> clientes = new ArrayList<>();
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdusuario(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setFechaNacimiento(rs.getString(5));
                c.setFechaCreacion(rs.getString(6));
                c.setDireccion(rs.getString(7));
                c.setTelefono(rs.getString(8));
                c.setCorreo(rs.getString(9));
                c.setNum_medidor(rs.getString(10));
                clientes.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error al listar " + e);
        } finally {
            CerrarConexion();
        }
        return clientes;
    }

    public int Actualizar(Cliente uc) {
        sql = "UPDATE Usuario u INNER JOIN Cliente c ON  u.idusuario=c.idusuario"
                + " SET cedula=?,nombre=?,apellido=?,fechaNacimiento=?,direccion=?,telefono=?,correo=?,fechaCreacion=?,numeromedidor=? "
                + "WHERE u.idusuario=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, uc.getCedula());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getApellido());
            ps.setString(4, uc.getFechaNacimiento());
            ps.setString(5, uc.getDireccion());
            ps.setString(6, uc.getTelefono());
            ps.setString(7, uc.getCorreo());
            ps.setString(8, uc.getFechaCreacion());
            ps.setString(9, uc.getNum_medidor());
            ps.setInt(10, uc.getIdusuario());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error de actualizacion" + e);
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
            System.out.println("Error de Eliminacion" + e);
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

    public List<Cliente> Buscar(String cedula) {
        sql = "SELECT c.idUsuario,cedula,nombre,apellido,fechaNacimiento,fechacreacion,direccion,telefono,correo,numeromedidor"
                + " FROM usuario u INNER JOIN  cliente c ON u.idusuario=c.idUsuario WHERE cedula=" + cedula;
        List<Cliente> clientes = new ArrayList<>();
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdusuario(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setFechaNacimiento(rs.getString(5));
                c.setFechaCreacion(rs.getString(6));
                c.setDireccion(rs.getString(7));
                c.setTelefono(rs.getString(8));
                c.setCorreo(rs.getString(9));
                c.setNum_medidor(rs.getString(10));
                clientes.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar cliente " + e);
        } finally {
            CerrarConexion();
        }
        return clientes;
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
