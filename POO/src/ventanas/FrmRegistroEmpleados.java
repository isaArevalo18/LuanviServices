package ventanas;

import Controlador.CtrlUsuarioCliente;
import Controlador.CtrlUsuarioEmpleado;
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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import modelo.Empleado;
import modelo.Lecturas;

public class FrmRegistroEmpleados extends javax.swing.JFrame {

    validaciones vali = new validaciones();
    SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
    DateFormat df = DateFormat.getDateInstance();
    CtrlUsuarioEmpleado ctrlUsuarioEmpleado;

    int idEmpleado;
    String cedula;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String correo;
    String fecha_nac;
    String fecha_reg;
    String cargo;
    String usuario;
    String contraseña;

    public FrmRegistroEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/AguaIcono.png")).getImage());
        obtenerFechaActual();
        bloquear();
        MostrarEmpleado();
        btnGuardarEmpleado.setEnabled(false);
        btnTerminarEdicion.setEnabled(false);
        btnEliminarEmpleado.setEnabled(false);
        txt_idempleado.setVisible(false);
        lbl_id.setVisible(false);
        //Validacion de los campos
        vali.ValidarNumeros(txtCedulaEmpleado);
        vali.LimitarCaracteres(txtCedulaEmpleado, 10);
        vali.ValidarLetras(txtNombreEmpleado);
        vali.ValidarLetras(txtApellidoEmpleado);
        vali.ValidarLetras(txtDireccionEmpleado);
        vali.ValidarNumeros(txtTelefonoEmpleado);
        vali.LimitarCaracteres(txtTelefonoEmpleado, 7);
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
        txtCedulaEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtDireccionEmpleado = new javax.swing.JTextField();
        txtCorreoEmpleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnGuardarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        btnTerminarEdicion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEmpleados = new javax.swing.JTable();
        lbl_id = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        panelImage1 = new ventanas.PanelImage1();
        jLabel1 = new javax.swing.JLabel();
        cFechaEmpleado = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jcbCargo = new javax.swing.JComboBox<>();
        txt_nombre_usuario = new javax.swing.JTextField();
        txt_clave = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        lbl_clave1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_fechacreacion_usuario = new javax.swing.JTextField();
        txt_idempleado = new javax.swing.JTextField();

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

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Direccion:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Correo:");

        txtCedulaEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCedulaEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaEmpleadoKeyReleased(evt);
            }
        });

        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyReleased(evt);
            }
        });

        txtDireccionEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionEmpleadoKeyReleased(evt);
            }
        });

        txtCorreoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoEmpleadoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Apellido:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Telefono:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de Nacimiento:");

        txtApellidoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoEmpleadoKeyReleased(evt);
            }
        });

        txtTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadoKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(124, 186, 247));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioagg.png"))); // NOI18N
        btnNuevoEmpleado.setText("Nuevo");
        btnNuevoEmpleado.setBorder(null);
        btnNuevoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoEmpleado.setIconTextGap(3);
        btnNuevoEmpleado.setVerifyInputWhenFocusTarget(false);
        btnNuevoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoEmpleadoMouseEntered(evt);
            }
        });
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        btnGuardarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariosave.png"))); // NOI18N
        btnGuardarEmpleado.setText("Guardar Empleado");
        btnGuardarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarEmpleadoMouseEntered(evt);
            }
        });
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariodelete.png"))); // NOI18N
        btnEliminarEmpleado.setText("Eliminar");
        btnEliminarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarEmpleadoMouseEntered(evt);
            }
        });
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        btnEditarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioeditar.png"))); // NOI18N
        btnEditarEmpleado.setText("Editar");
        btnEditarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarEmpleadoMouseEntered(evt);
            }
        });
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });

        btnTerminarEdicion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTerminarEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariocheck.png"))); // NOI18N
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
                    .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTerminarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTerminarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Fecha nacimiento", "Teléfono", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabEmpleados);

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_id.setText("id");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Crear Nuevo Empleado");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cFechaEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cFechaEmpleadoKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cargo:");

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Presidente", "Tesorero" }));
        jcbCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbCargoKeyReleased(evt);
            }
        });

        txt_nombre_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombre_usuarioKeyReleased(evt);
            }
        });

        txt_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_claveKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nombre de Usuario:");

        lbl_clave1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_clave1.setText("Clave:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Fecha de creacion de Usuario: ");

        txt_fechacreacion_usuario.setEnabled(false);

        txt_idempleado.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(lbl_clave1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_id)
                                                .addComponent(jLabel2)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cFechaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 28, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fechacreacion_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(txt_idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cFechaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_clave1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_fechacreacion_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabEmpleadosMouseClicked
        int fila = tabEmpleados.getSelectedRow();
        btnEliminarEmpleado.setEnabled(true);
        idEmpleado = Integer.parseInt(tabEmpleados.getValueAt(fila, 0).toString());
        cedula = tabEmpleados.getValueAt(fila, 1).toString();
        nombre = tabEmpleados.getValueAt(fila, 2).toString();
        apellido = tabEmpleados.getValueAt(fila, 3).toString();
        fecha_nac = tabEmpleados.getValueAt(fila, 4).toString();
        fecha_reg = tabEmpleados.getValueAt(fila, 5).toString();
        direccion = tabEmpleados.getValueAt(fila, 6).toString();
        telefono = tabEmpleados.getValueAt(fila, 7).toString();
        correo = tabEmpleados.getValueAt(fila, 8).toString();
        cargo = tabEmpleados.getValueAt(fila, 9).toString();
        usuario = tabEmpleados.getValueAt(fila, 10).toString();
        contraseña = tabEmpleados.getValueAt(fila, 11).toString();
    }//GEN-LAST:event_tabEmpleadosMouseClicked

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        if (!txtCedulaEmpleado.equals("") && !txtNombreEmpleado.equals("") && !txtApellidoEmpleado.equals("")
                && cFechaEmpleado.getDate() != null && !txt_fechacreacion_usuario.equals("") && !txtDireccionEmpleado.equals("")
                && !txtTelefonoEmpleado.equals("") && !txtCorreoEmpleado.equals("") && !jcbCargo.getSelectedItem().toString().equals("Seleccione")
                && !txt_nombre_usuario.equals("") && !txt_clave.equals("")) {
            ctrlUsuarioEmpleado = new CtrlUsuarioEmpleado();
            Empleado empleado = new Empleado();
            empleado.setCedula(txtCedulaEmpleado.getText());
            empleado.setNombre(txtNombreEmpleado.getText());
            empleado.setApellido(txtApellidoEmpleado.getText());
            String fecha = formato.format(cFechaEmpleado.getDate());
            empleado.setFechaNacimiento(fecha);
            empleado.setFechaCreacion(txt_fechacreacion_usuario.getText());
            empleado.setDireccion(txtDireccionEmpleado.getText());
            empleado.setTelefono(txtTelefonoEmpleado.getText());
            empleado.setCorreo(txtCorreoEmpleado.getText());
            empleado.setCargo(jcbCargo.getSelectedItem().toString());
            empleado.setUsuario(txt_nombre_usuario.getText());
            empleado.setClave(txt_clave.getText());
            ctrlUsuarioEmpleado.guardarUsuarioEmpleado(empleado);
            MostrarEmpleado();
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos.");
        }
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void txtCedulaEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEmpleadoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtCedulaEmpleadoKeyReleased

    private void txtNombreEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtNombreEmpleadoKeyReleased

    private void txtApellidoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEmpleadoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtApellidoEmpleadoKeyReleased

    private void txtDireccionEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionEmpleadoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtDireccionEmpleadoKeyReleased

    private void txtTelefonoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtTelefonoEmpleadoKeyReleased

    private void txtCorreoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEmpleadoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txtCorreoEmpleadoKeyReleased

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        //*****************Elimina de la lista del compo seleccionado en la tabla*******************
        if (tabEmpleados.getSelectedRow() != -1) {
            idEmpleado = Integer.parseInt(tabEmpleados.getValueAt(tabEmpleados.getSelectedRow(), 0).toString());
            ctrlUsuarioEmpleado = new CtrlUsuarioEmpleado();
            ctrlUsuarioEmpleado.eliminarUsuarioEmpleado(idEmpleado);
            MostrarEmpleado();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla para Eliminar");
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        if (ObtenerRegistro()) {
            btnTerminarEdicion.setEnabled(true);
            btnEliminarEmpleado.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void btnTerminarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarEdicionActionPerformed
        ctrlUsuarioEmpleado = new CtrlUsuarioEmpleado();
        boolean correcto = true;
        boolean registrar = true;
        correcto = false;

        if (txtNombreEmpleado.getText().isEmpty()) {
            registrar = false;
        } else {
            String NOMBRE = txtNombreEmpleado.getText();
            if (correcto != NOMBRE.matches("^[ a-zA-Z]")) { //validar nombre
                registrar = false;
                txtNombreEmpleado.setText("");
            }
        }
        //**********************************************************************
        if (txtApellidoEmpleado.getText().isEmpty()) {
            registrar = false;
        } else {
            String APELLIDO = txtApellidoEmpleado.getText();
            if (correcto != APELLIDO.matches("[ a-zA-Z]")) { //validar Apellido
                registrar = false;
                txtApellidoEmpleado.setText("");
            }
        }
        //**********************************************************************
        if (txtDireccionEmpleado.getText().isEmpty()) {
            registrar = false;
        } else {
            String DIRECCION = txtDireccionEmpleado.getText();
            if (correcto != DIRECCION.matches("[ a-zA-Z]")) { //validar Direccion
                registrar = false;
                txtApellidoEmpleado.setText("");
            }
        }
        //**********************************************************************
        if (txtTelefonoEmpleado.getText().isEmpty()) {
            registrar = false;
        } else {
            double TELEFONO = Double.parseDouble(txtTelefonoEmpleado.getText()); //validar telefono
            if (TELEFONO < 1 || TELEFONO > 565616142) {
                registrar = false;
                txtTelefonoEmpleado.setText("");
            }
        }
        //**********************************************************************
        boolean registrar2 = validaciones.validarCorreo(txtCorreoEmpleado.getText());//validacion de correo
        if (registrar2 == false) {
            registrar = false;
            txtCorreoEmpleado.setText("");
        }
        if (cFechaEmpleado.getDate() == null) {
            registrar = false;
        }

        if (registrar == true) {
            int ax = JOptionPane.showConfirmDialog(null, "Desea guardar los cambios?");
            if (ax == JOptionPane.YES_OPTION) {
                Empleado empleado = new Empleado();
                empleado.setIdusuario(Integer.parseInt(txt_idempleado.getText()));
                empleado.setCedula(txtCedulaEmpleado.getText());
                empleado.setNombre(txtNombreEmpleado.getText());
                empleado.setApellido(txtApellidoEmpleado.getText());
                String fecha = formato.format(cFechaEmpleado.getDate());
                empleado.setFechaNacimiento(fecha);
                empleado.setFechaCreacion(txt_fechacreacion_usuario.getText());
                empleado.setDireccion(txtDireccionEmpleado.getText());
                empleado.setTelefono(txtTelefonoEmpleado.getText());
                empleado.setCorreo(txtCorreoEmpleado.getText());
                empleado.setCargo(jcbCargo.getSelectedItem().toString());
                empleado.setUsuario(txt_nombre_usuario.getText());
                empleado.setClave(txt_clave.getText());
                ctrlUsuarioEmpleado.actualizarUsuarioEmpleado(empleado);
                MostrarEmpleado();
                limpiar();
                btnGuardarEmpleado.setEnabled(false);
                obtenerFechaActual();
                btnTerminarEdicion.setEnabled(false);
            } else if (ax == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Cambios no guardado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Algun dato fue incorrecto vuelva a ingresar ");
        }
    }//GEN-LAST:event_btnTerminarEdicionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmMenuPrincipal men = new FrmMenuPrincipal();
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNuevoEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoMouseEntered
        btnNuevoEmpleado.setToolTipText("Registrar un nuevo Empleado");
    }//GEN-LAST:event_btnNuevoEmpleadoMouseEntered

    private void btnGuardarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoMouseEntered
        btnGuardarEmpleado.setToolTipText("Guardar nuevo Empleado");
    }//GEN-LAST:event_btnGuardarEmpleadoMouseEntered

    private void btnEliminarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoMouseEntered
        btnEliminarEmpleado.setToolTipText("Eliminar al empleado seleccionado");
    }//GEN-LAST:event_btnEliminarEmpleadoMouseEntered

    private void btnEditarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoMouseEntered
        btnEditarEmpleado.setToolTipText("Editar al empleado seleccionado");
    }//GEN-LAST:event_btnEditarEmpleadoMouseEntered

    private void btnTerminarEdicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarEdicionMouseEntered
        btnTerminarEdicion.setToolTipText("Terminar la edicion del cliente");
    }//GEN-LAST:event_btnTerminarEdicionMouseEntered

    private void cFechaEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaEmpleadoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_cFechaEmpleadoKeyReleased

    private void txt_nombre_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_usuarioKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txt_nombre_usuarioKeyReleased

    private void jcbCargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbCargoKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_jcbCargoKeyReleased

    private void txt_claveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_claveKeyReleased
        habilitarBGuardar();
    }//GEN-LAST:event_txt_claveKeyReleased

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        desbloquear();
        obtenerFechaActual();
        bloquearTerminareditar();
        limpiar();
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    public void MostrarEmpleado() {
        //**********************Metodo para mostrar los datos del cliente el la tabla*******************
        ctrlUsuarioEmpleado = new CtrlUsuarioEmpleado();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Id", "Cedula", "Nombre", "Apellido",
            "Fecha Nacimiento", "FechaCreacion", "Direccion", "Telefono", "Correo", "Cargo", "Usuario", "Clave"});
        ctrlUsuarioEmpleado.listarUsuarioEmpleado(modelo);
        tabEmpleados.setModel(modelo);
    }
    
    public void bloquearTerminareditar() {
        //*********************Boquea el boton Terminar Edicion****************
        btnTerminarEdicion.setEnabled(false);
    }
    
    public void desbloquear() {
        //*********************Desbloquea Los campos del JFrame****************
        txtCedulaEmpleado.setEnabled(true);
        txtNombreEmpleado.setEnabled(true);
        txtApellidoEmpleado.setEnabled(true);
        txtDireccionEmpleado.setEnabled(true);
        txtCorreoEmpleado.setEnabled(true);
        txtTelefonoEmpleado.setEnabled(true);
        cFechaEmpleado.setEnabled(true);
        jcbCargo.setEnabled(true);
        txt_nombre_usuario.setEnabled(true);
        txt_clave.setEnabled(true);
    }
    
    public void limpiar() {
        //********************Limpia los JtextField*****************************
        txtCedulaEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtApellidoEmpleado.setText("");
        txtDireccionEmpleado.setText("");
        txtTelefonoEmpleado.setText("");
        txtCorreoEmpleado.setText("");
        cFechaEmpleado.setDate(null);
        jcbCargo.setSelectedIndex(0);
        txt_nombre_usuario.setText("");
        txt_clave.setText("");
    }
    
    public void bloquear() {
        //*********************Bloque todos los campos************************* 
        txtCedulaEmpleado.setEnabled(false);
        txtNombreEmpleado.setEnabled(false);
        txtApellidoEmpleado.setEnabled(false);
        txtDireccionEmpleado.setEnabled(false);
        txtCorreoEmpleado.setEnabled(false);
        txtTelefonoEmpleado.setEnabled(false);
        cFechaEmpleado.setEnabled(false);
        jcbCargo.setEnabled(false);
        txt_nombre_usuario.setEnabled(false);
        txt_clave.setEnabled(false);
        btnEliminarEmpleado.setEnabled(false);
        btnNuevoEmpleado.setEnabled(true);
    }

    public boolean ObtenerRegistro() {
        Boolean selec = false;
        if (tabEmpleados.getSelectedRow() != -1) {
            try {
                lbl_id.setVisible(true);
                txt_idempleado.setVisible(true);
                txt_idempleado.setText(idEmpleado + "");
                txtCedulaEmpleado.setText(cedula);
                txtNombreEmpleado.setText(nombre);
                txtApellidoEmpleado.setText(apellido);
                Date fechaNac = new SimpleDateFormat("yyyy-MM-dd").parse(fecha_nac);
                cFechaEmpleado.setDate(fechaNac);
                txt_fechacreacion_usuario.setText(fecha_reg);
                txtDireccionEmpleado.setText(direccion);
                txtTelefonoEmpleado.setText(telefono);
                txtCorreoEmpleado.setText(correo);
                txt_nombre_usuario.setText(usuario);
                txt_clave.setText(contraseña);
                jcbCargo.setSelectedItem(cargo);
                selec = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro de Tabla por Favor");
        }
        return selec;
    }

    public void obtenerFechaActual() {
        Calendar c = new GregorianCalendar();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        String año = Integer.toString(c.get(Calendar.YEAR));
        txt_fechacreacion_usuario.setText(año + "-" + mes + "-" + dia);
    }

    public void habilitarBGuardar() {
        //*******************Habilita el boton Guardar si todos los campos estan llenos*********************
        if (!txtCedulaEmpleado.equals("") && !txtNombreEmpleado.equals("") && !txtApellidoEmpleado.equals("")
                && cFechaEmpleado.getDate() != null && !txt_fechacreacion_usuario.equals("") && !txtDireccionEmpleado.equals("")
                && !txtTelefonoEmpleado.equals("") && !txtCorreoEmpleado.equals("") && !jcbCargo.getSelectedItem().toString().equals("Seleccione")
                && !txt_nombre_usuario.equals("") && !txt_clave.equals("")) {

            btnGuardarEmpleado.setEnabled(true);

        } else {
            btnGuardarEmpleado.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JButton btnTerminarEdicion;
    private com.toedter.calendar.JDateChooser cFechaEmpleado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JLabel lbl_clave1;
    private javax.swing.JLabel lbl_id;
    private ventanas.PanelImage1 panelImage1;
    private javax.swing.JTable tabEmpleados;
    private javax.swing.JTextField txtApellidoEmpleado;
    public javax.swing.JTextField txtCedulaEmpleado;
    public javax.swing.JTextField txtCorreoEmpleado;
    public javax.swing.JTextField txtDireccionEmpleado;
    public javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JPasswordField txt_clave;
    private javax.swing.JTextField txt_fechacreacion_usuario;
    private javax.swing.JTextField txt_idempleado;
    private javax.swing.JTextField txt_nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
