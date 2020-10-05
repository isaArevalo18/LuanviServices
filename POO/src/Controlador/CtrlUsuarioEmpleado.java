
package Controlador;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modeloDAO.UsuarioEmpleadoDAO;

public class CtrlUsuarioEmpleado {
    UsuarioEmpleadoDAO usuarioEmpleadoDAO=new UsuarioEmpleadoDAO();
    
    public void guardarUsuarioEmpleado(Empleado eu) {
        if (usuarioEmpleadoDAO.insertarUsuario(eu) > 0) {
            //Una vez creado el registro en la tabla usuario en la base de datos
            //Obtenemos el id de ese registro para crear la relacion entre la tabla usuario y tabla cliente
            //Utilizamos set para añadir el valor del id de usuario que faltaba en el objeto
            eu.setIdusuario(usuarioEmpleadoDAO.IdUsuario());

            if (usuarioEmpleadoDAO.insertarEmpleado(eu) > 0) {
                JOptionPane.showMessageDialog(null, "Empleado Guardado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no Guardado Exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario Empleado no creado Exitosamente ");
        }
    }

    public void listarUsuarioEmpleado(DefaultTableModel model) {
        LimpiarTabla(model);
        List<Empleado> listaclientes = usuarioEmpleadoDAO.Listar();
        for (Empleado empleado : listaclientes) {
            model.addRow(new Object[]{empleado.getIdusuario(), empleado.getCedula(), empleado.getNombre(), empleado.getApellido(),
                empleado.getFechaNacimiento(),empleado.getFechaCreacion(), empleado.getDireccion(), empleado.getTelefono(), empleado.getCorreo(), empleado.getCargo(),
            empleado.getUsuario(),empleado.getClave()});
        }
    }

    public void actualizarUsuarioEmpleado(Empleado eu) {
        if (usuarioEmpleadoDAO.Actualizar(eu) > 0) {
            JOptionPane.showMessageDialog(null, "Empleado Actualizado Exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no Actualizado Exitosamente");
        }
    }
    
    public void eliminarUsuarioEmpleado(int id){
        if (usuarioEmpleadoDAO.Eliminar(id) > 0) {
            JOptionPane.showMessageDialog(null, "Empleado Eliminado Exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no Eliminado Exitosamente");
        }
    }

    private void LimpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
    }
    
}
