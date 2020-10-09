package ventanas;

import Controlador.CtrlUsuarioCliente;
import Controlador.CtrlUsuarioEmpleado;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cliente;
import static ventanas.FrmCreacionUsuario.ListaCliente;

public class FrmReporteCliente extends javax.swing.JFrame {

    TableRowSorter buscara;

    DefaultTableModel modelo;
    CtrlUsuarioCliente ctrlcliente;

    public FrmReporteCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Cedula", "Nombre", "Apellido", "FechAa Nacimiento", "FechaCreacion", "Direccion", "Telefono", "Correo", "Num medidor"});
        tbReporteCliente.setModel(modelo);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReporteCliente = new javax.swing.JTable();
        Mostrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomPdf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        panelImage1 = new ventanas.PanelImage1();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 156, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioagg.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 110, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        tbReporteCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha nacimiento", "Telefono", "N° medidor"
            }
        ));
        tbReporteCliente.setEnabled(false);
        jScrollPane1.setViewportView(tbReporteCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 792, 210));

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar datos.png"))); // NOI18N
        Mostrar.setText("Visualizar Todos");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pbuscar.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre de archivo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));
        jPanel1.add(txtNomPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 209, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Creacion de PDF");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar PDF.png"))); // NOI18N
        btnGenerar.setText("Generar pdf");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btnRegresar.setText("Volver");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Reporte Cliente");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmMenuPrincipal frmMenuPrincipal = new FrmMenuPrincipal();
        frmMenuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        txtBuscar.setText("");
        MostrarCliente();
    }//GEN-LAST:event_MostrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // MostrarRepCliente();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Cedula", "Nombre", "Apellido", "FechAa Nacimiento", "FechaCreacion", "Direccion", "Telefono", "Correo", "Num medidor"});
        tbReporteCliente.setModel(modelo);
        txtBuscar.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ctrlcliente = new CtrlUsuarioCliente();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Cedula", "Nombre", "Apellido", "FechAa Nacimiento", "FechaCreacion", "Direccion", "Telefono", "Correo", "Num medidor"});
        if (txtBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el numero de cedula del cliente para buscar");
        } else {
            ctrlcliente.buscarCliente(txtBuscar.getText(), modelo);
            tbReporteCliente.setModel(modelo);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String ruta = txtNomPdf.getText();
        try {
            Document documento = new Document(PageSize.LETTER, 20, 20, 20, 20);

            FileOutputStream ficheroPDF = new FileOutputStream(ruta + ".pdf");
            PdfWriter.getInstance(documento, ficheroPDF);
            documento.open();

            Paragraph titulo = new Paragraph("Lista de Clientes \n\n",
                    FontFactory.getFont("arial", 22, Font.BOLD, BaseColor.BLUE));

            documento.add(titulo);

            PdfPTable tabla = new PdfPTable(8);

            tabla.addCell(new Paragraph("IDCLIENTE", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("CEDULA", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("NOMBRE", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("FECHA REGISTRO", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("DIRECCION", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("TELEFONO", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("CORREO", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("NUM MEDIDOR", FontFactory.getFont("Arial", 8)));

            for (int i = 0; i < tbReporteCliente.getRowCount(); i++) {
                if (i > 0) {
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 0).toString(), FontFactory.getFont("Arial", 8)));
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 1).toString(), FontFactory.getFont("Arial", 8)));
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 2).toString() + " " + tbReporteCliente.getValueAt(i, 3).toString(),
                            FontFactory.getFont("Arial", 8)));
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 5).toString(), FontFactory.getFont("Arial", 8)));
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 6).toString(), FontFactory.getFont("Arial", 8)));
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 7).toString(), FontFactory.getFont("Arial", 8)));
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 8).toString(), FontFactory.getFont("Arial", 8)));
                    tabla.addCell(new Paragraph(tbReporteCliente.getValueAt(i, 9).toString(), FontFactory.getFont("Arial", 8)));
                }

            }

            documento.add(tabla);

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente");
            try {
                File file = new File(ruta + ".pdf");
                Desktop.getDesktop().open(file);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error reporte pdf: " + e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en generar pdf: " + e);
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    public void MostrarCliente() {

        //**********************Metodo para mostrar los datos del cliente el la tabla*******************
        ctrlcliente = new CtrlUsuarioCliente();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Cedula", "Nombre", "Apellido", "FechAa Nacimiento", "FechaCreacion", "Direccion", "Telefono", "Correo", "Num medidor"});
        ctrlcliente.listarUsuarioCliente(modelo);
        tbReporteCliente.setModel(modelo);

    }

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmReporteCliente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private ventanas.PanelImage1 panelImage1;
    private javax.swing.JTable tbReporteCliente;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNomPdf;
    // End of variables declaration//GEN-END:variables
}
