/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.police;

/**
 *
 * @author Isaack
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblCasesOverview = new javax.swing.JLabel();
        lblReporterOverview = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblPoliceOverview = new javax.swing.JLabel();
        lblComplainantOverview = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(30, 40, 55));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogout.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/police/images/exit2.png"))); // NOI18N
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel4.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("OVERVIEW");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 140, -1));

        lblExit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/police/images/exit2.png"))); // NOI18N
        lblExit.setText("EXIT");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        jPanel4.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 40));

        lblCasesOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/police/images/reporter-report.png"))); // NOI18N
        lblCasesOverview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCasesOverviewMouseClicked(evt);
            }
        });
        jPanel4.add(lblCasesOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 130, 160));

        lblReporterOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/police/images/reporter-report.png"))); // NOI18N
        lblReporterOverview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReporterOverviewMouseClicked(evt);
            }
        });
        jPanel4.add(lblReporterOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 140, 150));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("POLICE OVERVIEW");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 210, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CASES OVERVIEW");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 170, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("COMPLAINANT OVERVIEW");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        lblPoliceOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/police/images/reporter-report.png"))); // NOI18N
        lblPoliceOverview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPoliceOverviewMouseClicked(evt);
            }
        });
        jPanel4.add(lblPoliceOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, 160));

        lblComplainantOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/police/images/reporter-report.png"))); // NOI18N
        lblComplainantOverview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComplainantOverviewMouseClicked(evt);
            }
        });
        jPanel4.add(lblComplainantOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 130, 160));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("REPORTER OVERVIEW");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 200, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        Admin admin = new Admin();
        admin.setSize(1200,650);
        admin.setLocationRelativeTo(null);
        admin.pack();
        admin.setVisible(true);

    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblCasesOverviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCasesOverviewMouseClicked
        // TODO add your handling code here:
        CaseOverview cr = new CaseOverview();
        cr.setSize(1200,650);
        cr.setLocationRelativeTo(null);
        cr.pack();
        cr.setVisible(true);
    }//GEN-LAST:event_lblCasesOverviewMouseClicked

    private void lblReporterOverviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporterOverviewMouseClicked
        // TODO add your handling code here:
        ReporterOverview cr = new ReporterOverview();
        cr.setSize(1200,650);
        cr.setLocationRelativeTo(null);
        cr.pack();
        cr.setVisible(true);

    }//GEN-LAST:event_lblReporterOverviewMouseClicked

    private void lblPoliceOverviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPoliceOverviewMouseClicked
        // TODO add your handling code here
        PoliceOverview cr = new PoliceOverview();
        cr.setSize(1200,650);
        cr.setLocationRelativeTo(null);
        cr.pack();
        cr.setVisible(true);
    }//GEN-LAST:event_lblPoliceOverviewMouseClicked

    private void lblComplainantOverviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComplainantOverviewMouseClicked
        // TODO add your handling code here:
        ComplainantOverview cr = new ComplainantOverview();
        cr.setSize(1200,650);
        cr.setLocationRelativeTo(null);
        cr.pack();
        cr.setVisible(true);
    }//GEN-LAST:event_lblComplainantOverviewMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCasesOverview;
    private javax.swing.JLabel lblComplainant;
    private javax.swing.JLabel lblComplainant1;
    private javax.swing.JLabel lblComplainantOverview;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblPoliceOverview;
    private javax.swing.JLabel lblReporterOverview;
    // End of variables declaration//GEN-END:variables
}
