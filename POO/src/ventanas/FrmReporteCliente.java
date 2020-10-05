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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReporteCliente = new javax.swing.JTable();
        Mostrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomPdf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cedula:");

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Reporte de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tbReporteCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha nacimiento", "Telefono", "N° medidor"
            }
        ));
        tbReporteCliente.setEnabled(false);
        jScrollPane1.setViewportView(tbReporteCliente);

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar datos.png"))); // NOI18N
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre de archivo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Creacion de PDF");

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar PDF.png"))); // NOI18N
        btnGenerar.setText("Generar pdf");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButton1.setText("Salir");

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(Mostrar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)
                                .addComponent(btnNuevo)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(35, 35, 35)
                                .addComponent(btnRegresar))
                            .addComponent(btnGenerar))))
                .addGap(0, 198, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbReporteCliente;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNomPdf;
    // End of variables declaration//GEN-END:variables
}
