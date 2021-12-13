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
public class Devoluciones extends javax.swing.JFrame {

    /**
     * Creates new form Devoluciones
     */
    public Devoluciones() {
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
        btnRegresar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrdenes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMetodoPago = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUsoCfdi = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setText("Regresar");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnCerrar.setText("Cerrar");
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        btnMinimizar.setText("Minimizar");
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jScrollPane1.setViewportView(tableOrdenes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 500, 210));

        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 240, 210));

        jLabel1.setText("Nombre o razón social");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 210, -1));

        jLabel2.setText("RFC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));
        jPanel1.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 210, -1));

        jLabel3.setText("Calle");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));
        jPanel1.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 210, -1));

        jLabel4.setText("Colonia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));
        jPanel1.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 210, -1));

        jLabel5.setText("CP");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, -1));
        jPanel1.add(txtCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 210, -1));

        jLabel6.setText("Ciudad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));
        jPanel1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 210, -1));

        jLabel7.setText("Correo electronico");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 210, -1));

        jLabel8.setText("Método de pago");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));
        jPanel1.add(txtMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 210, -1));

        jLabel9.setText("Uso CFDI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));
        jPanel1.add(txtUsoCfdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 210, -1));

        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 277, 280, 300));

        jButton1.setText("Marcar como devolución hecha");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tableOrdenes;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCp;
    private javax.swing.JTextField txtMetodoPago;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtUsoCfdi;
    // End of variables declaration//GEN-END:variables
}