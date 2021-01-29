/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Principales;

import java.util.Locale;
import javax.swing.JTable;

/**
 *
 * @author aleja
 */
public class Menu_Principal_ADMINISTRADOR extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal_ADMINISTRADOR
     */
    public Menu_Principal_ADMINISTRADOR() {
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

        jLabel_Servicios_escolares = new javax.swing.JLabel();
        Titulo_del_Programa = new javax.swing.JLabel();
        jLabel_Logo_LogBook = new javax.swing.JLabel();
        Simbolo_Marca_Registrada = new javax.swing.JLabel();
        Descripcion_del_Programa = new javax.swing.JLabel();
        Boton_Agregar_Admin = new javax.swing.JButton();
        Boton_Lista_de_prospectos = new javax.swing.JButton();
        Boton_Lista_de_alumnos = new javax.swing.JButton();
        Titulo_Lista_de_prospectos = new javax.swing.JLabel();
        jLabel_Menu_principal = new javax.swing.JLabel();
        Separator_Lista_de_prospectos = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Fondo_verde = new javax.swing.JLabel();
        jLabel_Fondo_azul = new javax.swing.JLabel();
        jLabel_Fondo_negro = new javax.swing.JLabel();
        jLabel_Fondo_Gris = new javax.swing.JLabel();
        jLabel_Fondo_blanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal Administrador - LogBook");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1097, 670));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel_Servicios_escolares.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel_Servicios_escolares.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Servicios_escolares.setText("Servicios escolares");
        getContentPane().add(jLabel_Servicios_escolares);
        jLabel_Servicios_escolares.setBounds(10, 90, 200, 30);

        Titulo_del_Programa.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        Titulo_del_Programa.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_del_Programa.setText("LogBook");
        Titulo_del_Programa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Titulo_del_Programa);
        Titulo_del_Programa.setBounds(10, 11, 130, 40);

        jLabel_Logo_LogBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logotipo de LogBook MAS CHICO.png"))); // NOI18N
        getContentPane().add(jLabel_Logo_LogBook);
        jLabel_Logo_LogBook.setBounds(190, 10, 50, 60);

        Simbolo_Marca_Registrada.setFont(new java.awt.Font("Gill Sans MT", 1, 16)); // NOI18N
        Simbolo_Marca_Registrada.setForeground(new java.awt.Color(255, 255, 255));
        Simbolo_Marca_Registrada.setText("®");
        getContentPane().add(Simbolo_Marca_Registrada);
        Simbolo_Marca_Registrada.setBounds(135, 15, 20, 20);

        Descripcion_del_Programa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Descripcion_del_Programa.setForeground(new java.awt.Color(255, 255, 255));
        Descripcion_del_Programa.setText("Sistema de registro escolar");
        getContentPane().add(Descripcion_del_Programa);
        Descripcion_del_Programa.setBounds(10, 40, 180, 30);

        Boton_Agregar_Admin.setBackground(new java.awt.Color(255, 255, 255));
        Boton_Agregar_Admin.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Boton_Agregar_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo administrativo CHICO.png"))); // NOI18N
        Boton_Agregar_Admin.setText("<html>Agregar administrador</html>");
        Boton_Agregar_Admin.setToolTipText("Muestra la lista de los alumnos que ya han sido admitidos en el la institucion");
        Boton_Agregar_Admin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Boton_Agregar_Admin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Agregar_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Agregar_AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Agregar_Admin);
        Boton_Agregar_Admin.setBounds(10, 300, 210, 70);

        Boton_Lista_de_prospectos.setBackground(new java.awt.Color(255, 255, 255));
        Boton_Lista_de_prospectos.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Boton_Lista_de_prospectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Icono Registrar CHICO.png"))); // NOI18N
        Boton_Lista_de_prospectos.setText("Lista de prospectos");
        Boton_Lista_de_prospectos.setToolTipText("Muestra la lista de las personas que llenaron la solicitud de inscripcion y la registraron");
        Boton_Lista_de_prospectos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Boton_Lista_de_prospectos.setName(""); // NOI18N
        getContentPane().add(Boton_Lista_de_prospectos);
        Boton_Lista_de_prospectos.setBounds(10, 160, 230, 50);

        Boton_Lista_de_alumnos.setBackground(new java.awt.Color(255, 255, 255));
        Boton_Lista_de_alumnos.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Boton_Lista_de_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_Registro_Escolar/Logo alumno CHICO.png"))); // NOI18N
        Boton_Lista_de_alumnos.setText("<html>Lista de alumnos</html>");
        Boton_Lista_de_alumnos.setToolTipText("Muestra la lista de los alumnos que ya han sido admitidos en el la institucion");
        Boton_Lista_de_alumnos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Boton_Lista_de_alumnos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Lista_de_alumnos.setIconTextGap(6);
        getContentPane().add(Boton_Lista_de_alumnos);
        Boton_Lista_de_alumnos.setBounds(10, 220, 160, 70);

        Titulo_Lista_de_prospectos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Titulo_Lista_de_prospectos.setForeground(new java.awt.Color(51, 51, 51));
        Titulo_Lista_de_prospectos.setText("Lista de prospectos");
        getContentPane().add(Titulo_Lista_de_prospectos);
        Titulo_Lista_de_prospectos.setBounds(270, 100, 230, 32);

        jLabel_Menu_principal.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel_Menu_principal.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Menu_principal.setText("Menú principal");
        getContentPane().add(jLabel_Menu_principal);
        jLabel_Menu_principal.setBounds(270, 20, 210, 40);
        getContentPane().add(Separator_Lista_de_prospectos);
        Separator_Lista_de_prospectos.setBounds(270, 140, 810, 20);

        jPanel1.setMaximumSize(new java.awt.Dimension(710, 390));
        jPanel1.setMinimumSize(new java.awt.Dimension(710, 390));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 390));
        jPanel1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 230, 800, 390);

        jLabel_Fondo_verde.setBackground(new java.awt.Color(45, 132, 45));
        jLabel_Fondo_verde.setOpaque(true);
        getContentPane().add(jLabel_Fondo_verde);
        jLabel_Fondo_verde.setBounds(0, 80, 250, 50);

        jLabel_Fondo_azul.setBackground(new java.awt.Color(0, 136, 182));
        jLabel_Fondo_azul.setOpaque(true);
        getContentPane().add(jLabel_Fondo_azul);
        jLabel_Fondo_azul.setBounds(0, 0, 250, 80);

        jLabel_Fondo_negro.setBackground(new java.awt.Color(7, 43, 78));
        jLabel_Fondo_negro.setForeground(new java.awt.Color(36, 36, 36));
        jLabel_Fondo_negro.setOpaque(true);
        getContentPane().add(jLabel_Fondo_negro);
        jLabel_Fondo_negro.setBounds(250, 0, 840, 80);

        jLabel_Fondo_Gris.setBackground(new java.awt.Color(243, 243, 243));
        jLabel_Fondo_Gris.setOpaque(true);
        getContentPane().add(jLabel_Fondo_Gris);
        jLabel_Fondo_Gris.setBounds(0, 130, 250, 520);

        jLabel_Fondo_blanco.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Fondo_blanco.setOpaque(true);
        getContentPane().add(jLabel_Fondo_blanco);
        jLabel_Fondo_blanco.setBounds(250, 80, 840, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_Agregar_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Agregar_AdminActionPerformed
        AGREGAR_Administrador Formulario = new AGREGAR_Administrador();
        Formulario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Agregar_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal_ADMINISTRADOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Agregar_Admin;
    private javax.swing.JButton Boton_Lista_de_alumnos;
    private javax.swing.JButton Boton_Lista_de_prospectos;
    private javax.swing.JLabel Descripcion_del_Programa;
    private javax.swing.JSeparator Separator_Lista_de_prospectos;
    private javax.swing.JLabel Simbolo_Marca_Registrada;
    private javax.swing.JLabel Titulo_Lista_de_prospectos;
    private javax.swing.JLabel Titulo_del_Programa;
    private javax.swing.JLabel jLabel_Fondo_Gris;
    private javax.swing.JLabel jLabel_Fondo_azul;
    private javax.swing.JLabel jLabel_Fondo_blanco;
    private javax.swing.JLabel jLabel_Fondo_negro;
    private javax.swing.JLabel jLabel_Fondo_verde;
    private javax.swing.JLabel jLabel_Logo_LogBook;
    private javax.swing.JLabel jLabel_Menu_principal;
    private javax.swing.JLabel jLabel_Servicios_escolares;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
