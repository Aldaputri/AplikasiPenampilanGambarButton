/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author ACER
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButtonFullScreen
     */
    public PilihGambarButtonFullScreen() {
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

        buttonPanel = new javax.swing.JPanel();
        PBT = new javax.swing.JButton();
        DBT = new javax.swing.JButton();
        NBT = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        DLB = new javax.swing.JLabel();
        NLB = new javax.swing.JLabel();
        PLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PBT.setText("Panduan Sholat");
        PBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBTActionPerformed(evt);
            }
        });

        DBT.setText("Do'a Dan Dzikir");
        DBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBTActionPerformed(evt);
            }
        });

        NBT.setText("Nabi Muhammad");
        NBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NBTActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        imagePanel.setLayout(new java.awt.CardLayout());

        DLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/doadzikir.jpg"))); // NOI18N
        imagePanel.add(DLB, "2");

        NLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bukunabi.jpg"))); // NOI18N
        imagePanel.add(NLB, "1");

        PLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panduansholat.jpg"))); // NOI18N
        imagePanel.add(PLB, "0");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(PBT)
                .addGap(57, 57, 57)
                .addComponent(DBT)
                .addGap(58, 58, 58)
                .addComponent(NBT)
                .addGap(57, 57, 57)
                .addComponent(exit)
                .addContainerGap(80, Short.MAX_VALUE))
            .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PBT)
                    .addComponent(DBT)
                    .addComponent(NBT)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_PBTActionPerformed

    private void DBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_DBTActionPerformed

    private void NBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_NBTActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               PilihGambarButtonFullScreen fullFrame = new PilihGambarButtonFullScreen();
               
               GraphicsDevice device =
                       GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
               device.setFullScreenWindow(fullFrame);
               fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DBT;
    private javax.swing.JLabel DLB;
    private javax.swing.JButton NBT;
    private javax.swing.JLabel NLB;
    private javax.swing.JButton PBT;
    private javax.swing.JLabel PLB;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exit;
    private javax.swing.JPanel imagePanel;
    // End of variables declaration//GEN-END:variables
}