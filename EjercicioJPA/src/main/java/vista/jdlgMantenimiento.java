package vista;

import controlador.ControladorEmpleado;
import java.awt.Point;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import servicio.JPAException;

public class jdlgMantenimiento extends javax.swing.JDialog {

    ControladorEmpleado objControladorEmpleado;
    DefaultTableModel modeloTabla;
    Statement sentencia;

    public jdlgMantenimiento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        objControladorEmpleado = new ControladorEmpleado();
        initComponents();
        this.setLocationRelativeTo(null);
        //
        actualizarTabla();
        //
        jbtModificar.setEnabled(false);
        jbtEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPizarra = new javax.swing.JTable();
        jbtEliminar = new javax.swing.JButton();
        jbtModificar = new javax.swing.JButton();
        jbtAgregar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jtfApellido = new javax.swing.JTextField();
        jtfFechaDeNacimiento = new javax.swing.JTextField();
        jlbTitulo2 = new javax.swing.JLabel();
        jlbTitulo3 = new javax.swing.JLabel();
        jlbTitulo4 = new javax.swing.JLabel();
        jlbTitulo5 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jlbTitulo6 = new javax.swing.JLabel();
        jlbTitulo7 = new javax.swing.JLabel();
        jlbTitulo8 = new javax.swing.JLabel();
        jlbTitulo9 = new javax.swing.JLabel();
        jlbTitulo10 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jtfCalleSecundaria = new javax.swing.JTextField();
        jtfBarrio = new javax.swing.JTextField();
        jtfNumeroTelefono = new javax.swing.JTextField();
        jtfCallePrincipal = new javax.swing.JTextField();
        jlbTitulo11 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jtbPizarra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbPizarra.setGridColor(new java.awt.Color(102, 102, 102));
        jtbPizarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbPizarraMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbPizarra);

        jbtEliminar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jbtEliminar.setText("Eliminar");
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });

        jbtModificar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtAgregar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jbtAgregar.setText("Agregar");
        jbtAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(240, 240, 240), new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jtfApellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyTyped(evt);
            }
        });

        jtfFechaDeNacimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbTitulo2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo2.setText("Id:");

        jlbTitulo3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo3.setText("Nombre:");

        jlbTitulo4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo4.setText("Apellido:");

        jlbTitulo5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo5.setText("Fecha de Nacimiento:");

        jtfId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdKeyTyped(evt);
            }
        });

        jtfNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbTitulo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbTitulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlbTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbTitulo4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfApellido)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo2)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo4)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo5)
                    .addComponent(jtfFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Empleado", jPanel1);

        jlbTitulo6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo6.setText("Calle principal:");

        jlbTitulo7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo7.setText("Número:");

        jlbTitulo8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo8.setText("Calle secundaria:");

        jlbTitulo9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo9.setText("Barrio:");

        jlbTitulo10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo10.setText("Numero de Telefono:");

        jtfNumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });
        jtfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroKeyTyped(evt);
            }
        });

        jtfCalleSecundaria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtfBarrio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtfNumeroTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtfNumeroTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroTelefonoKeyTyped(evt);
            }
        });

        jtfCallePrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbTitulo11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbTitulo11.setText("Codigo");

        jtfCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTitulo7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlbTitulo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbTitulo8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbTitulo9))
                    .addComponent(jlbTitulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTitulo10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCalleSecundaria)
                            .addComponent(jtfCallePrincipal)
                            .addComponent(jtfBarrio)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 155, Short.MAX_VALUE))
                            .addComponent(jtfCodigo))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(223, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo11)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo6)
                    .addComponent(jtfCallePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCalleSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTitulo8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlbTitulo7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo9)
                    .addComponent(jtfBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTitulo10))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Direccion", jPanel2);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jbtAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtEliminar))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed

            try {
                //validacion de ingreso de campos
                if (ValidarCampos()) {
                    obtenerValores();
                    if (objControladorEmpleado.ingresarEmpleado(id, apellido, nombre, fecha, iddireccion, calleprincipal, callesecundaria, numero, barrio, telefono)) {
                        actualizarTabla();
                        limpiarCampos();

                        JOptionPane.showMessageDialog(null, "Empleado insertado", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos", "DANGER", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (javax.persistence.RollbackException e) {
                JOptionPane.showMessageDialog(null, e.getCause(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
            //

        }//GEN-LAST:event_jbtAgregarActionPerformed

        private void jtbPizarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPizarraMousePressed
            jbtModificar.setEnabled(true);
            jbtEliminar.setEnabled(true);
            jtfCodigo.setEnabled(false);
            jtfId.setEnabled(false);
            JTable table = (JTable) evt.getSource();
            Point point = evt.getPoint();
            int row = table.rowAtPoint(point);
            if (evt.getClickCount() == 1) {
                jtfId.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 0).toString());
                jtfNombre.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 1).toString());
                jtfApellido.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 2).toString());
                jtfFechaDeNacimiento.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 3).toString());
                jtfCodigo.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 4).toString());
                jtfCallePrincipal.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 5).toString());
                jtfCalleSecundaria.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 6).toString());
                jtfNumero.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 7).toString());
                jtfBarrio.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 8).toString());
                jtfNumeroTelefono.setText(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 9).toString());

            }
        }//GEN-LAST:event_jtbPizarraMousePressed

        private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
            limpiarCampos();
            try {

                if (objControladorEmpleado.eliminarEmpleado(Long.parseLong(jtbPizarra.getValueAt(jtbPizarra.getSelectedRow(), 0).toString()))) {
                    actualizarTabla();
                    limpiarCampos();
                    JOptionPane.showMessageDialog(null, "Empleado eliminado", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, e.getCause(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, e.getCause(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }//GEN-LAST:event_jbtEliminarActionPerformed

        private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed

            try {
                if (ValidarCampos()) {
                    obtenerValores();
                    if (objControladorEmpleado.modificarEmpleado(id, apellido, nombre, fecha, iddireccion, calleprincipal, callesecundaria, numero, barrio, telefono)) {
                        actualizarTabla();
                        jtfCodigo.setEnabled(true);
                        jtfId.setEnabled(true);
                        limpiarCampos();
                        JOptionPane.showMessageDialog(null, "Empleado actualizado", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "LLene todos los campos", "DANGER", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (JPAException e) {
                JOptionPane.showMessageDialog(null, e.getCause(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }//GEN-LAST:event_jbtModificarActionPerformed

        private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jtfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jtfIdKeyTyped

    private void jtfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jtfApellidoKeyTyped

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfCodigoKeyTyped

    private void jtfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();

        }
    }//GEN-LAST:event_jtfNumeroKeyTyped

    private void jtfNumeroTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();

        }
    }//GEN-LAST:event_jtfNumeroTelefonoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarCampos() {
        jtfId.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfFechaDeNacimiento.setText("");
        jtfCodigo.setText("");
        jtfCallePrincipal.setText("");
        jtfCalleSecundaria.setText("");
        jtfNumero.setText("");
        jtfBarrio.setText("");
        jtfNumeroTelefono.setText("");

    }//eoc

    public void actualizarTabla() {
        modeloTabla = new DefaultTableModel();

        //
        this.jtbPizarra.setModel(modeloTabla);
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Fecha de Nacimiento");
        modeloTabla.addColumn("Cod Direccion");
        modeloTabla.addColumn("Calle Principal");
        modeloTabla.addColumn("Calle Secundaria");
        modeloTabla.addColumn("Numero");
        modeloTabla.addColumn("Barrio");
        modeloTabla.addColumn("Numero de Telefono");
        //this.jtbPizarra.setModel(modeloTabla);
        //
        List<Empleado> empleados = objControladorEmpleado.obtenerEmpleados();
        Iterator<Empleado> it = empleados.iterator();
        while (it.hasNext()) {
            Empleado cadena = it.next();
            System.out.println(cadena.toString());
            modeloTabla.addRow(new Object[]{
                cadena.getCodigo(),
                cadena.getNombre(),
                cadena.getApellidos(),
                cadena.getFechaNacimiento(),
                cadena.getDireccion().getId(),
                cadena.getDireccion().getCalleprincipal(),
                cadena.getDireccion().getCallesecundaria(),
                cadena.getDireccion().getNumero(),
                cadena.getDireccion().getBarrio(),
                cadena.getDireccion().getTelefono()});
        }
    }//eoc

    public void obtenerValores() {
        id = Long.parseLong(jtfId.getText());
        nombre = jtfNombre.getText();
        apellido = jtfApellido.getText();
        fecha = jtfFechaDeNacimiento.getText();
        iddireccion = Long.parseLong(jtfCodigo.getText());
        calleprincipal = jtfCallePrincipal.getText();
        callesecundaria = jtfCalleSecundaria.getText();
        numero = Integer.parseInt(jtfNumero.getText());
        barrio = jtfBarrio.getText();
        telefono = jtfNumeroTelefono.getText();
    }

    public boolean ValidarCampos() {
        if (jtfId.getText().isEmpty() || jtfNombre.getText().isEmpty() || jtfApellido.getText().isEmpty()
                || jtfFechaDeNacimiento.getText().isEmpty() || jtfCodigo.getText().isEmpty() || jtfCallePrincipal.getText().isEmpty()
                || jtfCalleSecundaria.getText().isEmpty() || jtfNumero.getText().isEmpty()
                || jtfBarrio.getText().isEmpty() || jtfNumeroTelefono.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    //
    Long id;
    String nombre;
    String apellido;
    String fecha;
    String calleprincipal;
    String callesecundaria;
    int numero;
    String barrio;
    String telefono;
    Long empleado;
    Long iddireccion;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlbTitulo10;
    private javax.swing.JLabel jlbTitulo11;
    private javax.swing.JLabel jlbTitulo2;
    private javax.swing.JLabel jlbTitulo3;
    private javax.swing.JLabel jlbTitulo4;
    private javax.swing.JLabel jlbTitulo5;
    private javax.swing.JLabel jlbTitulo6;
    private javax.swing.JLabel jlbTitulo7;
    private javax.swing.JLabel jlbTitulo8;
    private javax.swing.JLabel jlbTitulo9;
    public javax.swing.JTable jtbPizarra;
    public static javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfBarrio;
    private javax.swing.JTextField jtfCallePrincipal;
    private javax.swing.JTextField jtfCalleSecundaria;
    private javax.swing.JTextField jtfCodigo;
    public static javax.swing.JTextField jtfFechaDeNacimiento;
    public static javax.swing.JTextField jtfId;
    public static javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
