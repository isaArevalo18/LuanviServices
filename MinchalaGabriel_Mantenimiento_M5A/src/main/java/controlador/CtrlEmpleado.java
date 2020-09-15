package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Empleado;
import vista.VistaMantenimiento;

public class CtrlEmpleado implements ActionListener {

    private Empleado modelo;
    private VistaMantenimiento vista;
    // EntityManagerFactory para gestionar las entidades definida en persistenceMantenimiento
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceMantenimiento");
    private DefaultTableModel tabla;
    boolean validado;

    public CtrlEmpleado(Empleado modelo, VistaMantenimiento vista) {
        this.modelo = modelo;
        this.vista = vista;
        //Acciones de botones y jtxt
        vista.item_empleado.addActionListener(this);
        vista.item_salir.addActionListener(this);
        vista.btn_guardar.addActionListener(this);
        vista.btn_borrar.addActionListener(this);
        vista.btn_editar_registro.addActionListener(this);
    }
    // constructor
    public CtrlEmpleado() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.item_empleado) {
            vista.pl_empleado.setVisible(true);
        }
        if (e.getSource() == vista.item_salir) {
            vista.dispose();//cierre de la ventana
        }
        if (e.getSource() == vista.btn_guardar) {//accion de boton agregar
            if (validar_campos() == true) {// inicio validacion de ingreso de campos
                if (validar_fecha() == true){//inicio de validacion de fecha
                   Save();
                    LimpiarFormulario(); // volver a los campos en vacio
                }else{
                    JOptionPane.showMessageDialog(null, "Fecha NO valida.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
            }
        }

        if (e.getSource() == vista.btn_editar_registro) {//accion de modificar
            if (validar_campos() == true) {
                if (validar_fecha() == true){
                    Update();
                    LimpiarFormulario();
                }else{
                   JOptionPane.showMessageDialog(null, "Fecha NO valida."); 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Llene todos los campos");
            }
        }

        if (e.getSource() == vista.btn_borrar) {//accion de borrar
            Delete();
            LimpiarFormulario();
        }
    }
// caracteristicas de la ventana
    public void Iniciar() {
        vista.pl_empleado.setVisible(false);
        vista.setTitle("Mantenimiento Empleado");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
    }

    public boolean validar_campos() {
        boolean validado = true;
        if (vista.txt_codempleado.getText().isEmpty() || vista.txt_apellido.getText().isEmpty()
                || vista.txt_nombre.getText().isEmpty() || vista.txt_fech_naci.getText().isEmpty()) {

            validado = false;
        }
        return validado;
    }
    
    public boolean validar_fecha() {
        validado = true;
        //transpformacion de variables a string para poder realizar la validacion de fecha
        String fech = vista.txt_fech_naci.getText();
        //pedimos que nos devulevan una parte de la cadena de texto de año, mes y dia
        String anio = fech.substring(0, 4);
        String mes = fech.substring(5, 7);
        String dia = fech.substring(8, 10);
        //aplicamos la condicion de si mes sea menor a 12 y mayor que 1
        if (Integer.parseInt(mes) > 12 || Integer.parseInt(mes) < 1){
            validado = false;
        }
        //aplicamos la condicion si dia sea menor a 31 y mayor a 1
        if (Integer.parseInt(dia) > 31 || Integer.parseInt(dia) < 1){
            validado = false;
        }
        return validado;
    }

    public void Save() {
        //parseamos el codigo de empleado
        long id = Long.parseLong(vista.txt_codempleado.getText());
        // validamos que el codigo no se repita dentro de la tabla
        validado = true;
        List<Empleado> empleados = findAll();
        for (Empleado empleado : empleados) {
            if (empleado.getCodigo() == id) {
                validado = false;
            }
        }

        if (validado == true) {
            LocalDate fecha = LocalDate.parse(vista.txt_fech_naci.getText());
            modelo = new Empleado(id, vista.txt_apellido.getText(), vista.txt_nombre.getText(), fecha);

            try {
                // inicio de la transaccion
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                em.persist(modelo);
                em.getTransaction().commit();
                em.close();
                LimpiarTabla();
                //mandamos a listar los datos a la tabla
                Listar(vista.tbl_empleado);
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Código de empleado existente.");
        }

    }
//metodo para listar los empleados
    public void Listar(JTable tbl) {
        tabla = (DefaultTableModel) vista.tbl_empleado.getModel();
        List<Empleado> empleados = findAll();
        for (Empleado empleado : empleados) {

            tabla.addRow(new Object[]{empleado.getCodigo(), empleado.getApellidos(), empleado.getNombre(), empleado.getFechaNacimiento()});
        }
        tbl.setModel(tabla);
    }
// consulta para poder obtener los empleados que se encuentren en la tabla "Empleado"
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
//metodo modificar
    public void Update() {
        long id = Long.parseLong(vista.txt_codempleado.getText());
        LocalDate fecha = LocalDate.parse(vista.txt_fech_naci.getText());

        try {
            //inicio de la transaccion
            modelo = new Empleado();
            EntityManager em = emf.createEntityManager();
            modelo = em.find(Empleado.class, id);
            em.getTransaction().begin();
            modelo.setApellidos(vista.txt_apellido.getText());
            modelo.setNombre(vista.txt_nombre.getText());
            modelo.setFechaNacimiento(fecha);
            em.getTransaction().commit();
            em.close();
            LimpiarTabla();
            Listar(vista.tbl_empleado);
            vista.txt_codempleado.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Registro Modificado con Exito");
        } catch (Exception e) {
        }
    }
//metodo borrar
    public void Delete() {
        int fila = vista.tbl_empleado.getSelectedRow();
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un Registro de la tabla porfavor");
            } else {
                //inicio de la transaccion
                Long id = Long.parseLong(vista.tbl_empleado.getValueAt(fila, 0).toString());
                modelo = new Empleado();
                EntityManager em = emf.createEntityManager();
                modelo = em.find(Empleado.class, id);
                em.getTransaction().begin();
                em.remove(modelo);
                em.getTransaction().commit();
                em.close();
                LimpiarTabla();
                Listar(vista.tbl_empleado);
                JOptionPane.showMessageDialog(null, "Registro Eliminado con Exito");

            }
        } catch (Exception e) {
        }
    }
// recorre la tabla para eliminar los datos seleccionados
    private void LimpiarTabla() {
        for (int i = 0; i < vista.tbl_empleado.getRowCount(); i++) {
            tabla.removeRow(i);
            i--;
        }
    }
//metodo para limpiar el formulario
    private void LimpiarFormulario() {
        vista.txt_nombre.setText("");
        vista.txt_apellido.setText("");
        vista.txt_fech_naci.setText("");
        vista.txt_codempleado.setText("");
    }

}
