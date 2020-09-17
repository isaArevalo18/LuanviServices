package vista;

public class jfrmMain extends javax.swing.JFrame {

	public jfrmMain() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jMenuBar1 = new javax.swing.JMenuBar();
                jmArchivo = new javax.swing.JMenu();
                jmiSalir = new javax.swing.JMenuItem();
                jmMantenimiento = new javax.swing.JMenu();
                jmiEmpleados = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jmArchivo.setText("Archivo");

                jmiSalir.setText("Salir");
                jmiSalir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jmiSalirActionPerformed(evt);
                        }
                });
                jmArchivo.add(jmiSalir);

                jMenuBar1.add(jmArchivo);

                jmMantenimiento.setText("Mantenimiento");

                jmiEmpleados.setText("Empleados...");
                jmiEmpleados.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jmiEmpleadosActionPerformed(evt);
                        }
                });
                jmMantenimiento.add(jmiEmpleados);

                jMenuBar1.add(jmMantenimiento);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 278, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
                System.exit(0);
        }//GEN-LAST:event_jmiSalirActionPerformed

        private void jmiEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmpleadosActionPerformed
		jdlgMantenimiento objMantenimiento = new jdlgMantenimiento(this, true);
		objMantenimiento.setVisible(true);
        }//GEN-LAST:event_jmiEmpleadosActionPerformed

	public static void main(String args[]) {
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(jfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(jfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(jfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(jfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new jfrmMain().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenu jmArchivo;
        private javax.swing.JMenu jmMantenimiento;
        private javax.swing.JMenuItem jmiEmpleados;
        private javax.swing.JMenuItem jmiSalir;
        // End of variables declaration//GEN-END:variables
}
