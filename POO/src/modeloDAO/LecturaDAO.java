package modeloDAO;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import modelo.Cliente;
import modelo.Lecturas;

public class LecturaDAO extends Conexion {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String sql = "";
    int respuesta = 0;

    public int Insertar(Lecturas lec) {
        sql = "INSERT INTO lectura(lectura,fechaLectura,consumo,estado,idcliente,valorpago,lecturaanterior,fechaLecturaAnterior) "
                + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, lec.getLectura());
            ps.setString(2, lec.getFechalectura());
            ps.setDouble(3, lec.getConsumo());
            ps.setString(4, lec.getEstado());
            ps.setInt(5, lec.getIdCliente());
            ps.setDouble(6, lec.getValorpago());
            ps.setInt(7, lec.getLecturaAnterior());
            ps.setString(8, lec.getFechaLecturaAnterior());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar Lectura " + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }
    
    public int InsertarN(Lecturas lec) {
        sql = "INSERT INTO lectura(lectura,fechaLectura,consumo,estado,idcliente,valorpago) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, lec.getLectura());
            ps.setString(2, lec.getFechalectura());
            ps.setDouble(3, lec.getConsumo());
            ps.setString(4, lec.getEstado());
            ps.setInt(5, lec.getIdCliente());
            ps.setDouble(6, lec.getValorpago());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar Lectura " + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }

    /*Busca lso datos del cliente por id o nromedidor*/
    public Cliente buscarLecturaCliente(String parametro) {
        Cliente cliente = new Cliente();
        sql = "SELECT idcliente,nombre,apellido,cedula,numeromedidor,direccion,correo,fechaNacimiento,telefono,fechaCreacion"
                + " FROM usuario u INNER JOIN cliente c ON u.idusuario=c.idUsuario "
                + "WHERE numeromedidor=" + parametro + " OR cedula=" + parametro;
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setApellido(rs.getString(3));
                cliente.setCedula(rs.getString(4));
                cliente.setNum_medidor(rs.getString(5));
                cliente.setDireccion(rs.getString(6));
                cliente.setCorreo(rs.getString(7));
                cliente.setFechaNacimiento(rs.getString(8));
                cliente.setTelefono(rs.getString(9));
                cliente.setFechaCreacion(rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println("Error en buscar cliente lectura: " + e);
        }
        return cliente;
    }

    public List<Lecturas> Listar(int id) {
        /*  sql = "select l.idlectura,lectura,fechaLectura,consumo,estado FROM lectura l INNER JOIN cliente c "
                + "ON c.idcliente=l.idcliente WHERE estado='pendiente' AND l.idcliente=" + id + " ORDER BY fechaLectura DESC";*/
        sql = "select l.idlectura,lectura,fechaLectura,consumo,estado,valorpago"
                + " FROM lectura l INNER JOIN cliente c "
                + "ON c.idcliente=l.idcliente WHERE l.idcliente=" + id + " ORDER BY fechaLectura DESC";
        List<Lecturas> lecturas = new ArrayList<>();
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Lecturas lec = new Lecturas();
                lec.setIdlectura(rs.getInt(1));
                lec.setLectura(rs.getString(2));
                lec.setFechalectura(rs.getString(3));
                lec.setConsumo(rs.getInt(4));
                lec.setEstado(rs.getString(5));
                lec.setValorpago(rs.getDouble(6));
                lecturas.add(lec);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar lectura anterior: " + e);
        }
        return lecturas;
    }

    /*Retorna una lista con totas las lecturas pendientes del cliente*/
    public List<Lecturas> ListarPago(int id) {

        sql = "select l.idlectura,lectura,fechaLectura,consumo,estado,valorpago,EXTRACT(MONTH FROM fechaLectura),fechaLecturaAnterior,lecturaanterior"
                + " FROM lectura l INNER JOIN cliente c "
                + "ON c.idcliente=l.idcliente WHERE estado='pendiente' AND l.idcliente=" + id + " AND consumo<>0 ORDER BY fechaLectura DESC";

        List<Lecturas> lecturas = new ArrayList<>();
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Lecturas lec = new Lecturas();
                lec.setIdlectura(rs.getInt(1));
                lec.setLectura(rs.getString(2));
                lec.setFechalectura(rs.getString(3));
                lec.setConsumo(rs.getInt(4));
                lec.setEstado(rs.getString(5));
                lec.setValorpago(rs.getDouble(6));
                lec.setMeslectura(rs.getInt(7));
                lec.setFechaLecturaAnterior(rs.getString(8));
                lec.setLecturaAnterior(rs.getInt(9));
                lecturas.add(lec);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar lectura anterior: " + e);
        }
        return lecturas;
    }

    /*Obtiene los datos de la ultima lectura del cliente*/
    public Lecturas obtenerUltimaLectura(int id) {
        Lecturas lec = new Lecturas();
        sql = "SELECT lectura,fechaLectura,consumo FROM lectura WHERE idcliente=" + id
                + " AND fechaLectura=(select max(fechaLectura) from lectura where idcliente=" + id + ")";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                lec.setLectura(rs.getString(1));
                lec.setFechalectura(rs.getString(2));
                lec.setConsumo(rs.getInt(3));
            }
        } catch (Exception e) {
            System.out.println("Error al buscar lectura anterior: " + e);
        } finally {
            CerrarConexion();
        }
        return lec;
    }

    public int Editar(Lecturas lec) {
        sql = "UPDATE lectura SET lectura=?,fechaLectura=?,consumo=?,valorpago=? WHERE idlectura=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, lec.getLectura());
            ps.setString(2, lec.getFechalectura());
            ps.setInt(3, lec.getConsumo());
            ps.setDouble(4, lec.getValorpago());
            ps.setInt(5, lec.getIdlectura());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al editar la lectura: " + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }

    public int Eliminar(int id) {
        sql = "DELETE FROM Lectura where idlectura=" + id;
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar lectura: " + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
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
