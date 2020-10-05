package ventanas;

import Controlador.CtrlPlanilla;
import clases.CalcularPrecio;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cliente;
import modelo.DetallePlanilla;
import modelo.Lecturas;
import modelo.Planilla;

public class FrmPlanillaPagar extends javax.swing.JFrame implements Printable {

    CtrlPlanilla ctrlPlanilla;
    double subTotal;
    int lecActual;
    int lecAnterior;
    double resta;
    String Total;
    String Consumo;
    double totalsinexceso = 0;
    double totalconsumoexceso = 0;
    double residuototalexceso = 0;

    public FrmPlanillaPagar() {
        initComponents();
        ctrlPlanilla = new CtrlPlanilla();
        cargarPlanilla();
        obtenerFechaActual();
        txtnumfactura.setText(ctrlPlanilla.obtenerNumeroPlanilla());
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
        jLabel10 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumMedidor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnumfactura = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_consumoExcesos = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lbl_consumo = new javax.swing.JLabel();
        lbl_consumobasico = new javax.swing.JLabel();
        lbl_precionunitario_sinexceso = new javax.swing.JLabel();
        lbl_precionunitario_sinexceso1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbl_mes = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFechaPago = new javax.swing.JTextField();
        generarFactura = new javax.swing.JButton();
        imprimirFactura = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Factura.setBackground(new java.awt.Color(255, 255, 255));
        Factura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("MANTENIMIENTO PARA FUENTES HIDRICAS DE SAJORA");
        Factura.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 444, -1, -1));

        jLabel19.setText("CONSUMO EXECESOS ");
        Factura.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 399, -1, 27));

        jLabel18.setText("SERVICIO DE AGUA CONSUMO BASICO");
        Factura.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 365, -1, 24));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("                            Descripcion                                                      l  Cantidad              Consumo M3               l    P.Unitario                   l  Desc.       ");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Factura.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 324, 823, 31));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Lectura Actual:");
        Factura.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 284, -1, -1));

        txtLecActual.setEditable(false);
        txtLecActual.setBorder(null);
        Factura.add(txtLecActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 286, 188, -1));

        txtLecAnterior.setEditable(false);
        txtLecAnterior.setBorder(null);
        Factura.add(txtLecAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 286, 188, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Lectura Anterior:");
        Factura.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 284, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cliente:");
        Factura.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 246, -1, -1));

        txtCliente.setEditable(false);
        txtCliente.setBorder(null);
        Factura.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 248, 188, 14));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Dirección:");
        Factura.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 246, -1, -1));

        txtDireccion.setEditable(false);
        txtDireccion.setBorder(null);
        Factura.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 248, 162, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Numero Medidor:");
        Factura.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));

        txtNumMedidor.setEditable(false);
        txtNumMedidor.setBorder(null);
        Factura.add(txtNumMedidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 219, 188, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Telefono:");
        Factura.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 213, 62, -1));

        txtTelefono.setEditable(false);
        txtTelefono.setBorder(null);
        Factura.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 215, 162, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nro. Planilla");
        Factura.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 177, -1, -1));

        txtnumfactura.setEditable(false);
        txtnumfactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Factura.add(txtnumfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 174, 122, -1));
        Factura.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 911, 11));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("San Jóse de Raranga");
        Factura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 107, 133, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Dirección:");
        Factura.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        jLabel7.setText("sajora@gmail.com");
        Factura.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 109, 168, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Mail:");
        Factura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 107, 34, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Telefono:");
        Factura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 59, -1));

        jLabel6.setText("0985038012");
        Factura.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 101, 109, 15));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Junta Administradora de Agua Potable y Saneamiento San Jóse de Raranga");
        Factura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 10, 564, 46));

        lbl_consumoExcesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Factura.add(lbl_consumoExcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 83, 24));

        jLabel23.setText("0.0");
        Factura.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 363, 49, 20));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("1.00");
        Factura.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 70, 20));

        txtTotalPagar.setEditable(false);
        txtTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalPagar.setBorder(null);
        Factura.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 98, 23));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cliente RUC:");
        Factura.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 98, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Correo:");
        Factura.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 177, 62, -1));

        txtCorreo.setEditable(false);
        Factura.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 176, 176, -1));

        lbl_consumo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_consumo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Factura.add(lbl_consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 96, 24));

        lbl_consumobasico.setBackground(new java.awt.Color(255, 255, 255));
        lbl_consumobasico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Factura.add(lbl_consumobasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 83, 24));

        lbl_precionunitario_sinexceso.setBackground(new java.awt.Color(255, 255, 255));
        lbl_precionunitario_sinexceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_precionunitario_sinexceso.setText("2.50");
        Factura.add(lbl_precionunitario_sinexceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 360, 100, 24));

        lbl_precionunitario_sinexceso1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_precionunitario_sinexceso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_precionunitario_sinexceso1.setText("0-20m3 $1 - 21m3..   $5");
        Factura.add(lbl_precionunitario_sinexceso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 143, 24));

        jLabel21.setText("TOTAL A PAGAR:");
        Factura.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 499, 110, -1));

        lbl_mes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_mes.setText(" ");
        Factura.add(lbl_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 540, 20));

        txtRuc.setEditable(false);
        Factura.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 70, 141, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("Fecha Pago:");
        Factura.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 100, 20));

        txtFechaPago.setEditable(false);
        Factura.add(txtFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 150, -1));

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
        btnSalir.setText("Regresar");
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
                .addComponent(generarFactura)
                .addGap(18, 18, 18)
                .addComponent(imprimirFactura)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        cambiarVentana();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void generarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarFacturaActionPerformed
        ctrlPlanilla = new CtrlPlanilla();
        /*Guarda los datos necesarios en un objeto de la clase detalle planilla para almacenarla*/
        DetallePlanilla p = new DetallePlanilla();

        p.setIdCliente(DetallePlanilla.cargarPlanilla.get(0).getIdCliente());
        p.setFechaPlanilla(txtFechaPago.getText());
        p.setTotal(Double.parseDouble(txtTotalPagar.getText()));
        p.setConsumoexceso(Double.parseDouble(lbl_consumobasico.getText()));
        p.setConsumosinexceso(Double.parseDouble(lbl_consumoExcesos.getText()));
        p.setConsumo(lbl_consumo.getText());
        p.setIdlectura(DetallePlanilla.cargarPlanilla.get(0).getIdlectura());
        /*Mandamos a llamar el metodo para guardar la planilla*/
        ctrlPlanilla.emitirPlanilla(p);

        cambiarVentana();


    }//GEN-LAST:event_generarFacturaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtNumMedidor.setText("");
        txtnumfactura.setText("");
        txtCliente.setText("");
        txtLecAnterior.setText("");
        txtLecActual.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void imprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirFacturaActionPerformed
        try {
            PrinterJob grap = PrinterJob.getPrinterJob();
            grap.setPrintable(this);
            boolean top = grap.printDialog();
            if (top) {
                grap.print();
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error de programa ", "\n Error \n " + e, JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_imprimirFacturaActionPerformed

    public String getTotal() {
        return Total;
    }

    public String getConsumo() {
        return Consumo;
    }

    public void cargarPlanilla() {
        if (!DetallePlanilla.cargarPlanilla.isEmpty()) {
            txtRuc.setText(DetallePlanilla.cargarPlanilla.get(0).getCedula());
            txtNumMedidor.setText(DetallePlanilla.cargarPlanilla.get(0).getNumeromedidor());
            txtCliente.setText(DetallePlanilla.cargarPlanilla.get(0).getNombrecliente() + " " + DetallePlanilla.cargarPlanilla.get(0).getApellidopcliente());
            txtDireccion.setText(DetallePlanilla.cargarPlanilla.get(0).getDireccioncliente());
            txtTelefono.setText(DetallePlanilla.cargarPlanilla.get(0).getTelefono());
            txtCorreo.setText(DetallePlanilla.cargarPlanilla.get(0).getCorreocliente());
            txtLecAnterior.setText(DetallePlanilla.cargarPlanilla.get(0).getLectura_anterior());
            txtLecActual.setText(DetallePlanilla.cargarPlanilla.get(0).getLectura_actual());
            lbl_mes.setText("Planilla de Consumos de " + DetallePlanilla.cargarPlanilla.get(0).getMespago());
            txtTotalPagar.setText(calcularValorPago() + "");
            lbl_consumoExcesos.setText(totalconsumoexceso + "");
            lbl_consumobasico.setText(totalsinexceso + "");
            lbl_consumo.setText(DetallePlanilla.cargarPlanilla.get(0).getConsumo());
        } else {
            JOptionPane.showMessageDialog(null, "Erro al carga los datos de la factura, regrese a la ventana de pago");
        }

    }

    public double calcularValorPago() {
        /*Obtenemos el total en m3 de consumo entre la lectura actual y la anterior*/
        int consumo = Integer.parseInt(txtLecActual.getText()) - Integer.parseInt(txtLecAnterior.getText());

        if (consumo > 0) {
            /*Aqui guardamos las cantidades que no son multiplos de 10, por ejemplo 
             Si consumimos 24m3 la variable residuototalexceso sera igual a 4 y esos 4 los multplicara por 5
            En caso de ser 14m3 esos 4 se multiplicaran por 1
             */
            if (consumo > 10 && consumo < 20) {
                residuototalexceso = consumo % 10 * 1;
            } else {
                residuototalexceso = consumo % 10 * 5;
            }
            
            /*Si el consumo es menor a 10*/
            if (consumo <= 10) {
                totalsinexceso = consumo * 2.50;
                // System.out.println("Rango de 10");
                return totalsinexceso;
            } else {
                /*Si el consumo esta entre mayor a 10 e inferior 20*/
                if (consumo > 10 && consumo < 20) {
                    totalsinexceso = 10 * 2.50;
                    if (consumo == 20) {
                        // System.out.println("Rango de 20");
                        totalconsumoexceso = 20 * 1;
                        return totalconsumoexceso + totalsinexceso;
                    } else {
                        // System.out.println("Rango de 20 menor");
                        totalconsumoexceso = consumo % 10 * 1;
                        return totalconsumoexceso + totalsinexceso;
                    }

                } else {
                   /*Aqui realizamos el calculo de los consumos que son superiores a 20*/
                   
                    /*En la variable consumovalor vamos a almacenar hasta el ultimo multiplo de 10 dek valor que consumimos por ejemplo
                         Si consumimos 52m3 esta variable sera igual a 50m3
                     */
                    int consumovalor = consumo - consumo % 10;
                    /*
             Lavariable incremento permitira repetir el bucle while hasta que el valor del incremento
              sea igual al valor de la variable consumo valor
             En cada vuelta o iteracion que haga se ira icrementadando de 10 en 10 por ejemplo el incremento sera 10,20,30,40.. hasta que sea
            igual a 50
                     */
                    int incremento = 0;
                    /*Se repite siempre y cuando el incremento sea menor al cosumo valor*/
                    while (incremento < consumovalor) {
                        /*Realizamos el incrementp*/
                        incremento = incremento + 10;
                        /*Si es igual a da representamos el totalcosumo sin exceso y multiplicamos por 2.50*/
                        if (incremento == 10) {

                            totalsinexceso = incremento * 2.50;
                            //  System.out.println(totalsinexceso);
                        }
                        /*Si el incremento es 20 significa que el consumo exceso sera a $1 por m3*/
                        if (incremento == 20) {
                            totalconsumoexceso = totalconsumoexceso + 10 * 1;
                            // System.out.println(totalconsumoexceso);
                        } else {

                            /*Si la cantidad del incremento es mayor a 20, sumamos el incremento hasta que llegue a ser igual al consumovalor*/
                            if (incremento == consumovalor) {

                                /*Aqui restamos los 20m3 que ya se calcularon anteriormente y multiplicamos por $5 lo que resta y lo sumamos a 
                        la variable total consumo excesos  sumara todo el valor de los excesos
                                 */
                                totalconsumoexceso = totalconsumoexceso + (incremento - 20) * 5;
                            }
                            // System.out.println(totalconsumoexceso);
                        }

                    };

                }
            }

        }
        /*Finalmente retornamos el valor total a pagar de los cosumos sin excesos y con excesos */
        return totalsinexceso + totalconsumoexceso + residuototalexceso + 1;
    }

    /*
      Este metodo retorna la fecha actual del dia
     */
    public void obtenerFechaActual() {
        Calendar c = new GregorianCalendar();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        String año = Integer.toString(c.get(Calendar.YEAR));
        txtFechaPago.setText(año + "-" + mes + "-" + dia);
    }

    /*Este metodo permite cerrar la ventana cuando se haya guardado la planilla en la base de datos 
     y regresar a la ventana de pago y seleccionar las lecturas aun pendiende por generar su planilla
     */
    public void cambiarVentana() {
        FrmConsumoPago fcp = new FrmConsumoPago();
        fcp.txtbuscarcliente.setText(txtNumMedidor.getText());
        DetallePlanilla.cargarPlanilla.clear();
        fcp.BuscarCliente();
        fcp.GenerarDetallePago();
        fcp.setVisible(true);
        this.dispose();
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_consumo;
    private javax.swing.JLabel lbl_consumoExcesos;
    private javax.swing.JLabel lbl_consumobasico;
    private javax.swing.JLabel lbl_mes;
    private javax.swing.JLabel lbl_precionunitario_sinexceso;
    private javax.swing.JLabel lbl_precionunitario_sinexceso1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtLecActual;
    private javax.swing.JTextField txtLecAnterior;
    private javax.swing.JTextField txtNumMedidor;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtnumfactura;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pageFor, int Index) throws PrinterException {
        if (Index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D obj = (Graphics2D) graf;
        obj.translate(pageFor.getImageableX() + 30, pageFor.getImageableY() + 30);
        obj.scale(1.0, 1.0);
        Factura.printAll(graf);
        return PAGE_EXISTS;
    }
}
