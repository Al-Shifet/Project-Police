/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.police;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import static project.police.ComplainantReport.DB_URL;

/**
 *
 * @author Isaack
 */
public final class ReportersReport extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost/police_management_system";
    //  Database credentials
    static final String USER = "root" ;
    static final String PASS = "Isaamille2017";

    /**
     * Creates new form ReportersReport
     */
    public ReportersReport() {
        initComponents();
        Show_Reporter_In_Table();
    }
    
    public Connection getConnection(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS); 
            return conn;
        } catch (SQLException e) {
            return null;
        }
    }
     public ArrayList<Reporters> getReporterList(){
        ArrayList<Reporters> reporterList;
        reporterList = new ArrayList<>();
        Connection connection = getConnection();
        
        String query = "SELECT * FROM reporter";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Reporters reporter;
            while (rs.next()) {                
                reporter = new Reporters(rs.getInt("reporter_id"),rs.getInt("case_id"),
                rs.getString("reporter_firstname"),rs.getString("reporter_lastname"),
                rs.getInt("reporter_phone_number"),rs.getInt("nationalid"));
                reporterList.add(reporter);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reporterList;
    }
    
//    DISPLAY DATA IN THE JTABLE
    public void Show_Reporter_In_Table(){
        ArrayList<Reporters> list = getReporterList();
        DefaultTableModel model = (DefaultTableModel) jTable_Show_Reporters.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getCaseID();
            row[2] = list.get(i).getFirstName();
            row[3] = list.get(i).getLastName();
            row[4] = list.get(i).getPhoneNumber();
            row[5] = list.get(i).getNationalID();
            
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Show_Reporters = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 40, 55));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REPORTER'S REPORT");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 240, -1));

        lblBack.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/police/images/back4.png"))); // NOI18N
        lblBack.setText("BACK");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 40));

        jTable_Show_Reporters.setBackground(new java.awt.Color(30, 40, 55));
        jTable_Show_Reporters.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable_Show_Reporters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Case ID", "First Name", "Last Name", "Phone Number", "National ID"
            }
        ));
        jScrollPane1.setViewportView(jTable_Show_Reporters);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 80, 680, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        PoliceHome police = new PoliceHome();
        police.setSize(775,497);
        police.setLocationRelativeTo(null);
        police.pack();
        police.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

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
            java.util.logging.Logger.getLogger(ReportersReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportersReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportersReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportersReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportersReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Show_Reporters;
    private javax.swing.JLabel lblBack;
    // End of variables declaration//GEN-END:variables
}
