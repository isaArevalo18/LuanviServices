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
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        setVisible(true);

        cambiar();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        itmNuevoUsuario = new javax.swing.JButton();
        itmNuevoEmpleado = new javax.swing.JButton();
        itmPagoConsumo = new javax.swing.JButton();
        miIngresoLect = new javax.swing.JButton();
        MiUsuarios = new javax.swing.JButton();
        MiConsultaGeneral = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        intemLecturas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        miSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelImage1 = new ventanas.PanelImage();
        lbImagenes = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        itmNuevoUsuario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        itmNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessman_add.png"))); // NOI18N
        itmNuevoUsuario.setText("Nuevo Cliente");
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

        itmNuevoEmpleado.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        itmNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessman_add.png"))); // NOI18N
        itmNuevoEmpleado.setText("Nuevo Empleado");
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

        itmPagoConsumo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        itmPagoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pago.png"))); // NOI18N
        itmPagoConsumo.setText("Pago Consumo");
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

        miIngresoLect.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        miIngresoLect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingreso de lecturas.png"))); // NOI18N
        miIngresoLect.setText("Ingreso Lecturas");
        miIngresoLect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miIngresoLectMouseEntered(evt);
            }
        });
        miIngresoLect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIngresoLectActionPerformed(evt);
            }
        });

        MiUsuarios.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        MiUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cosulta Usuario.png"))); // NOI18N
        MiUsuarios.setText("Usuarios");
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

        MiConsultaGeneral.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        MiConsultaGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta general.png"))); // NOI18N
        MiConsultaGeneral.setText("Consulta Planillas");
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

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jLabel2.setText("USUARIO");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        jLabel3.setText("PAGO");

        intemLecturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/talento humano.png"))); // NOI18N
        intemLecturas.setText("LECTURAS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        jLabel5.setText("CONSULTAS");

        miSalir.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        miSalir.setText("Salir");
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(itmPagoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(intemLecturas)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(miIngresoLect, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(MiConsultaGeneral)
                        .addGap(48, 48, 48))))
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(itmNuevoEmpleado)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(itmNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(MiUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(miSalir)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itmNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itmNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itmPagoConsumo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intemLecturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miIngresoLect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiConsultaGeneral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(miSalir)
                .addGap(206, 206, 206))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 570));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setText("MENU");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 140, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        lbImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agua1.png"))); // NOI18N
        lbImagenes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(lbImagenes)
                .addGap(23, 23, 23))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagenes)
                .addContainerGap(403, Short.MAX_VALUE))
        );

        jPanel2.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 620, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PagoAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoAguaActionPerformed
        FrmConsumoPago consmo = new FrmConsumoPago();
        consmo.setVisible(true);
        this.dispose();
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

    private void itmNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNuevoUsuarioActionPerformed
        FrmCreacionUsuario usu = new FrmCreacionUsuario();
        usu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmNuevoUsuarioActionPerformed

    private void itmPagoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPagoConsumoActionPerformed
        FrmConsumoPago consmo = new FrmConsumoPago();
        consmo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmPagoConsumoActionPerformed

    private void miIngresoLectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIngresoLectActionPerformed
        FrmIngresoLectura v = new FrmIngresoLectura();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miIngresoLectActionPerformed

    private void MiUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiUsuariosActionPerformed
        FrmReporteCliente rep = new FrmReporteCliente();
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MiUsuariosActionPerformed

    private void MiConsultaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiConsultaGeneralActionPerformed
        FrmConsultasFactura consultasFactura = new FrmConsultasFactura();
        consultasFactura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MiConsultaGeneralActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void itmNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNuevoEmpleadoActionPerformed
        FrmRegistroEmpleados rep = new FrmRegistroEmpleados();
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmNuevoEmpleadoActionPerformed

    private void miSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSalirMouseEntered
        miSalir.setToolTipText("Salir del progama");
    }//GEN-LAST:event_miSalirMouseEntered

    private void itmNuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmNuevoUsuarioMouseEntered
        itmNuevoUsuario.setToolTipText("Registrar nuevo Cliente");
    }//GEN-LAST:event_itmNuevoUsuarioMouseEntered

    private void itmNuevoEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmNuevoEmpleadoMouseEntered
        itmNuevoUsuario.setToolTipText("Registrar nuevo Empleado");
    }//GEN-LAST:event_itmNuevoEmpleadoMouseEntered

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu Consultas;
    private javax.swing.JButton MiConsultaGeneral;
    private javax.swing.JButton MiUsuarios;
    public static javax.swing.JMenuItem PagoAgua;
    private javax.swing.JMenuItem Salir;
    public static javax.swing.JMenuItem conCliente;
    public static javax.swing.JMenuItem conEmplado;
    private javax.swing.JLabel intemLecturas;
    private javax.swing.JButton itmNuevoEmpleado;
    private javax.swing.JButton itmNuevoUsuario;
    private javax.swing.JButton itmPagoConsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbImagenes;
    private javax.swing.JButton miIngresoLect;
    private javax.swing.JButton miSalir;
    private ventanas.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
