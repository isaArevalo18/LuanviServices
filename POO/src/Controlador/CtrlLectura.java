package Controlador;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Lecturas;
import modeloDAO.LecturaDAO;

public class CtrlLectura {

    LecturaDAO lecturaDAO = new LecturaDAO();

    public void insertarLectura(Lecturas l) {
        if (lecturaDAO.Insertar(l) > 0) {
            JOptionPane.showMessageDialog(null, "Lectura Guardada con Exito");
        } else {
            JOptionPane.showMessageDialog(null, "Lectura No Guardada con Exito");
        }
    }

    /*Este metodo busca a los clientes por cedula o numero de medidor y retorna un objeto de tipo cliente con los datos del mismo*/
    public Cliente buscarDatosCliente(String parametro) {
        return lecturaDAO.buscarLecturaCliente(parametro);
    }

    /*Permite buscar por id de cliente y traer el listado de las lecturas pendiendes por pagar de un cliente*/
    public List<Lecturas> obtenerLecturasPago(int id) {
        return lecturaDAO.ListarPago(id);
    }

    /*Lista las lecturas que pertenecen al cliente en una tabla*/
    public void listarLecturasCliente(DefaultTableModel model, int id) {
        LimpiarTabla(model);
        List<Lecturas> listalecturas = lecturaDAO.Listar(id);
        for (Lecturas lectura : listalecturas) {
            model.addRow(new Object[]{lectura.getIdlectura(), lectura.getFechalectura(),
                lectura.getLectura(), lectura.getConsumo(), lectura.getEstado(), lectura.getValorpago()});
        }
    }

    public void editarLectura(Lecturas lec) {
        if (lecturaDAO.Editar(lec) > 0) {
            JOptionPane.showMessageDialog(null, "Lectura Actualizada Exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error Lectura No Actualizada");
        }
    }

    public void eliminarLectura(int id) {
        if (lecturaDAO.Eliminar(id) > 0) {
            JOptionPane.showMessageDialog(null, "Lectura Eliminada Exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error Lectura No Eliminada");
        }
    }

    /*Con este metodo obtenemos los datos de la ultima lectura y busca por id del cliente*/
 /*Retorna un objeto de tipo Lecturas con los datos de la misma para cargarlos en la vista*/
    public Lecturas obtenerUltimaLectura(int id) {
        return lecturaDAO.obtenerUltimaLectura(id);
    }

    private void LimpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
    }
}
