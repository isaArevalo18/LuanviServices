package ventanas;

import Controlador.CtrlLectura;
import clases.validaciones;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.DetallePlanilla;
import modelo.Lecturas;

public class FrmConsumoPago extends javax.swing.JDialog {

    double subTotal;
    int lecActual;
    int lecAnterior;
    double resta;
    String Total;
    int idcliente;
    int idlectura;
    CtrlLectura ctrlLectura;
    String parametroNumMedidor;
    String parametroCedula;
    List<Lecturas> lecturas;

    validaciones vali = new validaciones();

    public FrmConsumoPago() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        this.setLocationRelativeTo(null);
        jButton2.setEnabled(false);
        vali.ValidarNumeros(txtbuscarcliente);
        vali.LimitarCaracteres(txtbuscarcliente, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtbuscarcliente = new javax.swing.JTextField();
        btnConsultarPago = new javax.swing.JButton();
        lbNumMedidor = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFechaLectura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_lectura_anterior = new javax.swing.JTextField();
        txt_lectura_actual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPagos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtValorxMes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_medidor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setTitle("Consumo a Pagar");
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setText("Valor total a  Pagar:");

        txtValorPagar.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Direccion:");

        txtDireccion.setEditable(false);

        txtApellido.setEditable(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Apellido:");

        txtNombre.setEditable(false);

        txtCedula.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jPanel3.setBackground(new java.awt.Color(33, 45, 62));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar Cliente:");

        btnConsultarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asistencia.png"))); // NOI18N
        btnConsultarPago.setText("Consultar");
        btnConsultarPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPagoActionPerformed(evt);
            }
        });

        lbNumMedidor.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbNumMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnConsultarPago)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarPago)
                    .addComponent(jLabel5)
                    .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNumMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        jButton2.setText("Cobrar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirw.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fecha Ultima Lectura:");

        txtFechaLectura.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Correo:");

        txtCorreo.setEditable(false);

        jLabel1.setText("Consumo:");

        txtConsumo.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("LectAnterior: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("LectNuevo: ");

        txt_lectura_anterior.setEditable(false);

        txt_lectura_actual.setEditable(false);

        tabPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lectura (m3)", "Mes", "Consumo (m3)", "Valor a Pagar", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPagos);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Telefono: ");

        txt_telefono.setEditable(false);

        jLabel8.setText("Valor a Pagar:");

        txtValorxMes.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Medidor");

        txt_medidor.setEditable(false);

        jLabel14.setText("m3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_lectura_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaLectura, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(15, 15, 15)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_lectura_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtValorxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_medidor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_medidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtFechaLectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txt_lectura_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lectura_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel8)
                    .addComponent(txtValorxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed

    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*Obtenemos la fila de la tabla que seleccionamos con el mouse*/
        int fila = tabPagos.getSelectedRow();
        if (fila != -1) {
            /*Agregamos los datos del cliente y los datos de la lectura a un objeto de la clase DetallePlanilla que seleccionamos en la tabla 
             para enviarlos 
             */
            DetallePlanilla dp = new DetallePlanilla();
            dp.setIdCliente(idcliente);
            dp.setCedula(txtCedula.getText());
            dp.setNombrecliente(txtNombre.getText());
            dp.setApellidopcliente(txtApellido.getText());
            dp.setDireccioncliente(txtDireccion.getText());
            dp.setLectura_actual(txt_lectura_actual.getText());
            dp.setLectura_anterior(txt_lectura_anterior.getText());
            dp.setConsumo(txtConsumo.getText());
            dp.setNumeromedidor(txt_medidor.getText());
            dp.setMespago(tabPagos.getValueAt(fila, 1).toString());
            dp.setEstado(tabPagos.getValueAt(fila, 4).toString());
            dp.setTelefono(txt_telefono.getText());
            dp.setTotal(Double.parseDouble(txtValorPagar.getText()));
            dp.setCorreocliente(txtCorreo.getText());
            dp.setIdlectura(idlectura);
            /*Guardamos estos datos en un ArrayList estatico para mostrarlos en el formulario de pago de planilla*/
            DetallePlanilla.cargarPlanilla.add(dp);
            /*Mandamos a mostrar el formulario*/
            FrmPlanillaPagar frmPlanillaPagar = new FrmPlanillaPagar();
            frmPlanillaPagar.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la Lectura que Desea Facturar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmMenuPrincipal v = new FrmMenuPrincipal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnConsultarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPagoActionPerformed
        BuscarCliente();
        GenerarDetallePago();
    }//GEN-LAST:event_btnConsultarPagoActionPerformed

    /*
     Este metodo genera los parametros y calculos del pago de las lecturas de un cliente
     */
    public void GenerarDetallePago() {
        double totalPagar = 0;
        ctrlLectura = new CtrlLectura();
        /*Buscamos todas las lecturas pedientes por el id del cliente  y las almacenamos en un arraylist */
        lecturas = ctrlLectura.obtenerLecturasPago(idcliente);
        System.out.println(lecturas.size() + "cantidad de lecturas pago");

        if (lecturas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar el pago, el cliente no posee una Lectura Pendiente");
        } else {
            /*
              Obtenemos los datos de la ultima lectura que se encuentra almacenada en el ArrayList
              por esta rason se pone un 0
             */
            txt_lectura_anterior.setText(lecturas.get(0).getLecturaAnterior() + "");
            txt_lectura_actual.setText(lecturas.get(0).getLectura());
            txtConsumo.setText(lecturas.get(0).getConsumo() + "");
            txtValorxMes.setText(lecturas.get(0).getValorpago() + "");
            //Limpiamos la tabla
            reiniciarModeloTabla();
            DefaultTableModel model = (DefaultTableModel) tabPagos.getModel();
            for (int i = 0; i < lecturas.size(); i++) {
                /*Con esta condicion evitamos que nos liste la primera lectura que no tienen ningun valor exxistente de pago*/
                if (lecturas.get(i).getConsumo() != 0) {
                    model.addRow(new Object[]{lecturas.get(i).getLectura(), convertirMes(lecturas.get(i).getMeslectura() - 1), lecturas.get(i).getConsumo(), lecturas.get(i).getValorpago(),
                        lecturas.get(i).getEstado()
                    });
                }
                /*Realizamos una sumatoria para obtener el valor total a pagar de todas las lecturas pendientes*/
                totalPagar = totalPagar + lecturas.get(i).getValorpago();
            }
            txtValorPagar.setText(totalPagar + "");
            //Enviamos a mostrar el valor del ultimo consumo en metros cubicos por esa razon colamos 0
            txtConsumo.setText(lecturas.get(0).getConsumo() + "");
            jButton2.setEnabled(true);
        }
    }

    /*Metodo para realizar la limpieza de la tabla*/
    public void reiniciarModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ConsumoM3", "Mes", "Consumo", "Valor a Pagar", "Estado"});
        tabPagos.setModel(modelo);
    }

    /*Metodo que convierte el numero del mes de la lectura en Lectra*/
    public String convertirMes(int mes) {
        String result = "";
        switch (mes) {
            case 0:
                result = "Diciembre";
                break;
            case 1:
                result = "Enero";
                break;
            case 2:
                result = "Febrero";
                break;
            case 3:
                result = "Marzo";
                break;
            case 4:
                result = "Abril";
                break;
            case 5:
                result = "Mayo";
                break;
            case 6:
                result = "Junio";
                break;
            case 7:
                result = "Julio";
                break;
            case 8:
                result = "Agosto";
                break;
            case 9:
                result = "Septiembre";
                break;
            case 10:
                result = "Octubre";
                break;
            case 11:
                result = "Noviembre";
                break;
            case 12:
                result = "Diciembre";
                break;
        }
        /*Instanciamos un objeto de la clase calendar para obtener el año actual
          y concatenarlo a la fecha
         */
        Calendar c = new GregorianCalendar();
        return result + " (" + Integer.toString(c.get(Calendar.YEAR)) + ")";
    }
    private void tabPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPagosMouseClicked
        /*Obtenemos el valor de la fila a la que se le dio clic con el mouse*/
        int fila = tabPagos.getSelectedRow();
        /*Extraemos los valores*/
        double valormes = Double.parseDouble(tabPagos.getValueAt(fila, 3).toString());
        txtValorxMes.setText(valormes + "");
        //Recorremos la lista  para obtener los datos de lectura anterior y actual y su consumo
        for (Lecturas lectura : lecturas) {
            if (lectura.getValorpago() == valormes) {
                txt_lectura_anterior.setText(lectura.getLecturaAnterior() + "");
                txt_lectura_actual.setText(lectura.getLectura());
                txtConsumo.setText(lectura.getConsumo() + "");
                idlectura = lectura.getIdlectura();
            }
        }
    }//GEN-LAST:event_tabPagosMouseClicked

    /*Este metodo se encarga de buscar los datos del cliente y de las lecturas que pertenecen al mismo*/
    public void BuscarCliente() {
        Cliente cliente;
        ctrlLectura = new CtrlLectura();
        parametroNumMedidor = txtbuscarcliente.getText();
        if (parametroNumMedidor.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de medidor o cedula para realizar la busqueda");
        } else {
            /*Lllamamos al metodo buscarDatosCliente que busca por numero de medidor o cedula*/
            cliente = ctrlLectura.buscarDatosCliente(parametroNumMedidor);
            if (cliente.getNombre() != null) {
                /*Enviamos los valores a las cajas de texto*/
                txtCedula.setText(cliente.getCedula());
                txtNombre.setText(cliente.getNombre());
                txtApellido.setText(cliente.getApellido());
                txtDireccion.setText(cliente.getDireccion());
                txtCorreo.setText(cliente.getCorreo());
                idcliente = cliente.getIdCliente();
                txt_telefono.setText(cliente.getTelefono());
                txt_medidor.setText(cliente.getNum_medidor());
                /*LLamamos el metodo obtener ultima lectura y cargar los datos de la misma en los campos de texto*/
                Lecturas lecturas = ctrlLectura.obtenerUltimaLectura(cliente.getIdCliente());
                txtFechaLectura.setText(lecturas.getFechalectura());
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarPago;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbNumMedidor;
    private javax.swing.JTable tabPagos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaLectura;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtValorPagar;
    private javax.swing.JTextField txtValorxMes;
    private javax.swing.JTextField txt_lectura_actual;
    private javax.swing.JTextField txt_lectura_anterior;
    private javax.swing.JTextField txt_medidor;
    private javax.swing.JTextField txt_telefono;
    public static javax.swing.JTextField txtbuscarcliente;
    // End of variables declaration//GEN-END:variables
}
