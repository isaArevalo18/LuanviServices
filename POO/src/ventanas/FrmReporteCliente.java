package ventanas;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cliente;
import static ventanas.FrmCreacionUsuario.ListaCliente;

public class FrmReporteCliente extends javax.swing.JFrame {

    TableRowSorter buscara;

    DefaultTableModel modelo;

    public FrmReporteCliente() {
        initComponents();
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
        RepoteClientes = new javax.swing.JTable();
        Mostrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomPdf = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
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

        RepoteClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha nacimiento", "Telefono", "N° medidor"
            }
        ));
        RepoteClientes.setEnabled(false);
        jScrollPane1.setViewportView(RepoteClientes);

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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_buscar (1).png"))); // NOI18N
        jButton3.setText("Buscar ruta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)
                                .addComponent(btnNuevo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(Mostrar))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnGenerar)
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
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNomPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnGenerar)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        //**********************Si el ArryList es diferente a vacio nos muestra los datos caso contrario manda un mensaje***************
        if (!FrmCreacionUsuario.ListaCliente.isEmpty()) {

            MostrarRepCliente();

        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos los cuales mostrar");
        }

    }//GEN-LAST:event_MostrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        MostrarRepCliente();
        txtBuscar.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (!FrmCreacionUsuario.ListaCliente.isEmpty()) {
            if (txtBuscar.getText().length() > 0) {
                for (Cliente c : FrmCreacionUsuario.ListaCliente) {
                    if (c.getCedula().equals(txtBuscar.getText())) {
                        JOptionPane.showMessageDialog(null, "Cedula encontrada!");
                        String mostrar[][] = new String[1][8];
                        mostrar[0][0] = c.getCedula();
                        mostrar[0][1] = c.getNombre();
                        mostrar[0][2] = c.getApellido();
                        mostrar[0][3] = c.getDireccion();
                        mostrar[0][4] = c.getCorreo();
                        mostrar[0][5] = c.getFechaNacimiento();
                        mostrar[0][6] = c.getTelefono();
                        mostrar[0][7] = c.getNum_medidor();
                        
                        RepoteClientes.setModel(new javax.swing.table.DefaultTableModel(
                                mostrar,
                                new String[]{
                                    "Cédula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha Nac", "Telefono", "Lec Acual", "Lec Anterior"
                                }
                        ));
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "cedula no encontrada!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Ingrese el numero de cedula");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser dgl = new JFileChooser();
        int option = dgl.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File f = dgl.getSelectedFile();
            txtNomPdf.setText(f.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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

            tabla.addCell(new Paragraph("NUMERO", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("CEDULA", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("NOMBRE", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("APELLIDO", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("DIRECCION", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("CORREO", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("TELEFONO", FontFactory.getFont("Arial", 8)));
            tabla.addCell(new Paragraph("NUM MEDIDOR", FontFactory.getFont("Arial", 8)));

            for (int i = 0; i < ListaCliente.size(); i++) {
                tabla.addCell(" " + i);
                tabla.addCell(new Paragraph(ListaCliente.get(i).getCedula(), FontFactory.getFont("Arial", 8)));
                tabla.addCell(new Paragraph(ListaCliente.get(i).getNombre(), FontFactory.getFont("Arial", 8)));
                tabla.addCell(new Paragraph(ListaCliente.get(i).getApellido(), FontFactory.getFont("Arial", 8)));
                tabla.addCell(new Paragraph(ListaCliente.get(i).getDireccion(), FontFactory.getFont("Arial", 8)));
                tabla.addCell(new Paragraph(ListaCliente.get(i).getCorreo(), FontFactory.getFont("Arial", 8)));
                tabla.addCell(new Paragraph(ListaCliente.get(i).getTelefono(), FontFactory.getFont("Arial", 8)));
                tabla.addCell(new Paragraph(ListaCliente.get(i).getNum_medidor(), FontFactory.getFont("Arial", 8)));

            }
            documento.add(tabla);

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente");
            try {
                File file = new File(ruta + ".pdf");
                Desktop.getDesktop().open(file);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }//GEN-LAST:event_btnGenerarActionPerformed
    public void MostrarRepCliente() {

        String[][] lista = new String[ListaCliente.size()][8];
        for (int i = 0; i < ListaCliente.size(); i++) {
            lista[i][0] = ListaCliente.get(i).getCedula();
            lista[i][1] = ListaCliente.get(i).getNombre();
            lista[i][2] = ListaCliente.get(i).getApellido();
            lista[i][3] = ListaCliente.get(i).getDireccion();
            lista[i][4] = ListaCliente.get(i).getCorreo();
            lista[i][5] = ListaCliente.get(i).getFechaNacimiento();
            lista[i][6] = ListaCliente.get(i).getTelefono();
            lista[i][7] = ListaCliente.get(i).getNum_medidor();
            

        }
        RepoteClientes.setModel(new javax.swing.table.DefaultTableModel(
                lista,
                new String[]{
                    "Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha nacimiento", "Teléfono", "Num medidor"
                }
        ));
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
    private javax.swing.JTable RepoteClientes;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNomPdf;
    // End of variables declaration//GEN-END:variables
}
