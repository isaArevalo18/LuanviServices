package ventanas;

import clases.CalcularPrecio;
import clases.validaciones;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Usuario;
import clases.TextPrompt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Lecturas;
import static modelo.Lecturas.listaLectura;

public class FrmCreacionUsuario extends javax.swing.JFrame {

    public static ArrayList<Cliente> ListaCliente = new ArrayList<>();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");

    validaciones vali = new validaciones();

    DateFormat df = DateFormat.getDateInstance();

    String cedula;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String correo;
    String fecha_nac;
    String lec_actual;
    String lec_anterior;
    String num_medidor;
    String fecha;

    public FrmCreacionUsuario() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        holders();


        MostrarCliente();

        bloquear();
        bloquearTerminareditar();
        //****************Validamos los txt Para el ingreso de solo numeros o letras****************
        btnGuardar.setEnabled(false);
        vali.ValidarNumeros(txtCedula);
        vali.LimitarCaracteres(txtCedula, 10);
        vali.ValidarLetras(txtNombre);
        vali.ValidarLetras(txtApellido);
        vali.ValidarLetras(txtDireccion);
        //vali.ValidarLetras(txtCorreo);
        vali.ValidarNumeros(txtTelefono);
        vali.LimitarCaracteres(txtTelefono, 7);
        vali.ValidarNumeros(txtNumMedidor);
        vali.LimitarCaracteres(txtNumMedidor, 7);
        vali.ValidarNumeros(txtLec_Actual);
        vali.LimitarCaracteres(txtLec_Actual, 5);
        vali.ValidarNumeros(txtLect_Anterior);
        vali.LimitarCaracteres(txtLect_Anterior, 5);
        ///********************************
        setLocationRelativeTo(null);
        tabClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int o = tabClientes.getSelectedRow();
                cedula = tabClientes.getValueAt(o, 0).toString();
                nombre = tabClientes.getValueAt(o, 1).toString();
                apellido = tabClientes.getValueAt(o, 2).toString();
                direccion = tabClientes.getValueAt(o, 3).toString();
                correo = tabClientes.getValueAt(o, 4).toString();
                fecha_nac = tabClientes.getValueAt(o, 5).toString();
                telefono = tabClientes.getValueAt(o, 6).toString();
                num_medidor = tabClientes.getValueAt(o, 7).toString();

                tabClientesMouseClicked(evt);
            }
        });

    }

    public void holders() {
        TextPrompt prueba = new TextPrompt("Obligatorio", txtCedula);
        TextPrompt prueba1 = new TextPrompt("Obligatorio", txtNombre);
        TextPrompt prueba2 = new TextPrompt("Obligatorio", txtApellido);
        TextPrompt prueba3 = new TextPrompt("Obligatorio", txtCorreo);
        TextPrompt prueba4 = new TextPrompt("Obligatorio", txtDireccion);
        TextPrompt prueba5 = new TextPrompt("Obligatorio", txtLec_Actual);
        TextPrompt prueba6 = new TextPrompt("Obligatorio", txtLect_Anterior);
        TextPrompt prueba7 = new TextPrompt("Obligatorio", txtNumMedidor);
        TextPrompt prueba8 = new TextPrompt("Obligatorio", txtTelefono);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNumMedidor = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnTerminarEdicion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtLec_Actual = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        lbID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        panelImage1 = new ventanas.PanelImage1();
        jLabel1 = new javax.swing.JLabel();
        cFecha = new com.toedter.calendar.JDateChooser();
        cFechaCreacion = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtLect_Anterior = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Direccion:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Correo:");

        txtCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCedulaMouseEntered(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Numero Medidor:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Apellido:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Telefono:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de Nacimiento:");

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

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/businessman_add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setIconTextGap(3);
        btnNuevo.setVerifyInputWhenFocusTarget(false);
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoMouseEntered(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarr (1).png"))); // NOI18N
        btnGuardar.setText("Guardar Usuario");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ico_eliminar (1).gif"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/generar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnTerminarEdicion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTerminarEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        btnTerminarEdicion.setText("Terminar Edicion");
        btnTerminarEdicion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTerminarEdicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTerminarEdicionMouseEntered(evt);
            }
        });
        btnTerminarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarEdicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTerminarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTerminarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Lectura Actual:");

        txtLec_Actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLec_ActualKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Lectura Anterior:");

        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha nacimiento", "Teléfono", "Num medidor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabClientes);

        lbID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbID.setForeground(new java.awt.Color(204, 204, 255));
        lbID.setText("id");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jButton2.setText("Regresar al Menu");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Crear Nuevo Usuario");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cFechaKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Fecha de creacion de Usuario: ");

        txtLect_Anterior.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(368, 368, 368)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDireccion))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCorreo))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbID)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCedula)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))))))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNumMedidor, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(txtApellido)
                                        .addComponent(txtTelefono)
                                        .addComponent(cFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 15, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtLect_Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel11)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtLec_Actual, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbID)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtNumMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(txtLec_Actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(txtLect_Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumMedidorActionPerformed

    }//GEN-LAST:event_txtNumMedidorActionPerformed

    private void tabClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClientesMouseClicked
        int s = tabClientes.getSelectedRow();
        cedula = tabClientes.getValueAt(s, 0).toString();
        nombre = tabClientes.getValueAt(s, 1).toString();
        apellido = tabClientes.getValueAt(s, 2).toString();
        direccion = tabClientes.getValueAt(s, 3).toString();
        correo = tabClientes.getValueAt(s, 4).toString();
        fecha_nac = tabClientes.getValueAt(s, 5).toString();
        telefono = tabClientes.getValueAt(s, 6).toString();
        num_medidor = tabClientes.getValueAt(s, 7).toString();
//        lec_actual = tabClientes.getValueAt(s, 8).toString();
//        lec_anterior = tabClientes.getValueAt(s, 9).toString();


    }//GEN-LAST:event_tabClientesMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Cliente clie = new Cliente();
        CalcularPrecio calculo = new CalcularPrecio();
        Lecturas lect = new Lecturas();
        boolean correcto = true;
        boolean registrar = true;
        boolean cedCorr = true;
        correcto = false;

        boolean registrar1 = validaciones.validarCedula(txtCedula.getText());//validacion de cedula
        if (registrar1 == false) {
            registrar = false;
            txtCedula.setText("");
        }
        //**********************************************************************
        if (txtNombre.getText().isEmpty()) {
            registrar = false;
        } else {
            String NOMBRE = txtNombre.getText();
            if (correcto != NOMBRE.matches("^[ a-zA-Z]")) { //validar nombre
                registrar = false;
                txtNombre.setText("");
            }
        }
        //**********************************************************************

        String APELLIDO = txtApellido.getText();
        if (correcto != APELLIDO.matches("[ a-zA-Z]")) { //validar Apellido
            registrar = false;
            txtApellido.setText("");
        }
        String DIRECCION = txtDireccion.getText();
        if (correcto != DIRECCION.matches("[ a-zA-Z]")) { //validar Direccion
            registrar = false;
            txtApellido.setText("");
        }

        double TELEFONO = Double.parseDouble(txtTelefono.getText()); //validar telefono
        if (TELEFONO < 1 || TELEFONO > 565616142) {
            registrar = false;
            txtTelefono.setText("");
        }

        boolean registrar2 = validaciones.validarCorreo(txtCorreo.getText());//validacion de correo
        if (registrar2 == false) {
            registrar = false;
            txtCorreo.setText("");
        }

        int LECT_ACTUAL = Integer.parseInt(txtLec_Actual.getText()); //validar LECT_ACTUAL
        if (LECT_ACTUAL < 0 || LECT_ACTUAL > 100000000) {
            registrar = false;
            txtLec_Actual.setText("");
        }
        int LECT_ANTERIOR = Integer.parseInt(txtLect_Anterior.getText());// validar LECT_ANTERIOR
        if (LECT_ACTUAL < 0 || LECT_ACTUAL > 100000000) {
            registrar = false;
            txtLec_Actual.setText("");
        }
        if (txtNumMedidor.getText().isEmpty()) {
            registrar = false;
        } else {
            int NUM_MEDIDOR = Integer.parseInt(txtNumMedidor.getText());// validar LECT_ANTERIOR
            if (NUM_MEDIDOR < 1 || NUM_MEDIDOR > 1000000000) {
                registrar = false;
                txtNumMedidor.setText("");
            }
        }

        for (int i = 0; i < ListaCliente.size(); i++) {
            if (ListaCliente.get(i).getNum_medidor().equals(txtNumMedidor.getText())) {
                registrar = false;
                txtNumMedidor.setText("");
                JOptionPane.showMessageDialog(null, "!!Numero de medidor Existente");
            }
        }

        if (cFecha.getDate() == null) {
            registrar = false;
        }
        if (cFechaCreacion.getDate() == null) {
            registrar = false;
        }

        if (registrar == true) {
            int ax = JOptionPane.showConfirmDialog(null, "Desea guardar el cliente?");
            if (ax == JOptionPane.YES_OPTION) {
                clie.setCedula(txtCedula.getText());
                clie.setNombre(txtNombre.getText());
                clie.setApellido(txtApellido.getText());
                clie.setDireccion(txtDireccion.getText());
                clie.setTelefono(txtTelefono.getText());
                clie.setCorreo(txtCorreo.getText());
                //*****Guardamos los datos en la listaLecturas********
                lect.setLecturaAct(txtLec_Actual.getText());
//                lect.setLecturaAnter(txtLect_Anterior.getText());
                lect.setNumMedidor(txtNumMedidor.getText());
                //************Comvertir la fecha en simple***************
                String fechaLectura = formato.format(cFechaCreacion.getDate());
                lect.setFecha_lecturaAct(fechaLectura);
                lect.setFecha_lecturaAnter(fechaLectura);
                calculo.calcularM3(txtLec_Actual.getText(), txtLect_Anterior.getText());
                lect.setConsumo(calculo.getConsumo());
                //*****Guardamos los datos en la listaClientes********
                String fecha = formato.format(cFecha.getDate());
                clie.setFechaNacimiento(fecha);
                clie.setNum_medidor(txtNumMedidor.getText());
//                clie.setCategoria(cbCategoria.getSelectedItem().toString());

                listaLectura.add(lect);
                ListaCliente.add(clie);

                JOptionPane.showMessageDialog(null, "Cliente guardado correctamente");
                limpiar();
                btnGuardar.setEnabled(false);

            } else if (ax == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Cliente no guardado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Algun dato fue incorrecto vuelva a ingresar ");
        }
        MostrarCliente();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        desbloquear();
        bloquearTerminareditar();
        txtLec_Actual.setEnabled(true);
//        txtLect_Anterior.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setVisible(true);
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtNumMedidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumMedidorKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtNumMedidorKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtLec_ActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLec_ActualKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtLec_ActualKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //*****************Elimina de la lista del compo seleccionado en la tabla*******************
        for (int i = 0; i < ListaCliente.size(); i++) {
            if (nombre == ListaCliente.get(i).getNombre()) {
                ListaCliente.remove(i);
            }
        }
        MostrarCliente();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        desbloquear();
        btnGuardar.setEnabled(false);
        //******************Trae los datos de ta tabla a los txt*******************
        txtCedula.setEnabled(false);
        desbloquearTerminareditar();
        lbID.setText(cedula);
        txtCedula.setText(cedula);
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtDireccion.setText(direccion);
        txtCorreo.setText(correo);
        txtTelefono.setText(telefono);
        txtNumMedidor.setText(num_medidor);
        txtLec_Actual.setEnabled(false);
        txtLect_Anterior.setEnabled(false);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnTerminarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarEdicionActionPerformed
        txtLec_Actual.setEnabled(false);
//        txtLect_Anterior.setEnabled(false);

        boolean correcto = true;
        boolean registrar = true;
        boolean cedCorr = true;
        correcto = false;

        if (txtNombre.getText().isEmpty()) {
            registrar = false;
        } else {
            String NOMBRE = txtNombre.getText();
            if (correcto != NOMBRE.matches("^[ a-zA-Z]")) { //validar nombre
                registrar = false;
                txtNombre.setText("");
            }
        }
        //**********************************************************************
        if (txtApellido.getText().isEmpty()) {
            registrar = false;
        } else {
            String APELLIDO = txtApellido.getText();
            if (correcto != APELLIDO.matches("[ a-zA-Z]")) { //validar Apellido
                registrar = false;
                txtApellido.setText("");
            }
        }

        //**********************************************************************
        if (txtDireccion.getText().isEmpty()) {
            registrar = false;
        } else {
            String DIRECCION = txtDireccion.getText();
            if (correcto != DIRECCION.matches("[ a-zA-Z]")) { //validar Direccion
                registrar = false;
                txtApellido.setText("");
            }
        }

        //**********************************************************************
        if (txtTelefono.getText().isEmpty()) {
            registrar = false;
        } else {
            double TELEFONO = Double.parseDouble(txtTelefono.getText()); //validar telefono
            if (TELEFONO < 1 || TELEFONO > 565616142) {
                registrar = false;
                txtTelefono.setText("");
            }
        }
        //**********************************************************************

        boolean registrar2 = validaciones.validarCorreo(txtCorreo.getText());//validacion de correo
        if (registrar2 == false) {
            registrar = false;
            txtCorreo.setText("");
        }
        if (cFecha.getDate() == null) {
            registrar = false;
        }

        if (registrar == true) {
            int ax = JOptionPane.showConfirmDialog(null, "Desea guardar los cambios?");
            if (ax == JOptionPane.YES_OPTION) {
                for (int i = 0; i < ListaCliente.size(); i++) {
                    //****************Compara si el lb es igual que el de la lista para editarlo**********
                    if (lbID.getText() == ListaCliente.get(i).getCedula()) {

                        ListaCliente.get(i).setNombre(txtNombre.getText());
                        ListaCliente.get(i).setApellido(txtApellido.getText());
                        ListaCliente.get(i).setDireccion(txtDireccion.getText());
                        ListaCliente.get(i).setCorreo(txtCorreo.getText());
                        String fechaEdit = formato.format(cFecha.getDate());
                        ListaCliente.get(i).setFechaNacimiento(fechaEdit);
                        ListaCliente.get(i).setTelefono(txtTelefono.getText());
                        ListaCliente.get(i).setNum_medidor(txtNumMedidor.getText());
//                        ListaCliente.get(i).setCategoria(cbCategoria.getSelectedItem().toString());

                    }
                }
                limpiar();
                MostrarCliente();

                JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
                limpiar();
                btnGuardar.setEnabled(false);

            } else if (ax == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Cambios no guardado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Algun dato fue incorrecto vuelva a ingresar ");
        }
//        MostrarCliente();


    }//GEN-LAST:event_btnTerminarEdicionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmMenuPrincipal men = new FrmMenuPrincipal();
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMouseEntered

    }//GEN-LAST:event_txtCedulaMouseEntered

    private void btnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseEntered
        btnNuevo.setToolTipText("Registrar un nuevo Cliente");
    }//GEN-LAST:event_btnNuevoMouseEntered

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setToolTipText("Guardar nuevo Cliente");
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setToolTipText("Eliminar al cliente seleccionado");
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setToolTipText("Editar al cliente seleccionado");
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnTerminarEdicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarEdicionMouseEntered
        btnTerminarEdicion.setToolTipText("Terminar la edicion del cliente");
    }//GEN-LAST:event_btnTerminarEdicionMouseEntered

    private void cFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_cFechaKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        vali.soloLentrasEspacios(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    public void bloquear() {
        //*********************Bloque todos los campos************************* 
        txtCedula.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtNumMedidor.setEnabled(false);
        txtLec_Actual.setEnabled(false);
        txtLect_Anterior.setEnabled(false);

        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }

    public void desbloquear() {
        //*********************Desbloquea Los campos del JFrame****************
        txtCedula.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtNumMedidor.setEnabled(true);
        txtLec_Actual.setEnabled(true);
        txtLect_Anterior.setEnabled(true);

    }

    public void bloquearTerminareditar() {
        //*********************Boquea el boton Terminar Edicion****************
        btnTerminarEdicion.setEnabled(false);
    }

    public void desbloquearTerminareditar() {
        //*********************Desbloquea el boton Terminar Edicion****************
        btnTerminarEdicion.setEnabled(true);
    }

    public void habilitarBGuardar() {
        //*******************Habilita el boton Guardar si todos los campos estan llenos*********************
        if (!txtCedula.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty()
                && !txtDireccion.getText().isEmpty() && !txtTelefono.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !txtLec_Actual.getText().isEmpty() && !txtLect_Anterior.getText().isEmpty() && !txtNumMedidor.getText().isEmpty()) {

            btnGuardar.setEnabled(true);

        } else {
            btnGuardar.setEnabled(false);
        }
    }

    public void limpiar() {
        //********************Limpia los JtextField*****************************
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        cFecha.setDate(null);
        cFechaCreacion.setDate(null);
        txtLec_Actual.setText("");
        txtLect_Anterior.setText("");
        txtNumMedidor.setText("");
    }

    public void MostrarCliente() {
        //**********************Metodo para mostrar los datos del cliente el la tabla*******************
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
//            lista[i][8] = ListaCliente.get(i).getCategoria();

        }
        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
                lista,
                new String[]{
                    "Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha nacimiento", "Teléfono", "Num medidor"
                }
        ));
    }
//!txtLect_Anterior.getText().isEmpty() &&
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmCreacionUsuario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnTerminarEdicion;
    private com.toedter.calendar.JDateChooser cFecha;
    private com.toedter.calendar.JDateChooser cFechaCreacion;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbID;
    private ventanas.PanelImage1 panelImage1;
    private javax.swing.JTable tabClientes;
    private javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLec_Actual;
    private javax.swing.JTextField txtLect_Anterior;
    public javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumMedidor;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
