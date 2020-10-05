package Controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetallePlanilla;
import modelo.Lecturas;
import modelo.Planilla;
import modeloDAO.PlanillaDAO;

public class CtrlPlanilla {

    PlanillaDAO planillaDAO = new PlanillaDAO();

    /*Este metodo guarda la planilla en la base de datos y modifica el estado de las lecturas a pagado*/
    public void emitirPlanilla(DetallePlanilla p) {
        if (planillaDAO.insertar(p) > 0) {
            if (planillaDAO.pagoLectura(Integer.parseInt(p.getConsumo()), p.getFechaPlanilla(), "pagado") > 0) {
                JOptionPane.showMessageDialog(null, "Planilla Emitida con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "Planilla no Generada con Exito");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Planilla no Generada con Exito");
        }
    }

    /*Este metodo lista las planillas y las busca por numero de cedula*/
    public void listarPlanillasCliente(DefaultTableModel model, String parametro) {
        LimpiarTabla(model);
        List<DetallePlanilla> listaplanillas = planillaDAO.Listar(parametro);
        if (listaplanillas.size() > 0) {
            for (DetallePlanilla dp : listaplanillas) {
                model.addRow(new Object[]{dp.getIdplanilla(), dp.getIdlectura(), dp.getFechaPlanilla(), dp.getCedula(),
                    dp.getNombrecliente(), dp.getApellidopcliente(), dp.getDireccioncliente(),
                    dp.getNumeromedidor(), dp.getEstado(), dp.getTotal()});
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este Cliente no tiene registro de Planillas");
        }

    }

    /*No borrar hasta la entrega final del proyecto*/
//    public void actualizarPlanilla(Planilla p) {
//        if (planillaDAO.actualizar(p) > 0) {
//            JOptionPane.showMessageDialog(null, "Planilla Actualizada con Exito");
//        } else {
//            JOptionPane.showMessageDialog(null, "Planilla no Actualizada con Exito");
//        }
//    }
//    public void EliminarFactura(int id, String fechaPago, DefaultTableModel model) {
//        List<Lecturas> listalecturas = new ArrayList<>();
//        if (planillaDAO.eliminar(id) > 0) {
//            listalecturas = planillaDAO.listarLecturasPlanillaEliminada(fechaPago);
//            JOptionPane.showMessageDialog(null, "Planilla Eliminada con Exito");
//        } else {
//            JOptionPane.showMessageDialog(null, "Planilla No Eliminada con Exito");
//        }
//    }
    /*Metodo para Anular la planilla y cambiar el estado de la lectura a pendiente */
 /*Al cambiar a pendiente debera generar una nueva factura de la misma */
    public int EliminarPlanilla(int idPlanilla, int idlectura) {
        if (planillaDAO.cambiarEstadoLectura(idlectura) > 0) {
            if (planillaDAO.eliminar(idPlanilla) > 0) {
                JOptionPane.showMessageDialog(null, "Planilla Anulada con Exito");
                return 1;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo Anular la planilla");
                return 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Anular la planilla");
            return 0;
        }
    }

    /*Este metodo retorna el id de la ultima planilla de la bd*/
    public String obtenerNumeroPlanilla() {
        String numeroplanilla = String.valueOf(planillaDAO.numeroPlanilla());
        return numeroplanilla;
    }

    /*Metodo para limpiar el modelo de la tabla
     */
    private void LimpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
    }

}
