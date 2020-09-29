package ventanas;

import clases.CalcularPrecio;
import clases.validaciones;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Lecturas;
import static modelo.Lecturas.listaLectura;
import static ventanas.FrmCreacionUsuario.ListaCliente;

public class FrmIngresoLectura extends javax.swing.JFrame {

    String numero;
    validaciones val = new validaciones();
    CalcularPrecio calcular = new CalcularPrecio();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");

    public FrmIngresoLectura() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        val.ValidarNumeros(txtLec_Actual);
        val.LimitarCaracteres(txtLec_Actual, 10);
        habilitarBGuardarLect();
        this.setLocationRelativeTo(null);
        //MostrarLectura();

        // ---------------------------------------------------------------------
        modeloTabla = (DefaultTableModel) tablaLecturas.getModel();

        agregarDatosTabla();
    }

    // -------------------------------------------------------------------------
    private void agregarDatosTabla() {

        modeloTabla.setRowCount(0);

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
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        txtLec_Actual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLecturas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnNuevoLec = new javax.swing.JButton();
        btnGuardarLectura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtFechaAnterior = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();

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

        txtLec_Actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLec_ActualKeyReleased(evt);
            }
        });

        jLabel7.setText("Lec.Actual:");

        tablaLecturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num Medidor", "Lectura Anterior", "fecha Lectura Anterior", "Lectura Actual", "Fecha Lectura Actual", "Consumo", "Estado"
            }
        ));
        tablaLecturas.setEnabled(false);
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
        btnNuevoLec.setText("Nuevo");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoLec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoLec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarLectura)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtFechaAnterior.setEditable(false);

        jLabel9.setText("Fecha lectura Anterior:");

        jLabel4.setText("Cedula");

        txtCedula.setEditable(false);

        jLabel10.setText("Cosumo");

        txtConsumo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(58, 58, 58))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
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
                    .addComponent(txtNumMedidor))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLec_Actual, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtCedula)
                    .addComponent(txtApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(txtLec_Actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumMedidorActionPerformed

    }//GEN-LAST:event_txtNumMedidorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                //***********************Busqueda de los datos del cliente*******************************
                    if (!FrmCreacionUsuario.ListaCliente.isEmpty()) {
                        if (txtNumMedidor.getText().length() > 0) {
                            for (Cliente c : FrmCreacionUsuario.ListaCliente) {
                                if (c.getNum_medidor().equals(txtNumMedidor.getText())) {
                                    JOptionPane.showMessageDialog(null, "Medidor encontrado!");
                                    txtNombre.setText(c.getNombre());
                                    txtApellido.setText(c.getApellido());
                                    txtCedula.setText(c.getCedula());
                                    lbNum.setText(c.getNum_medidor());
                                    //***********************Busqueda del las lecturas en el array listalectura
                                    if (!listaLectura.isEmpty()) {
                                        for (Lecturas L : listaLectura) {
                                            for (int i = listaLectura.size(); i <= listaLectura.size(); i--) {
                                                if (L.getNumMedidor().equals(txtNumMedidor.getText())) {
                                                    txtLecAnterior.setText(L.getLecturaAct());
                                                    txtFechaAnterior.setText(L.getFecha_lecturaAct());
                                                    txtConsumo.setText(L.getConsumo());

                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay lecturas");
                                    }
                                    break;
                                }else{
                                     JOptionPane.showMessageDialog(null, "Medidor no encontrada!");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Ingrese el numero de medidor");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron datos los cuales mostrar");
                    }



    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLecActionPerformed
        limpiar();
    }//GEN-LAST:event_btnNuevoLecActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        FrmMenuPrincipal men = new FrmMenuPrincipal();
//        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        Lecturas lec = new Lecturas();
        Lecturas lec2 = new Lecturas();
        CalcularPrecio calculo = new CalcularPrecio();
        boolean correcto = true;
        boolean registrar = true;
        boolean cedCorr = true;
        correcto = false;
        String Intento;

        if (!FrmCreacionUsuario.ListaCliente.isEmpty()) {
            if (txtNumMedidor.getText().length() > 0) {

                for (Cliente c : FrmCreacionUsuario.ListaCliente) {
                    if (c.getNum_medidor().equals(txtNumMedidor.getText())) {
                        registrar = true;
                        break;
                    } else {
                        registrar = false;
                    }
                }
            }
        }
        int LECTURA_ANT = Integer.parseInt(txtLecAnterior.getText());
        int LECT_ACTUAL = Integer.parseInt(txtLec_Actual.getText()); //validar LECT_ACTUAL
        if (LECT_ACTUAL < LECTURA_ANT || LECT_ACTUAL > 100000000) {
            registrar = false;
            txtLec_Actual.setText("");
        }
       /* if (cFechaLecturaAct.getDate() == null) {
            registrar = false;
        }*/

        if (registrar == true) {
            int ax = JOptionPane.showConfirmDialog(null, "Desea guardar la lectura?");
            if (ax == JOptionPane.YES_OPTION) {

                lec.setNumMedidor(txtNumMedidor.getText());
                lec.setFecha_lecturaAnter(txtFechaAnterior.getText());
                //String fechaLectura = formato.format(cFechaLecturaAct.getDate());
               // lec.setFecha_lecturaAct(fechaLectura);
                lec.setLecturaAnter(txtLecAnterior.getText());
                lec.setLecturaAct(txtLec_Actual.getText());
                calculo.calcularM3(txtLec_Actual.getText(), txtLecAnterior.getText());
                lec.setConsumo(calculo.getConsumo());
                listaLectura.add(lec);

                JOptionPane.showMessageDialog(null, "Lectura guardado correctamente");
                agregarDatosTabla();
                limpiar();

            } else if (ax == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Lectura no guardado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Algun dato fue incorrecto vuelva a ingresar ");
        }


    }//GEN-LAST:event_btnGuardarLecturaActionPerformed

    private void txtLec_ActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLec_ActualKeyReleased
        habilitarBGuardarLect();
    }//GEN-LAST:event_txtLec_ActualKeyReleased

    private void txtNumMedidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumMedidorKeyReleased
        habilitarBGuardarLect();
    }//GEN-LAST:event_txtNumMedidorKeyReleased

    private void txtFechaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaAnteriorActionPerformed

    public void limpiar() {

        txtNombre.setText("");
        txtApellido.setText("");
        txtLec_Actual.setText("");
        txtLecAnterior.setText("");
        txtNumMedidor.setText("");
        txtCedula.setText("");
        txtFechaAnterior.setText("");
        txtConsumo.setText("");
        //cFechaLecturaAct.setDate(null);
    }

    public void habilitarBGuardarLect() {
        if (!txtLec_Actual.getText().isEmpty() && !txtLecAnterior.getText().isEmpty() && !txtNumMedidor.getText().isEmpty()) {
            btnGuardarLectura.setEnabled(true);

        } else {
            btnGuardarLectura.setEnabled(false);

        }
    }

   // -----------------------------------------------------------------------------------------
    private DefaultTableModel modeloTabla;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardarLectura;
    private javax.swing.JButton btnNuevoLec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lbNum;
    private javax.swing.JTable tablaLecturas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtFechaAnterior;
    private javax.swing.JTextField txtLecAnterior;
    private javax.swing.JTextField txtLec_Actual;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumMedidor;
    // End of variables declaration//GEN-END:variables
}
