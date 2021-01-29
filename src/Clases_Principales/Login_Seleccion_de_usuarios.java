/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Principales;

/**
 *
 * @author aleja
 */
public class Login_Seleccion_de_usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_de_Sesion_Inventario
     */
    public Login_Seleccion_de_usuarios() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo_del_Programa = new javax.swing.JLabel();
        Simbolo_Marca_Registrada = new javax.swing.JLabel();
        Descripcion_del_Programa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_Administrativo_General = new javax.swing.JButton();
        jButton_Control_Escolar = new javax.swing.JButton();
        jButton_Usuario_Administrativo = new javax.swing.JButton();
        jButton_Usuario_Alumno = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        Informacion_Administrativo_general = new javax.swing.JButton();
        Informacion_Control_escolar = new javax.swing.JButton();
        Informacion_Usuario_administrativo = new javax.swing.JButton();
        Informacion_Usuario_alumno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Imagen_de_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal - LogBook");
        setMaximumSize(new java.awt.Dimension(837, 720));
        setMinimumSize(new java.awt.Dimension(837, 720));
        setPreferredSize(new java.awt.Dimension(837, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        Titulo_del_Programa.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        Titulo_del_Programa.setForeground(new java.awt.Color(0, 0, 102));
        Titulo_del_Programa.setText("LogBook");
        getContentPane().add(Titulo_del_Programa);
        Titulo_del_Programa.setBounds(480, 30, 210, 70);

        Simbolo_Marca_Registrada.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        Simbolo_Marca_Registrada.setForeground(new java.awt.Color(0, 0, 102));
        Simbolo_Marca_Registrada.setText("®");
        getContentPane().add(Simbolo_Marca_Registrada);
        Simbolo_Marca_Registrada.setBounds(690, 50, 20, 20);

        Descripcion_del_Programa.setFont(new java.awt.Font("Gill Sans MT", 3, 20)); // NOI18N
        Descripcion_del_Programa.setText("Sistema de registro escolar");
        getContentPane().add(Descripcion_del_Programa);
        Descripcion_del_Programa.setBounds(460, 100, 240, 24);

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("¡Bienvenido al gestor de registro escolar!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 150, 570, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logotipo de LogBook CHICO.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(720, 20, 80, 110);

        jButton_Administrativo_General.setFont(new java.awt.Font("Segoe UI Semibold", 1, 26)); // NOI18N
        jButton_Administrativo_General.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo gerente blanco y negro CHICO.png"))); // NOI18N
        jButton_Administrativo_General.setText("Administrativo general ");
        jButton_Administrativo_General.setToolTipText("Es el encargado de la institucion y puede acceder a todo el sistema");
        jButton_Administrativo_General.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Administrativo_General.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_Administrativo_General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Administrativo_GeneralActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Administrativo_General);
        jButton_Administrativo_General.setBounds(220, 280, 370, 50);

        jButton_Control_Escolar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 26)); // NOI18N
        jButton_Control_Escolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo control escolar CHICO.png"))); // NOI18N
        jButton_Control_Escolar.setText("Control escolar");
        jButton_Control_Escolar.setToolTipText("Accede a todo el registro escolar menos a configuraciones primarias");
        jButton_Control_Escolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Control_EscolarMouseClicked(evt);
            }
        });
        jButton_Control_Escolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Control_EscolarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Control_Escolar);
        jButton_Control_Escolar.setBounds(300, 360, 270, 50);

        jButton_Usuario_Administrativo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 26)); // NOI18N
        jButton_Usuario_Administrativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo administrativo CHICO.png"))); // NOI18N
        jButton_Usuario_Administrativo.setText("Usuario administrativo");
        jButton_Usuario_Administrativo.setToolTipText("Puede ver los datos de todos los reportes pero no puede cambiar el contenido general");
        jButton_Usuario_Administrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Usuario_AdministrativoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Usuario_Administrativo);
        jButton_Usuario_Administrativo.setBounds(380, 440, 350, 50);

        jButton_Usuario_Alumno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        jButton_Usuario_Alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo alumno CHICO.png"))); // NOI18N
        jButton_Usuario_Alumno.setText("Usuario alumno");
        jButton_Usuario_Alumno.setToolTipText("Podrá ver solo la información que se ha ingresado y podrá actualizarla");
        jButton_Usuario_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Usuario_AlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Usuario_Alumno);
        jButton_Usuario_Alumno.setBounds(450, 520, 280, 50);

        jButton_Salir.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Salir.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jButton_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo volver blanco CHICO.png"))); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.setIconTextGap(8);
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir);
        jButton_Salir.setBounds(680, 625, 125, 45);

        Informacion_Administrativo_general.setBackground(new java.awt.Color(204, 204, 204));
        Informacion_Administrativo_general.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        Informacion_Administrativo_general.setForeground(new java.awt.Color(22, 111, 255));
        Informacion_Administrativo_general.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo informacion circular CHICO.png"))); // NOI18N
        Informacion_Administrativo_general.setContentAreaFilled(false);
        Informacion_Administrativo_general.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Informacion_Administrativo_general.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Informacion_Administrativo_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informacion_Administrativo_generalActionPerformed(evt);
            }
        });
        getContentPane().add(Informacion_Administrativo_general);
        Informacion_Administrativo_general.setBounds(590, 280, 70, 50);

        Informacion_Control_escolar.setBackground(new java.awt.Color(204, 204, 204));
        Informacion_Control_escolar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Informacion_Control_escolar.setForeground(new java.awt.Color(22, 111, 255));
        Informacion_Control_escolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo informacion circular CHICO.png"))); // NOI18N
        Informacion_Control_escolar.setContentAreaFilled(false);
        Informacion_Control_escolar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Informacion_Control_escolar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Informacion_Control_escolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informacion_Control_escolarActionPerformed(evt);
            }
        });
        getContentPane().add(Informacion_Control_escolar);
        Informacion_Control_escolar.setBounds(570, 360, 70, 50);

        Informacion_Usuario_administrativo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        Informacion_Usuario_administrativo.setForeground(new java.awt.Color(22, 111, 255));
        Informacion_Usuario_administrativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo informacion circular CHICO.png"))); // NOI18N
        Informacion_Usuario_administrativo.setContentAreaFilled(false);
        Informacion_Usuario_administrativo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Informacion_Usuario_administrativo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Informacion_Usuario_administrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informacion_Usuario_administrativoActionPerformed(evt);
            }
        });
        getContentPane().add(Informacion_Usuario_administrativo);
        Informacion_Usuario_administrativo.setBounds(730, 440, 70, 50);

        Informacion_Usuario_alumno.setBackground(new java.awt.Color(204, 204, 204));
        Informacion_Usuario_alumno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        Informacion_Usuario_alumno.setForeground(new java.awt.Color(22, 111, 255));
        Informacion_Usuario_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo informacion circular CHICO.png"))); // NOI18N
        Informacion_Usuario_alumno.setContentAreaFilled(false);
        Informacion_Usuario_alumno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Informacion_Usuario_alumno.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Informacion_Usuario_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informacion_Usuario_alumnoActionPerformed(evt);
            }
        });
        getContentPane().add(Informacion_Usuario_alumno);
        Informacion_Usuario_alumno.setBounds(720, 520, 70, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel5.setText("Seleccione su tipo de usuario para poder iniciar su sesión");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 200, 570, 40);

        jLabel_Imagen_de_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Imagen para inicio de sesion de Registro Escolar AJUSTADO.png"))); // NOI18N
        getContentPane().add(jLabel_Imagen_de_fondo);
        jLabel_Imagen_de_fondo.setBounds(0, 0, 830, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Administrativo_GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Administrativo_GeneralActionPerformed
        Login_Registro_Escolar Ventana = new Login_Registro_Escolar();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_Administrativo_GeneralActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_Control_EscolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Control_EscolarActionPerformed
        Login_Registro_Escolar Ventana = new Login_Registro_Escolar();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_Control_EscolarActionPerformed

    private void jButton_Usuario_AdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Usuario_AdministrativoActionPerformed
        Login_Registro_Escolar Ventana = new Login_Registro_Escolar();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_Usuario_AdministrativoActionPerformed

    private void jButton_Usuario_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Usuario_AlumnoActionPerformed
        Login_Registro_Escolar Ventana = new Login_Registro_Escolar();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_Usuario_AlumnoActionPerformed

    private void Informacion_Administrativo_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informacion_Administrativo_generalActionPerformed
        Informacion_Administrativo_general Ventana = new Informacion_Administrativo_general();
        Ventana.setVisible(true);
    }//GEN-LAST:event_Informacion_Administrativo_generalActionPerformed

    private void jButton_Control_EscolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Control_EscolarMouseClicked
        Login_Registro_Escolar Ventana = new Login_Registro_Escolar();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_Control_EscolarMouseClicked

    private void Informacion_Control_escolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informacion_Control_escolarActionPerformed
        Informacion_Control_Escolar Ventana = new Informacion_Control_Escolar();
        Ventana.setVisible(true);

    }//GEN-LAST:event_Informacion_Control_escolarActionPerformed

    private void Informacion_Usuario_administrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informacion_Usuario_administrativoActionPerformed
        Informacion_Usuario_Administrativo Ventana = new Informacion_Usuario_Administrativo();
        Ventana.setVisible(true);
    }//GEN-LAST:event_Informacion_Usuario_administrativoActionPerformed

    private void Informacion_Usuario_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informacion_Usuario_alumnoActionPerformed
        Informacion_Usuario_Alumno Ventana = new Informacion_Usuario_Alumno();
        Ventana.setVisible(true);
    }//GEN-LAST:event_Informacion_Usuario_alumnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login_Seleccion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Seleccion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Seleccion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Seleccion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Seleccion_de_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripcion_del_Programa;
    private javax.swing.JButton Informacion_Administrativo_general;
    private javax.swing.JButton Informacion_Control_escolar;
    private javax.swing.JButton Informacion_Usuario_administrativo;
    private javax.swing.JButton Informacion_Usuario_alumno;
    private javax.swing.JLabel Simbolo_Marca_Registrada;
    private javax.swing.JLabel Titulo_del_Programa;
    private javax.swing.JButton jButton_Administrativo_General;
    private javax.swing.JButton jButton_Control_Escolar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_Usuario_Administrativo;
    private javax.swing.JButton jButton_Usuario_Alumno;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Imagen_de_fondo;
    // End of variables declaration//GEN-END:variables
}
