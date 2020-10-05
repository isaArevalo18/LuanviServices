package ventanas;

import clases.paneimage;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    static int contador = 0;
    int velocidad = 2;
    Timer timer;
    TimerTask tarea;
    int velMil = velocidad * 1000;

    public FrmMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        cambiar();

        setVisible(true);

    }

    public void cambiar() {

        tarea = new TimerTask() {
            Icon icono;

            @Override
            public void run() {
                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/Imagenes/agua1.png"));
                        lbImagenes.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/Imagenes/agua2.png"));
                        lbImagenes.setIcon(icono);
                        break;
                    case 2:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/Imagenes/agua3.png"));
                        lbImagenes.setIcon(icono);
                        break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velMil, velMil);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        PagoAgua = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        conCliente = new javax.swing.JMenuItem();
        conEmplado = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        panelImage1 = new ventanas.PanelImage1();
        lbImagenes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itmNuevoUsuario = new javax.swing.JMenuItem();
        itmNuevoEmpleado = new javax.swing.JMenuItem();
        itemPagoConsumo = new javax.swing.JMenu();
        itmPagoConsumo = new javax.swing.JMenuItem();
        intemLecturas = new javax.swing.JMenu();
        miIngresoLect = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MiUsuarios = new javax.swing.JMenuItem();
        MiConsultaGeneral = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        MiPlanilla = new javax.swing.JMenuItem();

        PagoAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pago.png"))); // NOI18N
        PagoAgua.setText("pago de agua");
        PagoAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoAguaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(PagoAgua);

        Consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar datos.png"))); // NOI18N
        Consultas.setText("Consultas");

        conCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cosulta Usuario.png"))); // NOI18N
        conCliente.setText("Consulta Cliente");
        conCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conClienteActionPerformed(evt);
            }
        });
        Consultas.add(conCliente);

        conEmplado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta emplado.png"))); // NOI18N
        conEmplado.setText("Consulta Empleado");
        conEmplado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conEmpladoActionPerformed(evt);
            }
        });
        Consultas.add(conEmplado);

        jPopupMenu1.add(Consultas);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Salir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        panelImage1.setComponentPopupMenu(jPopupMenu1);

        lbImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agua1.png"))); // NOI18N
        lbImagenes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap(814, Short.MAX_VALUE)
                .addComponent(lbImagenes)
                .addContainerGap())
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagenes)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        jMenu5.setText("Archivo");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        miSalir.setText("Salir");
        miSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        miSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miSalirMouseEntered(evt);
            }
        });
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        jMenu5.add(miSalir);

        jMenuBar1.add(jMenu5);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessman_add.png"))); // NOI18N
        jMenu1.setText("Usuario");

        itmNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessman_add.png"))); // NOI18N
        itmNuevoUsuario.setText("Nuevo Cliente");
        itmNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itmNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itmNuevoUsuarioMouseEntered(evt);
            }
        });
        itmNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(itmNuevoUsuario);

        itmNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessman_add.png"))); // NOI18N
        itmNuevoEmpleado.setText("Nuevo Empleado");
        itmNuevoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itmNuevoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itmNuevoEmpleadoMouseEntered(evt);
            }
        });
        itmNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNuevoEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(itmNuevoEmpleado);

        jMenuBar1.add(jMenu1);

        itemPagoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        itemPagoConsumo.setText("Pago");

        itmPagoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pago.png"))); // NOI18N
        itmPagoConsumo.setText("Pago Consumo");
        itmPagoConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itmPagoConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itmPagoConsumoMouseEntered(evt);
            }
        });
        itmPagoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPagoConsumoActionPerformed(evt);
            }
        });
        itemPagoConsumo.add(itmPagoConsumo);

        jMenuBar1.add(itemPagoConsumo);

        intemLecturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/talento humano.png"))); // NOI18N
        intemLecturas.setText("Lecturas");
        intemLecturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        miIngresoLect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingreso de lecturas.png"))); // NOI18N
        miIngresoLect.setText("Ingreso Lectura");
        miIngresoLect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        miIngresoLect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miIngresoLectMouseEntered(evt);
            }
        });
        miIngresoLect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturas(evt);
            }
        });
        intemLecturas.add(miIngresoLect);

        jMenuBar1.add(intemLecturas);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        jMenu2.setText("Consultas");

        MiUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cosulta Usuario.png"))); // NOI18N
        MiUsuarios.setText("Usuarios");
        MiUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MiUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiUsuariosMouseEntered(evt);
            }
        });
        MiUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(MiUsuarios);

        MiConsultaGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta general.png"))); // NOI18N
        MiConsultaGeneral.setText("Consulta Planillas");
        MiConsultaGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MiConsultaGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiConsultaGeneralMouseEntered(evt);
            }
        });
        MiConsultaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiConsultaGeneralActionPerformed(evt);
            }
        });
        jMenu2.add(MiConsultaGeneral);

        jMenuBar1.add(jMenu2);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirw.png"))); // NOI18N
        jMenu10.setText("Planilla");
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });

        MiPlanilla.setText("Planilla");
        MiPlanilla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MiPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiPlanillaMouseEntered(evt);
            }
        });
        MiPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiPlanillaActionPerformed(evt);
            }
        });
        jMenu10.add(MiPlanilla);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiConsultaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiConsultaGeneralActionPerformed
        FrmConsultasFactura consultasFactura = new FrmConsultasFactura();
        consultasFactura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MiConsultaGeneralActionPerformed

    private void itmNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNuevoUsuarioActionPerformed
        FrmCreacionUsuario usu = new FrmCreacionUsuario();
        usu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmNuevoUsuarioActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void MiUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiUsuariosActionPerformed
        FrmReporteCliente rep = new FrmReporteCliente();
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MiUsuariosActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed

    }//GEN-LAST:event_jMenu10ActionPerformed

    private void itmPagoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPagoConsumoActionPerformed
        FrmConsumoPago consmo = new FrmConsumoPago();
        consmo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmPagoConsumoActionPerformed

    private void MiPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiPlanillaActionPerformed
        FrmPlanillaPagar v = new FrmPlanillaPagar();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MiPlanillaActionPerformed

    private void lecturas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturas
        FrmIngresoLectura v = new FrmIngresoLectura();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lecturas

    private void miSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSalirMouseEntered
        miSalir.setToolTipText("Salir del progama");
    }//GEN-LAST:event_miSalirMouseEntered

    private void itmNuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmNuevoUsuarioMouseEntered
        itmNuevoUsuario.setToolTipText("Registrar nuevo Cliente");
    }//GEN-LAST:event_itmNuevoUsuarioMouseEntered

    private void itmPagoConsumoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmPagoConsumoMouseEntered
        itmPagoConsumo.setToolTipText("Pago de agua potable");
    }//GEN-LAST:event_itmPagoConsumoMouseEntered

    private void miIngresoLectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miIngresoLectMouseEntered
        miIngresoLect.setToolTipText("Ingreso de lecturas");
    }//GEN-LAST:event_miIngresoLectMouseEntered

    private void MiUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiUsuariosMouseEntered
        MiUsuarios.setToolTipText("Reporte de Usuarios");
    }//GEN-LAST:event_MiUsuariosMouseEntered

    private void MiConsultaGeneralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiConsultaGeneralMouseEntered
        MiConsultaGeneral.setToolTipText("Reporte de cliente y Empleados");
    }//GEN-LAST:event_MiConsultaGeneralMouseEntered

    private void MiPlanillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiPlanillaMouseEntered
        MiPlanilla.setToolTipText("Planilla de pago de Agua potable");
    }//GEN-LAST:event_MiPlanillaMouseEntered

    private void PagoAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoAguaActionPerformed
        FrmConsumoPago consmo = new FrmConsumoPago();
        consmo.setVisible(true);

    }//GEN-LAST:event_PagoAguaActionPerformed

    private void conClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conClienteActionPerformed
        FrmReporteCliente rep = new FrmReporteCliente();
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_conClienteActionPerformed

    private void conEmpladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conEmpladoActionPerformed

    }//GEN-LAST:event_conEmpladoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void itmNuevoEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmNuevoEmpleadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_itmNuevoEmpleadoMouseEntered

    private void itmNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNuevoEmpleadoActionPerformed
        FrmRegistroEmpleados rep = new FrmRegistroEmpleados();
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmNuevoEmpleadoActionPerformed

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmMenuPrincipal().setVisible(true);
//
//            }
//        });
//    }
//
//oPago();
//        consmo.setVisible(true);
//        dispose();
//    }                                               
////
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmMenuPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu Consultas;
    public static javax.swing.JMenuItem MiConsultaGeneral;
    public static javax.swing.JMenuItem MiPlanilla;
    public static javax.swing.JMenuItem MiUsuarios;
    public static javax.swing.JMenuItem PagoAgua;
    private javax.swing.JMenuItem Salir;
    public static javax.swing.JMenuItem conCliente;
    public static javax.swing.JMenuItem conEmplado;
    private javax.swing.JMenu intemLecturas;
    private javax.swing.JMenu itemPagoConsumo;
    public static javax.swing.JMenuItem itmNuevoEmpleado;
    public static javax.swing.JMenuItem itmNuevoUsuario;
    public static javax.swing.JMenuItem itmPagoConsumo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbImagenes;
    public static javax.swing.JMenuItem miIngresoLect;
    private javax.swing.JMenuItem miSalir;
    private ventanas.PanelImage1 panelImage1;
    // End of variables declaration//GEN-END:variables
}
