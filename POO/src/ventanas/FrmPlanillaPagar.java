package ventanas;

import clases.CalcularPrecio;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Lecturas;
import static modelo.Lecturas.listaLectura;

public class FrmPlanillaPagar extends javax.swing.JFrame implements Printable{

    double subTotal;
    int lecActual;
    int lecAnterior;
    double resta;
    String Total;
    String Consumo;

    public FrmPlanillaPagar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Factura = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtLecActual = new javax.swing.JTextField();
        txtLecAnterior = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtComunidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumMedidor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFactuara = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        generarFactura = new javax.swing.JButton();
        imprimirFactura = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Factura.setBackground(new java.awt.Color(153, 153, 153));

        jLabel20.setText("MANTENIMIENTO PARA FUENTES HIDRICAS DE SAJORA");

        jLabel19.setText("CONSUMO EXECESOS ");

        jLabel18.setText("SERVICIO DE AGUA CONSUMO BASICO");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("  Descripcion                                                                            l  Cantidad         l Lote          l    P.Unitario       l  Desc.       ");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Lectura Actual:");

        txtLecActual.setEditable(false);
        txtLecActual.setBorder(null);

        txtLecAnterior.setEditable(false);
        txtLecAnterior.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Lectura Anterior:");

        txtTotal.setEditable(false);
        txtTotal.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Total:");

        txtComunidad.setEditable(false);
        txtComunidad.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Comunidad:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cliente:");

        txtCliente.setEditable(false);
        txtCliente.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Consumo:");

        txtConsumo.setEditable(false);
        txtConsumo.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Dirección:");

        txtDireccion.setEditable(false);
        txtDireccion.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Numero Medidor:");

        txtNumMedidor.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Telefono:");

        txtTelefono.setEditable(false);
        txtTelefono.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Factura:");

        txtFactuara.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("San Jóse de Raranga");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Dirección:");

        jLabel7.setText("sajora@gmail.com");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Mail:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel6.setText("0985038012");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Junta Administradora de Agua Potable y Saneamiento San Jóse de Raranga");

        jLabel22.setText("1,75");

        jLabel23.setText("0.0");

        jLabel24.setText("1.00");

        txtTotalPagar.setEditable(false);
        txtTotalPagar.setBorder(null);

        javax.swing.GroupLayout FacturaLayout = new javax.swing.GroupLayout(Factura);
        Factura.setLayout(FacturaLayout);
        FacturaLayout.setHorizontalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FacturaLayout.createSequentialGroup()
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLecAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtLecActual))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(FacturaLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(74, 74, 74)
                                .addComponent(txtFactuara)))
                        .addGap(39, 39, 39)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel21))
                        .addGap(47, 47, 47)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDireccion)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(txtConsumo))
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(332, 332, 332))
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(FacturaLayout.createSequentialGroup()
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FacturaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel19)
                            .addGroup(FacturaLayout.createSequentialGroup()
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20))
                                .addGap(124, 124, 124)
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FacturaLayout.createSequentialGroup()
                                        .addGap(214, 214, 214)
                                        .addComponent(jLabel23))
                                    .addGroup(FacturaLayout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(FacturaLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FacturaLayout.setVerticalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)))
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtFactuara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(7, 7, 7)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(txtComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtLecAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLecActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20))
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        generarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        generarFactura.setText("Genera Factura");
        generarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarFacturaActionPerformed(evt);
            }
        });

        imprimirFactura.setText("Imprimir Factura");
        imprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirFacturaActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asistencia.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generarFactura)
                        .addGap(18, 18, 18)
                        .addComponent(imprimirFactura)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(255, 255, 255)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generarFactura)
                    .addComponent(imprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void generarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarFacturaActionPerformed
         CalcularPrecio calcular = new CalcularPrecio();
         txtFactuara.setText(Lecturas.getcodigo());
                    if (!FrmCreacionUsuario.ListaCliente.isEmpty()) {
                        if (txtNumMedidor.getText().length() > 0) {
                            for (Cliente c : FrmCreacionUsuario.ListaCliente) {
                                if (c.getNum_medidor().equals(txtNumMedidor.getText())) {
                                    JOptionPane.showMessageDialog(null, "Medidor encontrado!");
                                    
                                    txtNumMedidor.setText(c.getNum_medidor());
                                    txtCliente.setText(c.getNombre()+" "+c.getApellido());
                                    txtDireccion.setText(c.getDireccion());
                                    txtDireccion.setText(c.getDireccion());
                                    txtTelefono.setText(c.getTelefono());
                                    txtComunidad.setText(c.getDireccion());
                                    

                                    //***********************Busqueda del las lecturas en el array listalectura
                                    if (!listaLectura.isEmpty()) {
                                        for (Lecturas L : listaLectura) {

                                            for (int i = listaLectura.size(); i <= listaLectura.size(); i--) {

                                                if (L.getNumMedidor().equals(txtNumMedidor.getText())) {

                                                    txtLecAnterior.setText(L.getLecturaAnter());
                                                    txtLecActual.setText(L.getLecturaAct());
                                                    txtConsumo.setText(L.getConsumo()+" m3");
                                                    calcular.calcularConsumo(txtNumMedidor.getText());
                                                    txtTotal.setText(calcular.getTotal()+" $");
                                                    txtTotalPagar.setText(calcular.getTotal());

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
    }//GEN-LAST:event_generarFacturaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtNumMedidor.setText("");
        txtFactuara.setText("");
        txtCliente.setText("");
        txtComunidad.setText("");
        txtLecAnterior.setText("");
        txtLecActual.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtConsumo.setText("");
        txtTotal.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void imprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirFacturaActionPerformed
        try {
            PrinterJob grap = PrinterJob.getPrinterJob();
            grap.setPrintable(this);
            boolean top=grap.printDialog();
            if (top) {
                grap.print();
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error de programa " ,"\n Error \n "+e, JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_imprimirFacturaActionPerformed


    public String getTotal() {
        return Total;
    }
    public String getConsumo(){
        return Consumo;
    }

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmPlanillaPagar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Factura;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton generarFactura;
    private javax.swing.JButton imprimirFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtComunidad;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFactuara;
    private javax.swing.JTextField txtLecActual;
    private javax.swing.JTextField txtLecAnterior;
    private javax.swing.JTextField txtNumMedidor;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pageFor, int Index) throws PrinterException {
        if (Index>0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D obj = (Graphics2D) graf;
        obj.translate(pageFor.getImageableX()+30, pageFor.getImageableY()+30);
        obj.scale(1.0, 1.0);
        Factura.printAll(graf);
        return PAGE_EXISTS;
    }
}
