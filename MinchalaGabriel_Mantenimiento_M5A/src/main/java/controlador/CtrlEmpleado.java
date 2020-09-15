package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Empleado;
import vista.VistaMantenimiento;

public class CtrlEmpleado implements ActionListener{

    private Empleado modelo;
    private VistaMantenimiento vista;
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceMantenimiento");
    private DefaultTableModel tabla;

    public CtrlEmpleado(Empleado modelo, VistaMantenimiento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.item_empleado.addActionListener(this);
        vista.item_salir.addActionListener(this);
        vista.btn_guardar.addActionListener(this);
        vista.btn_actualizar.addActionListener(this);
        vista.btn_borrar.addActionListener(this);
        vista.btn_nuevo.addActionListener(this);
      
    }

    public CtrlEmpleado() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.item_empleado) {
            vista.pl_empleado.setVisible(true);
        }
        if (e.getSource() == vista.item_salir) {
            vista.dispose();
        }
        if (e.getSource() == vista.btn_guardar) {
            LimpiarTabla();
            Add();
            Listar(vista.tbl_empleado);
        }
        if (e.getSource() == vista.btn_nuevo) {
            LimpiarFormulario();
        }
        if (e.getSource() == vista.btn_actualizar) {
            Update();
            LimpiarFormulario();
        }
    }

    public void Iniciar() {
        vista.pl_empleado.setVisible(false);
        vista.setTitle("Mantenimiento Empleado");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
        
    }

    public void Add() {
        long id = Long.parseLong(vista.txt_codempleado.getText());
        LocalDate fecha = LocalDate.parse(vista.txt_fech_naci.getText());
        modelo = new Empleado(id, vista.txt_apellido.getText(), vista.txt_nombre.getText(), fecha);

        //Iniciamos la transaccion
        try {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(modelo);
            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Listar(JTable tbl) {
        tabla = (DefaultTableModel) vista.tbl_empleado.getModel();
        List<Empleado> empleados = findAll();
        for (Empleado empleado : empleados) {

            tabla.addRow(new Object[]{empleado.getCodigo(), empleado.getApellidos(), empleado.getNombre(), empleado.getFechaNacimiento()});
        }
        tbl.setModel(tabla);
    }

    public List findAll() {
        List<Empleado> empleados = new ArrayList<>();
        try {
            EntityManager em = emf.createEntityManager();
            empleados = (List<Empleado>) em.createQuery("From Empleado").getResultList();
            em.close();
        } catch (Exception e) {
        }
        return empleados;

    }

    public void Update() {
        long id = Long.parseLong(vista.txt_codempleado.getText());
        LocalDate fecha = LocalDate.parse(vista.txt_fech_naci.getText());

        try {
            modelo = new Empleado();
            EntityManager em = emf.createEntityManager();
            modelo = em.find(Empleado.class, id);
            em.getTransaction().begin();
            modelo.setApellidos(vista.txt_apellido.getText());
            modelo.setNombre(vista.txt_nombre.getText());
            modelo.setFechaNacimiento(fecha);
            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(null, "Registro Actualizado con Exito");
            vista.txt_codempleado.setEnabled(true);
        } catch (Exception e) {
        }
    }

    public void Delete() {
        int fila = vista.tbl_empleado.getSelectedRow();
        int id = (int) vista.tbl_empleado.getValueAt(fila, 0);
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un Registro de la tabla porfavor");
            } else {
                modelo = new Empleado();
                EntityManager em = emf.createEntityManager();
                modelo = em.find(Empleado.class, id);
                em.getTransaction().begin();
                em.remove(modelo);
                em.getTransaction().commit();
                em.close();
                JOptionPane.showMessageDialog(null, "Registro Eliminado con Exito");

            }
        } catch (Exception e) {
        }
    }

    public void obtenerRegistro(int fila) {

       
  
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione, un registro de la tabla por favor..");
        } else {
            vista.txt_codempleado.setEnabled(false);
            vista.txt_codempleado.setText(vista.tbl_empleado.getValueAt(fila, 0).toString());
            vista.txt_apellido.setText(vista.tbl_empleado.getValueAt(fila, 1).toString());
            vista.txt_nombre.setText(vista.tbl_empleado.getValueAt(fila, 2).toString());
            vista.txt_fech_naci.setText(vista.tbl_empleado.getValueAt(fila, 3).toString());
        
        }
    }

    private void LimpiarTabla() {
        for (int i = 0; i < vista.tbl_empleado.getRowCount(); i++) {
            tabla.removeRow(i);
            i--;
        }
    }

    private void LimpiarFormulario() {
        vista.txt_nombre.setText("");
        vista.txt_apellido.setText("");
        vista.txt_fech_naci.setText("");
        vista.txt_codempleado.setText("");
    }



}
