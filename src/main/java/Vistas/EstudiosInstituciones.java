/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author alanm
 */
public class EstudiosInstituciones extends javax.swing.JFrame {

    /**
     * Creates new form EstudiosInstituciones
     */
    public EstudiosInstituciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableConceptosInstitucion = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInstituciones = new javax.swing.JTable();
        txtBuscarInstitucion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarEstudio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEstudios = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEstudio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInstitucion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioPublico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClaveInstitucion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtClaveAnteriorPensiones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtClaveContpaq = new javax.swing.JTextField();
        checkActivo = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setViewportView(tableConceptosInstitucion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 380, 370));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CerrarSecundario.png"))); // NOI18N
        btnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minSecundario.png"))); // NOI18N
        btnMin.setBorderPainted(false);
        btnMin.setContentAreaFilled(false);
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LOGO");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 160, 45));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flecha-regresar.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignados"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 410, 420));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tableInstituciones);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 130));
        jPanel3.add(txtBuscarInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Institucion");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Estudio");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        jPanel3.add(txtBuscarEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 410, -1));

        jScrollPane2.setViewportView(tableEstudios);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 410, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 710, 210));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar/modificar"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Estudio");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel5.add(txtEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Institucion");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel5.add(txtInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Precio público");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtPrecioPublico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel5.add(txtPrecioPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Costo");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        txtCosto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel5.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Clave institucion");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel5.add(txtClaveInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Clave anterior pensiones");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        jPanel5.add(txtClaveAnteriorPensiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Clave contpaq");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel5.add(txtClaveContpaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, -1));

        checkActivo.setBackground(new java.awt.Color(204, 204, 255));
        checkActivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkActivo.setText("Activo");
        jPanel5.add(checkActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 51));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 90, 30));

        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.setContentAreaFilled(false);
        jPanel5.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 300, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 705));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(EstudiosInstituciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudiosInstituciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudiosInstituciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudiosInstituciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudiosInstituciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnMin;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JCheckBox checkActivo;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tableConceptosInstitucion;
    public javax.swing.JTable tableEstudios;
    public javax.swing.JTable tableInstituciones;
    public javax.swing.JTextField txtBuscarEstudio;
    public javax.swing.JTextField txtBuscarInstitucion;
    public javax.swing.JTextField txtClaveAnteriorPensiones;
    public javax.swing.JTextField txtClaveContpaq;
    public javax.swing.JTextField txtClaveInstitucion;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtEstudio;
    public javax.swing.JTextField txtInstitucion;
    public javax.swing.JTextField txtPrecioPublico;
    // End of variables declaration//GEN-END:variables
}
