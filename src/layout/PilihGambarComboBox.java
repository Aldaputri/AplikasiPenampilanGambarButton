/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author ACER
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
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
        jLabel1 = new javax.swing.JLabel();
        cbb = new javax.swing.JComboBox<>();
        pCard = new javax.swing.JPanel();
        PLB = new javax.swing.JLabel();
        DLB = new javax.swing.JLabel();
        NLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilih Buku");
        jPanel1.add(jLabel1);

        cbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Panduan Sholat", "Do'a dan Dzikir", "Nabi Muhammad" }));
        cbb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbItemStateChanged(evt);
            }
        });
        jPanel1.add(cbb);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pCard.setLayout(new java.awt.CardLayout());

        PLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panduansholat.jpg"))); // NOI18N
        pCard.add(PLB, "0");

        DLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doadzikir.jpg"))); // NOI18N
        pCard.add(DLB, "1");

        NLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bukunabi.jpg"))); // NOI18N
        pCard.add(NLB, "2");

        getContentPane().add(pCard, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbItemStateChanged
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(pCard.getLayout());
        cl.show(pCard,String.valueOf(cbb.getSelectedIndex()));
    }//GEN-LAST:event_cbbItemStateChanged

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DLB;
    private javax.swing.JLabel NLB;
    private javax.swing.JLabel PLB;
    private javax.swing.JComboBox<String> cbb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pCard;
    // End of variables declaration//GEN-END:variables
}
