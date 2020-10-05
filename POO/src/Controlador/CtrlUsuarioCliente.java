package Controlador;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modeloDAO.UsuarioClienteDAO;

public class CtrlUsuarioCliente {

    UsuarioClienteDAO usuarioClienteDAO = new UsuarioClienteDAO();

    public void guardarUsuarioCliente(Cliente c) {
        if (usuarioClienteDAO.InsertarUsuario(c) > 0) {
            //Una vez creado el registro en la tabla usuario en la base de datos
            //Obtenemos el id de ese registro para crear la relacion entre la tabla usuario y tabla cliente
            //Utilizamos set para añadir el valor del id de usuario que faltaba en el objeto
            c.setIdusuario(usuarioClienteDAO.IdUsuario());

            if (usuarioClienteDAO.InsertarCliente(c) > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Guardado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no Guardado Exitosamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario Cliente no creado Exitosamente ");
        }
    }

    public void listarUsuarioCliente(DefaultTableModel model) {
        LimpiarTabla(model);
        List<Cliente> listaclientes = usuarioClienteDAO.Listar();
        for (Cliente cliente : listaclientes) {
            model.addRow(new Object[]{cliente.getIdusuario(), cliente.getCedula(), cliente.getNombre(), cliente.getApellido(),
                cliente.getFechaNacimiento(), cliente.getFechaCreacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getCorreo(), cliente.getNum_medidor()});
        }
    }

    public void actualizarUsuarioCliente(Cliente c) {
        if (usuarioClienteDAO.Actualizar(c) > 0) {
            JOptionPane.showMessageDialog(null, "Cliente Actualizado Exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no Actualizado Exitosamente");
        }
    }

    public void eliminarUsuarioCliente(int id) {
        if (usuarioClienteDAO.Eliminar(id) > 0) {
            JOptionPane.showMessageDialog(null, "Cliente Eliminado Exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no Eliminado Exitosamente");
        }
    }

    public void buscarCliente(String cedula, DefaultTableModel model) {
        LimpiarTabla(model);
        List<Cliente> listaclientes = usuarioClienteDAO.Buscar(cedula);
        if (listaclientes.size() > 0) {
            for (Cliente cliente : listaclientes) {
                model.addRow(new Object[]{cliente.getIdusuario(), cliente.getCedula(), cliente.getNombre(), cliente.getApellido(),
                    cliente.getFechaNacimiento(), cliente.getFechaCreacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getCorreo(), cliente.getNum_medidor()});
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existen registros de Clientes en el Sistema");
        }

    }

    private void LimpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
    }
}
