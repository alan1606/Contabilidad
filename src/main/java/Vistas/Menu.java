/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import javax.swing.JOptionPane;


/**
 *
 * @author alanm
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        
        
    }

     private void cerrar() {
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", dialog);

        if (result == 0) {
            System.exit(0);
        } else {
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnCortes = new javax.swing.JButton();
        btnEstudiosInstituciones = new javax.swing.JButton();
        btnInstituciones = new javax.swing.JButton();
        btnEstudios = new javax.swing.JButton();
        btnAreas = new javax.swing.JButton();
        btnUrgencias = new javax.swing.JButton();
        btnReagendar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCortes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCortes.setForeground(new java.awt.Color(0, 0, 51));
        btnCortes.setText("Cortes");
        btnCortes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCortes.setContentAreaFilled(false);
        getContentPane().add(btnCortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 30));

        btnEstudiosInstituciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEstudiosInstituciones.setText("Asignar estudios");
        btnEstudiosInstituciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEstudiosInstituciones.setContentAreaFilled(false);
        btnEstudiosInstituciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiosInstitucionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstudiosInstituciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, 30));

        btnInstituciones.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnInstituciones.setForeground(new java.awt.Color(0, 0, 51));
        btnInstituciones.setText("Instituciones");
        btnInstituciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInstituciones.setContentAreaFilled(false);
        getContentPane().add(btnInstituciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 120, 30));

        btnEstudios.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEstudios.setForeground(new java.awt.Color(0, 0, 51));
        btnEstudios.setText("Estudios");
        btnEstudios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEstudios.setContentAreaFilled(false);
        getContentPane().add(btnEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 120, 30));

        btnAreas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAreas.setForeground(new java.awt.Color(0, 0, 51));
        btnAreas.setText("Áreas");
        btnAreas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAreas.setContentAreaFilled(false);
        btnAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAreas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 120, 30));
        getContentPane().add(btnUrgencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 120, 30));
        getContentPane().add(btnReagendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cortemenu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AsigEsMenu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estudioMenu.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/areamenu.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/institucionesMenu.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 40, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 110));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 110));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 140, 110));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 140, 110));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 110));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 140, 110));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 140, 110));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("        Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salirmenu.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel10.setBackground(new java.awt.Color(0, 51, 102));
        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 60));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudiosInstitucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiosInstitucionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstudiosInstitucionesActionPerformed

    private void btnAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAreasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreas;
    private javax.swing.JButton btnCortes;
    private javax.swing.JButton btnEstudios;
    private javax.swing.JButton btnEstudiosInstituciones;
    private javax.swing.JButton btnInstituciones;
    private javax.swing.JButton btnReagendar;
    private javax.swing.JButton btnUrgencias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
