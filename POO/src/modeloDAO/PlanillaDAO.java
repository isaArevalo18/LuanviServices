package modeloDAO;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.DetallePlanilla;
import modelo.Lecturas;
import modelo.Planilla;

public class PlanillaDAO extends Conexion {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String sql = "";
    int respuesta = 0;

    public int insertar(DetallePlanilla p) {
        sql = "insert into Planilla(fechaplanilla,total,idlectura,valorsinexceso,valorexceso) values(?,?,?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getFechaPlanilla());
            ps.setDouble(2, p.getTotal());
            ps.setInt(3, p.getIdlectura());
            ps.setDouble(4, p.getConsumosinexceso());
            ps.setDouble(5, p.getConsumoexceso());

            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al guardar la planilla " + e);
        }
        return respuesta;
    }

//    public int actualizar(Planilla p) {
//        sql = "update Planilla set fechaplanilla=? where idCliente=?";
//        try {
//            con = getConexion();
//            ps = con.prepareStatement(sql);
//            ps.setString(1, p.getFechaPlanilla());
//            ps.setInt(2, p.getIdCliente());
//            respuesta = ps.executeUpdate();
//        } catch (Exception e) {
//            System.out.println("Error al actualizar la planilla " + e);
//        } finally {
//            CerrarConexion();
//        }
//        return respuesta;
//    }
    public int eliminar(int id) {
        sql = "DELETE FROM Planilla WHERE idplanilla=" + id;
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar la planilla " + e);
        } finally {
            CerrarConexion();
        }
        return respuesta;
    }

    public List<DetallePlanilla> Listar(String parametro) {
        List<DetallePlanilla> planillasdetalle = new ArrayList<>();
        sql = "SELECT idplanilla,l.idlectura,fechaplanilla,cedula,nombre,apellido,direccion,numeromedidor,estado,total\n"
                + "FROM cliente c\n"
                + "INNER JOIN usuario u ON c.idUsuario=u.idusuario \n"
                + "INNER JOIN lectura l ON  c.idcliente=l.idcliente \n"
                + "INNER JOIN planilla p ON p.idlectura=l.idlectura \n"
                + "WHERE estado='pagado' AND cedula=" + parametro + " OR numeromedidor=" + parametro + " ORDER BY idplanilla DESC";

        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetallePlanilla dp = new DetallePlanilla();
                dp.setIdplanilla(rs.getInt(1));
                dp.setIdlectura(rs.getInt(2));
                dp.setFechaPlanilla(rs.getString(3));
                dp.setCedula(rs.getString(4));
                dp.setNombrecliente(rs.getString(5));
                dp.setApellidopcliente(rs.getString(6));
                dp.setDireccioncliente(rs.getString(7));
                dp.setNumeromedidor(rs.getString(8));
                dp.setEstado(rs.getString(9));
                dp.setTotal(rs.getDouble(10));
                planillasdetalle.add(dp);
            }
        } catch (Exception e) {
            System.out.println("Error al Listar detalle factura " + e);
        } finally {
            CerrarConexion();
        }
        return planillasdetalle;
    }

    /*
      * Este metodo trabaja con insertar y realiza el proceso de pago de la lectura lo cual consiste:
      * En realizar la actualizacion de las lecturas en estado pendiende a pagado y a asignarle una fecha de pago
      * a la lectura
     */
    public int pagoLectura(Double consumo, String fecha, String estado) {
        sql = "UPDATE lectura SET estado=?,fechapago=? WHERE consumo=?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setString(2, fecha);
            ps.setDouble(3, consumo);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al realizar el pago de la lectura,pago cancelado " + e);
            if (eliminarUltimaPlanilla() > 0) {
                JOptionPane.showMessageDialog(null, "Emision Planilla Cancelada");
            }
        }finally{
            CerrarConexion();
        }
        return respuesta;
    }

    /*
      Este metodo trabaja con pagoLectura y eliminara la planilla en caso de que no se pueda concretar el proceso de pago de la misma
      * Este metodo funcionara solo en caso de error
     */
    private int eliminarUltimaPlanilla() {
        sql = "DELETE FROM Planilla WHERE idplanilla=(SELECT max(idplanilla) FROM Planilla)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar la planilla " + e);
        }
        return respuesta;
    }

    /*
     * Este metodo va a crear una Lista de las lecturas que pertenecen a un planilla que va a ser eliminada 
     * Tambien este metodo va a cambiar el estado de las Lecturas a Pendiente para poder volver a realizar la planilla de las mismas
     
    public List<Lecturas> listarLecturasPlanillaEliminada(String fechapago) {
        List<Lecturas> lecturasplanilla = new ArrayList<>();
        sql = "select idlectura,lectura,fechaLectura,consumo,estado,idcliente,fechapago FROM lectura WHERE fechapago=" + fechapago;
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Lecturas lectura = new Lecturas();
                lectura.setIdlectura(rs.getInt(1));
                lectura.setLectura(rs.getString(2));
                lectura.setFechalectura(rs.getString(3));
                lectura.setConsumo(rs.getInt(4));
                lectura.setEstado(rs.getString(5));
                lectura.setIdCliente(rs.getInt(6));
                //Cambiamos el estado de las lecturas a pendiente
                cambiarEstadoLectura(rs.getString(7));
                lecturasplanilla.add(lectura);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener lecturas de factura eliminada: " + e);
        } finally {
            CerrarConexion();
        }
        return lecturasplanilla;
    }
     */
 /*
     * Este metodo se encargara de cambiar el estado de todas aquellas lecturas de la planilla eliminada
     * a un estado pendiente para volver a emitir la planilla
     */
    public int cambiarEstadoLectura(int idlectura) {
        sql = "UPDATE lectura SET estado='pendiente' WHERE idlectura=?";
        System.out.println(sql);
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idlectura);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al cambiar el estado de la lectura:  " + e);
        }
        return respuesta;
    }

    /*
      Este metodo sirve para obtener el numero de planilla 
     */
    public int numeroPlanilla() {
        int numplanilla = 0;
        sql = "SELECT max(idplanilla) FROM planilla";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                numplanilla = rs.getInt(1) + 1;
            } else {
                numplanilla = 1;
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el numero de la planilla " + e);
        } finally {
            CerrarConexion();
        }
        return numplanilla;
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
