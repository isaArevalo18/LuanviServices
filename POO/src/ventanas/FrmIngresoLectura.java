package ventanas;

import Controlador.CtrlLectura;

import clases.CalcularPrecio;
import clases.validaciones;

import java.text.SimpleDateFormat;
import java.util.Date;

//import java.util.ArrayList;
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
        txtConsumo.setText("0000");
        txt_valorpago.setText("0.00");
        btn_eliminarlectura.setEnabled(false);
        btn_editarlectura.setEnabled(false);
        rbt_medidor.setSelected(true);
        txtNumMedidor.setEnabled(true);
        txtNumMedidor.setEditable(true);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        val.ValidarNumeros(txt_lectura);
        val.LimitarCaracteres(txt_lectura, 4);
        habilitarBGuardarLect();
        this.setLocationRelativeTo(null);
        //MostrarLectura();

        // ---------------------------------------------------------------------
    }

    // -------------------------------------------------------------------------
    private void agregarDatosTabla() {

        /*modeloTabla.setRowCount(0);

        int numRegistros = listaLectura.size();

        for (int i = 0; i < numRegistros; i++) {

            modeloTabla.addRow(new Object[]{
                listaLectura.get(i).getNumMedidor(),
                listaLectura.get(i).getLecturaAnter(),
                listaLectura.get(i).getFecha_lecturaAnter(),
                listaLectura.get(i).getLecturaAct(),
                listaLectura.get(i).getFecha_lecturaAct(),
                listaLectura.get(i).getConsumo(),
                listaLectura.get(i).isEstado()

            });
        }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lbNum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumMedidor = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtLecAnterior = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_lectura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLecturas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnNuevoLec = new javax.swing.JButton();
        btnGuardarLectura = new javax.swing.JButton();
        btn_eliminarlectura = new javax.swing.JButton();
        btn_editarlectura = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtFechaAnterior = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        rbt_medidor = new javax.swing.JRadioButton();
        rbt_cedula = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txt_idcliente = new javax.swing.JTextField();
        jd_fechalectura = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_valorpago = new javax.swing.JTextField();

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

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));

        lbNum.setForeground(new java.awt.Color(33, 45, 62));
        lbNum.setText("Num:");

        jLabel1.setBackground(new java.awt.Color(33, 45, 62));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Lecturas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbNum)
                .addGap(243, 243, 243)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNum))
                .addGap(19, 19, 19))
        );

        jLabel2.setText("Num. Medidor:");

        jLabel3.setText("Nombre:");

        txtNumMedidor.setEditable(false);
        txtNumMedidor.setEnabled(false);
        txtNumMedidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumMedidorActionPerformed(evt);
            }
        });
        txtNumMedidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumMedidorKeyReleased(evt);
            }
        });

        txtNombre.setEditable(false);

        txtLecAnterior.setEditable(false);

        jLabel5.setText("Apellido:");

        txtApellido.setEditable(false);

        jLabel6.setText("Lec.Anterior");

        txt_lectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lecturaActionPerformed(evt);
            }
        });
        txt_lectura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lecturaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_lecturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lecturaKeyTyped(evt);
            }
        });

        jLabel7.setText("Lectura:");

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

        jLabel8.setText("Fecha:");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevoLec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        btnNuevoLec.setText("Nueva Lectura");
        btnNuevoLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLecActionPerformed(evt);
            }
        });

        btnGuardarLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingreso de lecturas.png"))); // NOI18N
        btnGuardarLectura.setText("guardar lectura");
        btnGuardarLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarLecturaActionPerformed(evt);
            }
        });

        btn_eliminarlectura.setText("eliminar");
        btn_eliminarlectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarlecturaActionPerformed(evt);
            }
        });

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
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoLec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarLectura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminarlectura)
                .addGap(18, 18, 18)
                .addComponent(btn_editarlectura)
                .addContainerGap())
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtFechaAnterior.setEditable(false);

        jLabel9.setText("Fecha lectura Anterior:");

        jLabel4.setText("Cedula");

        txtCedula.setEditable(false);
        txtCedula.setEnabled(false);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel10.setText("Cosumo M3");

        txtConsumo.setEditable(false);
        txtConsumo.setToolTipText("");
        txtConsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsumoKeyReleased(evt);
            }
        });

        buttonGroup1.add(rbt_medidor);
        rbt_medidor.setText("NroMedidor");
        rbt_medidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_medidorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt_cedula);
        rbt_cedula.setText("Cedula");
        rbt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_cedulaActionPerformed(evt);
            }
        });

        jLabel11.setText("Buscar por:");

        txt_idcliente.setEditable(false);

        jd_fechalectura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jd_fechalecturaKeyReleased(evt);
            }
        });

        jLabel12.setText("IdCliente:");

        jLabel13.setText("ValorPago:");

        txt_valorpago.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtLecAnterior)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtConsumo)
                            .addComponent(txtNumMedidor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbt_medidor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_lectura, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtCedula)
                            .addComponent(txtApellido)
                            .addComponent(jd_fechalectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_valorpago, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rbt_medidor)
                            .addComponent(rbt_cedula)
                            .addComponent(txt_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLecAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_lectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFechaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jd_fechalectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(txt_valorpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumMedidorActionPerformed

    }//GEN-LAST:event_txtNumMedidorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //***********************Busqueda de los datos del cliente*******************************
        txtConsumo.setText("");
        txt_lectura.setText("");
        jd_fechalectura.setDate(null);
        txt_lectura.setEditable(true);
        jd_fechalectura.setEnabled(true);
        BuscarCliente();
        btn_eliminarlectura.setEnabled(true);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLecActionPerformed
        limpiar();
        txt_lectura.setEditable(true);
        jd_fechalectura.setEnabled(true);
        rbt_medidor.setSelected(true);
        txtNumMedidor.setEnabled(true);
        txtNumMedidor.setEditable(true);
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
        lectura_Actual = Integer.parseInt(txt_lectura.getText());
        lectura_Anterior = Integer.parseInt(txtLecAnterior.getText());
        if (lectura_Actual < lectura_Anterior) {
            JOptionPane.showMessageDialog(null, "La Lectura Actual no puede ser menor a la Anterior");
        } else {
            String fechalecturaactual = formato.format(jd_fechalectura.getDate());
            String fechalecturaacterior = txtFechaAnterior.getText();
            System.out.println();

            if (txt_lectura.getText().equals("") || fechalecturaactual.equals("")) {
                JOptionPane.showMessageDialog(null, "LLene todos los campos");
            } else {
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
                    valorPago = Double.parseDouble(txt_valorpago.getText());
                    lec.setValorpago(valorPago);
                    lec.setIdCliente(Integer.parseInt(txt_idcliente.getText()));
                    lec.setFechaLecturaAnterior(txtFechaAnterior.getText());
                    lec.setLecturaAnterior(Integer.parseInt(txtLecAnterior.getText()));
                    ctrlLectura.insertarLectura(lec);
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
        System.out.println(evt.getKeyCode());
        if (Character.isDigit(evt.getKeyChar())) {
            // System.out.println("cumple");
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

    }//GEN-LAST:event_jd_fechalecturaKeyReleased

    private void btn_eliminarlecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarlecturaActionPerformed

        ctrlLectura = new CtrlLectura();
        int fila = tablaLecturas.getSelectedRow();
        if (fila > -1) {
            if (!tablaLecturas.getValueAt(fila, 4).toString().equals("pagado")) {
                int idlectura = Integer.parseInt(tablaLecturas.getValueAt(fila, 0).toString());
                ctrlLectura.eliminarLectura(idlectura);
                BuscarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "No se puede eliminar una Lectura pagada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciones por favor una Lectura de la tabla para eliminar");
        }

    }//GEN-LAST:event_btn_eliminarlecturaActionPerformed

    private void tablaLecturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLecturasMouseClicked
        txt_lectura.setEditable(true);
        jd_fechalectura.setEnabled(true);
        int fila = tablaLecturas.getSelectedRow();
        if (!tablaLecturas.getValueAt(fila, 4).toString().equals("pagado")) {
            btn_editarlectura.setEnabled(true);
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
            ctrlLectura = new CtrlLectura();
            String fechalecturaactual = formato.format(jd_fechalectura.getDate());
            String fechalecturaacterior = txtFechaAnterior.getText();

            if (txt_lectura.getText().equals("") || fechalecturaactual.equals("")) {
                JOptionPane.showMessageDialog(null, "LLene todos los campos");
            } else {
                if (validaciones.validarFechaLectura(fechalecturaacterior, fechalecturaactual)) {
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
                    lec.setFechaLecturaAnterior(txtFechaAnterior.getText());
                    lec.setLecturaAnterior(Integer.parseInt(txtLecAnterior.getText()));

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
            JOptionPane.showMessageDialog(null, "Selecciones por favor una Lectura de la tabla para Editar");
        }
    }//GEN-LAST:event_btn_editarlecturaActionPerformed

    private void txt_lecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lecturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lecturaActionPerformed

    private void txt_lecturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lecturaKeyTyped

    }//GEN-LAST:event_txt_lecturaKeyTyped

    private void txt_lecturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lecturaKeyPressed

    }//GEN-LAST:event_txt_lecturaKeyPressed

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

        //cFechaLecturaAct.setDate(null);
    }

    public void habilitarBGuardarLect() {
        if (!txt_lectura.getText().isEmpty() && !txtLecAnterior.getText().isEmpty() && !txtNumMedidor.getText().isEmpty()) {
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
        if (txt_lectura.getText().length() > 0 && txtLecAnterior.getText().length() > 0) {
            lectura_Actual = Integer.parseInt(txt_lectura.getText());
            System.out.println(lectura_Actual);
            lectura_Anterior = Integer.parseInt(txtLecAnterior.getText());
            System.out.println(lectura_Anterior);

            total_consumo = lectura_Actual - lectura_Anterior;
            if (txtLecAnterior.getText().equals("0")) {
                txt_valorpago.setText("0");
                txtConsumo.setText("0");
            } else {
                txtConsumo.setText(String.valueOf(total_consumo));
            }

        } else {
            txtConsumo.setText("");
            caracter = "";
            lectura_Actual = 0;
            lectura_Anterior = 0;
            total_consumo = 0;
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
                totalsinexceso = consumo * 2.50;
                System.out.println("Rango de 10");
                return totalsinexceso;
            } else {
                if (consumo > 10 && consumo < 20) {
                    totalsinexceso = 10 * 2.50;
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
                    //System.out.println(totalconsumoexceso=residuototalexceso);
                    int consumovalor = consumo - consumo % 10;
                    System.out.println("Consumo valor " + consumovalor);
                    int incremento = 0;
                    while (incremento < consumovalor) {

                        //System.out.println(incremento);
                        incremento = incremento + 10;
                        if (incremento == 10) {

                            totalsinexceso = incremento * 2.50;
                            //  System.out.println(totalsinexceso);
                        }
                        if (incremento == 20) {
                            totalconsumoexceso = totalconsumoexceso + 10 * 1;
                            // System.out.println(totalconsumoexceso);
                        } else {

                            if (incremento == consumovalor) {
                                //System.out.println("Residuo"+residuototalexceso);
                                totalconsumoexceso = totalconsumoexceso + (incremento - 20) * 5;
                            }
                            // System.out.println(totalconsumoexceso);
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
                    txtLecAnterior.setText("0");
                    txtFechaAnterior.setText(cliente.getFechaCreacion());
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jd_fechalectura;
    private javax.swing.JLabel lbNum;
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
