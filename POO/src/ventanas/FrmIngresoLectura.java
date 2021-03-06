package ventanas;

import Controlador.CtrlLectura;
import clases.CalcularPrecio;
import clases.validaciones;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Lecturas;

public class FrmIngresoLectura extends javax.swing.JFrame {

    String parametroNumMedidor;
    String parametroCedula;
    validaciones val = new validaciones();
    CalcularPrecio calcular = new CalcularPrecio();
    SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
    CtrlLectura ctrlLectura = new CtrlLectura();
    validaciones vali = new validaciones();
    int id = 0;
    //Parametros para cargar una lectura anterior en un formulario
    int idlectura;
    String lectura;
    String consumo;
    String fechalectura;
    String lectura_anterior;
    String fechalectura_anterior;
    String caracter = "";
    int lectura_Actual = 0;
    int lectura_Anterior = 0;
    int total_consumo = 0;
    double valorPago;

    public FrmIngresoLectura() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtConsumo.setText("0000");
        txt_valorpago.setText("0.00");
        btn_eliminarlectura.setEnabled(false);
        btn_editarlectura.setEnabled(false);
        btnGuardarLectura.setEnabled(false);
        rbt_medidor.setSelected(true);
        txtNumMedidor.setEnabled(true);
        txtNumMedidor.setEditable(true);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        val.ValidarNumeros(txt_lectura);
        val.LimitarCaracteres(txt_lectura, 4);
        this.setLocationRelativeTo(null);

        vali.ValidarNumeros(txtCedula);
        vali.LimitarCaracteres(txtCedula, 10);
        vali.ValidarLetras(txtNombre);
        vali.ValidarLetras(txtApellido);
        vali.ValidarNumeros(txtNumMedidor);
        vali.LimitarCaracteres(txtNumMedidor, 7);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbNum = new javax.swing.JLabel();
        panelImage11 = new ventanas.PanelImage1();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtFechaAnterior = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNumMedidor = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        txtLecAnterior = new javax.swing.JTextField();
        rbt_medidor = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbt_cedula = new javax.swing.JRadioButton();
        txtApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_idcliente = new javax.swing.JTextField();
        txt_lectura = new javax.swing.JTextField();
        jd_fechalectura = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLecturas = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_valorpago = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnNuevoLec = new javax.swing.JButton();
        btnGuardarLectura = new javax.swing.JButton();
        btn_eliminarlectura = new javax.swing.JButton();
        btn_editarlectura = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));

        lbNum.setForeground(new java.awt.Color(33, 45, 62));
        lbNum.setText("Num:");

        jLabel1.setBackground(new java.awt.Color(33, 45, 62));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingresar Lecturas");

        javax.swing.GroupLayout panelImage11Layout = new javax.swing.GroupLayout(panelImage11);
        panelImage11.setLayout(panelImage11Layout);
        panelImage11Layout.setHorizontalGroup(
            panelImage11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage11Layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        panelImage11Layout.setVerticalGroup(
            panelImage11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelImage11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(panelImage11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNum)
                .addGap(106, 106, 106))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 850, 90));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, -1, -1));

        txtFechaAnterior.setEditable(false);
        jPanel4.add(txtFechaAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 146, -1));

        jLabel9.setText("Fecha lectura Anterior:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel2.setText("Num. Medidor:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setText("Cedula");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel3.setText("Nombre:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtCedula.setEditable(false);
        txtCedula.setEnabled(false);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel4.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 201, -1));

        txtNumMedidor.setEditable(false);
        txtNumMedidor.setEnabled(false);
        txtNumMedidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumMedidorKeyReleased(evt);
            }
        });
        jPanel4.add(txtNumMedidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 146, -1));

        txtNombre.setEditable(false);
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 146, -1));

        jLabel10.setText("Cosumo M3");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txtConsumo.setEditable(false);
        txtConsumo.setToolTipText("");
        txtConsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsumoKeyReleased(evt);
            }
        });
        jPanel4.add(txtConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 146, -1));

        txtLecAnterior.setEditable(false);
        jPanel4.add(txtLecAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 146, -1));

        buttonGroup1.add(rbt_medidor);
        rbt_medidor.setText("NroMedidor");
        rbt_medidor.setContentAreaFilled(false);
        rbt_medidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_medidorActionPerformed(evt);
            }
        });
        jPanel4.add(rbt_medidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 105, -1));

        jLabel5.setText("Apellido:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        buttonGroup1.add(rbt_cedula);
        rbt_cedula.setText("Cedula");
        rbt_cedula.setContentAreaFilled(false);
        rbt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_cedulaActionPerformed(evt);
            }
        });
        jPanel4.add(rbt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 71, -1));

        txtApellido.setEditable(false);
        jPanel4.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 201, -1));

        jLabel11.setText("Buscar por:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 83, -1));

        jLabel6.setText("Lec.Anterior");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txt_idcliente.setEditable(false);
        jPanel4.add(txt_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 60, -1));

        txt_lectura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_lecturaKeyReleased(evt);
            }
        });
        jPanel4.add(txt_lectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 201, -1));

        jd_fechalectura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jd_fechalecturaKeyReleased(evt);
            }
        });
        jPanel4.add(jd_fechalectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 201, -1));

        jLabel7.setText("Lectura:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel12.setText("IdCliente:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        tablaLecturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "fechaLectura", "lectura", "consumo M3", "estado", "valorpago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaLecturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLecturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLecturas);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 825, 153));

        jLabel13.setText("ValorPago:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 60, -1));

        txt_valorpago.setEditable(false);
        jPanel4.add(txt_valorpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 91, -1));

        jLabel8.setText("Fecha:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jPanel3.setBackground(new java.awt.Color(124, 186, 247));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lecturabuscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevoLec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lecturaanadir.png"))); // NOI18N
        btnNuevoLec.setText("Nueva Lectura");
        btnNuevoLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLecActionPerformed(evt);
            }
        });

        btnGuardarLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lecturaguardar.png"))); // NOI18N
        btnGuardarLectura.setText("guardar lectura");
        btnGuardarLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLecturaActionPerformed(evt);
            }
        });

        btn_eliminarlectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lecturaeliminar.png"))); // NOI18N
        btn_eliminarlectura.setText("eliminar");
        btn_eliminarlectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarlecturaActionPerformed(evt);
            }
        });

        btn_editarlectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lecturaeditar.png"))); // NOI18N
        btn_editarlectura.setText("editar lectura");
        btn_editarlectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarlecturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_eliminarlectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoLec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarlectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoLec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarLectura)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarlectura)
                .addGap(18, 18, 18)
                .addComponent(btn_editarlectura)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //***********************Busqueda de los datos del cliente*******************************
        txtConsumo.setText("");
        txt_lectura.setText("");
        jd_fechalectura.setDate(null);
        txt_lectura.setEditable(true);
        jd_fechalectura.setEnabled(true);
        BuscarCliente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLecActionPerformed
        limpiar();
        txt_lectura.setEditable(true);
        jd_fechalectura.setEnabled(true);
        rbt_medidor.setSelected(true);
        txtCedula.setEnabled(false);
        txtCedula.setEditable(false);
        txtNumMedidor.setEnabled(true);
        txtNumMedidor.setEditable(true);
        btnGuardarLectura.setEnabled(false);
    }//GEN-LAST:event_btnNuevoLecActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmMenuPrincipal v = new FrmMenuPrincipal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
        }

        if (Character.isLetter(evt.getKeyChar())) {
            JOptionPane.showMessageDialog(null, "No se admiten letras!");
        }

        if (txtNumMedidor.getText().length() > 9) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se admite mayor a 10 dígitos!");
        }

        if (Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se admiten espacios en blanco!");
        }
    }//GEN-LAST:event_formKeyTyped

    private void btnGuardarLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLecturaActionPerformed
        if (txtLecAnterior.getText().equals("")) {
            lectura_Actual = Integer.parseInt(txt_lectura.getText());
            lectura_Anterior = 0;
        } else {
            lectura_Actual = Integer.parseInt(txt_lectura.getText());
            lectura_Anterior = Integer.parseInt(txtLecAnterior.getText());
        }
        if (lectura_Actual < lectura_Anterior) {
            JOptionPane.showMessageDialog(null, "La Lectura Actual no puede ser menor a la Anterior");
        } else {
            if (txt_lectura.getText().equals("") || jd_fechalectura.getDate() == null) {
                JOptionPane.showMessageDialog(null, "LLene todos los campos");
            } else {
                String fechalecturaactual = formato.format(jd_fechalectura.getDate());
                String fechalecturaacterior = txtFechaAnterior.getText();
                if (validaciones.validarFechaLectura(fechalecturaacterior, fechalecturaactual)) {
                    ctrlLectura = new CtrlLectura();
                    //Llamamos a la funcion para calcular el valor de pago de acuerdo a la lectura
                    valorPago = calcularValorPago(Integer.parseInt(txtConsumo.getText()));
                    txt_valorpago.setText(valorPago + "");

                    Lecturas lec = new Lecturas();
                    lec.setLectura(txt_lectura.getText());
                    lec.setFechalectura(fechalecturaactual);
                    lec.setEstado("pendiente");
                    int consumoval = Integer.parseInt(txtConsumo.getText());
                    lec.setConsumo(consumoval);
                    //valorPago = Double.parseDouble(txt_valorpago.getText());
                    lec.setValorpago(valorPago);
                    lec.setIdCliente(Integer.parseInt(txt_idcliente.getText()));

                    if (txtFechaAnterior.getText().equals("") || txtLecAnterior.getText().equals("")) {
                        ctrlLectura.insertarNLectura(lec);
                    } else {
                        lec.setFechaLecturaAnterior(txtFechaAnterior.getText());
                        lec.setLecturaAnterior(Integer.parseInt(txtLecAnterior.getText()));
                        ctrlLectura.insertarLectura(lec);
                    }
                    MostrarLecturasCliente(Integer.parseInt(txt_idcliente.getText()));

                    txt_lectura.setEditable(false);
                    jd_fechalectura.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede generar dos Lecturas el mismo mes");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarLecturaActionPerformed

    private void txt_lecturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lecturaKeyReleased
        habilitarBGuardarLect();
        if (Character.isDigit(evt.getKeyChar())) {
            if (caracter.length() < 4) {
                caracter = caracter + String.valueOf(evt.getKeyChar());
                CalcularConsumo();
            }
        } else {
            caracter = "";
            lectura_Actual = 0;
            lectura_Anterior = 0;
            total_consumo = 0;
            caracter = txt_lectura.getText();
            CalcularConsumo();
        }
    }//GEN-LAST:event_txt_lecturaKeyReleased

    private void txtNumMedidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumMedidorKeyReleased
        habilitarBGuardarLect();
    }//GEN-LAST:event_txtNumMedidorKeyReleased

    private void txtFechaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaAnteriorActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void rbt_medidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_medidorActionPerformed
        txtNumMedidor.setEditable(true);
        txtCedula.setEditable(false);
        txtNumMedidor.setEnabled(true);
        txtCedula.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_rbt_medidorActionPerformed

    private void rbt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_cedulaActionPerformed
        txtCedula.setEnabled(true);
        txtCedula.setEditable(true);
        txtNumMedidor.setEnabled(false);
        txtNumMedidor.setEditable(false);
        limpiar();
    }//GEN-LAST:event_rbt_cedulaActionPerformed

    private void jd_fechalecturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jd_fechalecturaKeyReleased
        habilitarBGuardarLect();
    }//GEN-LAST:event_jd_fechalecturaKeyReleased

    private void btn_eliminarlecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarlecturaActionPerformed
        ctrlLectura = new CtrlLectura();
        int fila = tablaLecturas.getSelectedRow();
        if (fila > -1) {
            if (fila == 0) {
            if (!tablaLecturas.getValueAt(fila, 4).toString().equals("pagado")) {
                int idlectura = Integer.parseInt(tablaLecturas.getValueAt(fila, 0).toString());
                ctrlLectura.eliminarLectura(idlectura);
                BuscarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "No se puede eliminar una Lectura pagada");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Solo puede eliminar la ultima lectura emitida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciones por favor una Lectura de la tabla para eliminar");
        }
    }//GEN-LAST:event_btn_eliminarlecturaActionPerformed

    private void tablaLecturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLecturasMouseClicked
        txt_lectura.setEditable(true);
        jd_fechalectura.setEnabled(true);
        btnGuardarLectura.setEnabled(false);
        int fila = tablaLecturas.getSelectedRow();
        System.out.println(fila);
        if (!tablaLecturas.getValueAt(fila, 4).toString().equals("pagado")) {
            btn_editarlectura.setEnabled(true);
            btn_eliminarlectura.setEnabled(true);
            idlectura = Integer.parseInt(tablaLecturas.getValueAt(fila, 0).toString());
            fechalectura = tablaLecturas.getValueAt(fila, 1).toString();
            lectura = tablaLecturas.getValueAt(fila, 2).toString();
            consumo = tablaLecturas.getValueAt(fila, 3).toString();
            txt_valorpago.setText(tablaLecturas.getValueAt(fila, 5).toString());

            if (fila == tablaLecturas.getRowCount() - 1) {
                fechalectura_anterior = tablaLecturas.getValueAt(fila, 1).toString();
                lectura_anterior = "0";
            } else {
                fechalectura_anterior = tablaLecturas.getValueAt(fila + 1, 1).toString();
                lectura_anterior = tablaLecturas.getValueAt(fila + 1, 2).toString();
            }
            cargarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "No se puede editar una Lectura en estado Pagado");
        }
    }//GEN-LAST:event_tablaLecturasMouseClicked

    private void btn_editarlecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarlecturaActionPerformed
        if (tablaLecturas.getSelectedRow() > -1) {
            if (tablaLecturas.getSelectedRow() == 0) {
                ctrlLectura = new CtrlLectura();
                if (txt_lectura.getText().equals("") || jd_fechalectura.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "LLene todos los campos");
                } else {
                    String fechalecturaactual = formato.format(jd_fechalectura.getDate());
                    if (validaciones.validarEditarFechaLectura(fechalectura, fechalecturaactual)) {
                        ctrlLectura = new CtrlLectura();
                        Lecturas lec = new Lecturas();

                        valorPago = calcularValorPago(Integer.parseInt(txtConsumo.getText()));
                        txt_valorpago.setText(valorPago + "");

                        lec.setLectura(txt_lectura.getText());
                        lec.setFechalectura(fechalecturaactual);
                        int consumovalor = Integer.parseInt(txtConsumo.getText());
                        lec.setConsumo(consumovalor);
                        lec.setIdlectura(idlectura);
                        valorPago = Double.parseDouble(txt_valorpago.getText());
                        lec.setValorpago(valorPago);

                        ctrlLectura.editarLectura(lec);
                        MostrarLecturasCliente(Integer.parseInt(txt_idcliente.getText()));

                        txt_lectura.setEditable(false);
                        jd_fechalectura.setEnabled(false);
                        btn_editarlectura.setEnabled(false);
                        btn_eliminarlectura.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "No puede generar dos Lecturas el mismo mes");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Solo puede editar la ultima lectura emitida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciones por favor una Lectura de la tabla para Editar");
        }
    }//GEN-LAST:event_btn_editarlecturaActionPerformed

    private void txtConsumoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsumoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumoKeyReleased

    public void limpiar() {
        btn_eliminarlectura.setEnabled(false);
        btn_editarlectura.setEnabled(false);
        txt_idcliente.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txt_lectura.setText("");
        txtLecAnterior.setText("");
        txtNumMedidor.setText("");
        txtCedula.setText("");
        txtFechaAnterior.setText("");
        txtConsumo.setText("");
        jd_fechalectura.setDate(null);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Fecha Lectura", "lectura", "Consumo", "Estado", "ValorPago"});
        tablaLecturas.setModel(modelo);
    }

    public void habilitarBGuardarLect() {
        System.out.println(jd_fechalectura.getDate());
        if (!txt_lectura.getText().isEmpty() || jd_fechalectura.getDate() != null) {
            btnGuardarLectura.setEnabled(true);
        } else {
            btnGuardarLectura.setEnabled(false);
        }
    }

    public void MostrarLecturasCliente(int idcliente) {
        //**********************Metodo para mostrar los datos del cliente el la tabla*******************
        ctrlLectura = new CtrlLectura();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Fecha Lectura", "lectura", "Consumo", "Estado", "ValorPago"});
        ctrlLectura.listarLecturasCliente(modelo, idcliente);
        tablaLecturas.setModel(modelo);
    }

    public void CalcularConsumo() {
        System.out.println(txt_lectura.getText().length());
        System.out.println(txtLecAnterior.getText().length());
        if (txt_lectura.getText().length() > 0 && txtLecAnterior.getText().length() > 0) {
            lectura_Actual = Integer.parseInt(txt_lectura.getText());
            lectura_Anterior = Integer.parseInt(txtLecAnterior.getText());
            total_consumo = lectura_Actual - lectura_Anterior;
            txtConsumo.setText(String.valueOf(total_consumo));
        } else {
            if (txt_lectura.getText().length() == 0) {
                lectura_Actual = 0;
            } else {
                lectura_Actual = Integer.parseInt(txt_lectura.getText());
            }
            total_consumo = lectura_Actual;
            txtConsumo.setText(String.valueOf(total_consumo));
        }
    }

    public static double calcularValorPago(int consumo) {
        double totalsinexceso = 0;
        double totalconsumoexceso = 0;
        double residuototalexceso = 0;

        if (consumo > 10 && consumo < 20) {
            residuototalexceso = consumo % 10 * 1;
        } else {
            residuototalexceso = consumo % 10 * 5;
        }

        System.out.println("residuo" + residuototalexceso);
        if (consumo > 0) {
            if (consumo <= 10) {
                totalsinexceso = 2;
                System.out.println("Rango de 10");
                return totalsinexceso;
            } else {
                if (consumo > 10 && consumo < 20) {
                    totalsinexceso = 2;
                    if (consumo == 20) {
                        System.out.println("Rango de 20");
                        totalconsumoexceso = 20 * 1;
                        return totalconsumoexceso + totalsinexceso;
                    } else {
                        System.out.println("Rango de 20 menor");
                        totalconsumoexceso = consumo % 10 * 1;
                        return totalconsumoexceso + totalsinexceso;
                    }
                } else {
                    System.out.println("Rango mayor que 20");
                    int consumovalor = consumo - consumo % 10;
                    System.out.println("Consumo valor " + consumovalor);
                    int incremento = 0;
                    while (incremento < consumovalor) {
                        incremento = incremento + 10;
                        if (incremento == 10) {
                            totalsinexceso = 2;
                        }
                        if (incremento == 20) {
                            totalconsumoexceso = totalconsumoexceso + 10 * 1;
                        } else {
                            if (incremento == consumovalor) {
                                totalconsumoexceso = totalconsumoexceso + (incremento - 20) * 5;
                            }
                        }
                    };
                }
            }
        }
        return totalsinexceso + totalconsumoexceso + residuototalexceso;
    }

    public void BuscarCliente() {
        Cliente cliente;
        ctrlLectura = new CtrlLectura();
        parametroCedula = txtCedula.getText();
        parametroNumMedidor = txtNumMedidor.getText();
        if (parametroNumMedidor.equals("") && parametroCedula.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de medidor o cedula, para realizar la busqueda");
        } else {
            if (parametroCedula.equals("")) {
                cliente = ctrlLectura.buscarDatosCliente(parametroNumMedidor);
            } else {
                cliente = ctrlLectura.buscarDatosCliente(parametroCedula);
            }

            if (cliente.getNombre() != null) {
                txtCedula.setEditable(false);
                txtCedula.setEnabled(true);
                txtNumMedidor.setEditable(false);
                txtNumMedidor.setEnabled(true);
                txt_idcliente.setText(cliente.getIdCliente() + "");
                txtNumMedidor.setText(cliente.getNum_medidor());
                txtCedula.setText(cliente.getCedula());
                txtNombre.setText(cliente.getNombre());
                txtApellido.setText(cliente.getApellido());

                MostrarLecturasCliente(cliente.getIdCliente());
                //Se cierrar todas las conexiones de la bd por eso es necesario volver a crear una instancia 
                // del controlador para poder conectarnos de nuevo a la bd
                /*
                 Con este metodo obtenemos la ultima lectura y la ponemos como la anterior para realizar el nuevo ingreso de otra lectura
                 */
                Lecturas lecturas = ctrlLectura.obtenerUltimaLectura(cliente.getIdCliente());
                if (lecturas.getLectura() == null && lecturas.getFechalectura() == null) {
                    txtLecAnterior.setText("");
                    txtFechaAnterior.setText("");
                } else {
                    txtLecAnterior.setText(lecturas.getLectura());
                    txtFechaAnterior.setText(lecturas.getFechalectura());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        }
    }

    public void cargarDatos() {
        try {
            txt_lectura.setText(lectura);
            txtLecAnterior.setText(lectura_anterior);
            txtFechaAnterior.setText(fechalectura_anterior);
            txtConsumo.setText(consumo);
            Date fechaNac = new SimpleDateFormat("yyyy-MM-dd").parse(fechalectura);
            jd_fechalectura.setDate(fechaNac);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lectura");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardarLectura;
    private javax.swing.JButton btnNuevoLec;
    private javax.swing.JButton btn_editarlectura;
    private javax.swing.JButton btn_eliminarlectura;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jd_fechalectura;
    private javax.swing.JLabel lbNum;
    private ventanas.PanelImage1 panelImage11;
    private javax.swing.JRadioButton rbt_cedula;
    private javax.swing.JRadioButton rbt_medidor;
    private javax.swing.JTable tablaLecturas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtFechaAnterior;
    private javax.swing.JTextField txtLecAnterior;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumMedidor;
    private javax.swing.JTextField txt_idcliente;
    private javax.swing.JTextField txt_lectura;
    private javax.swing.JTextField txt_valorpago;
    // End of variables declaration//GEN-END:variables
}
