/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flush.dry.cleaning.service;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.event.ChangeListener;


import javax.swing.JOptionPane;



/**
 *
 * @author Daniel Keta
 */
public class Customer_Details_Reports extends javax.swing.JFrame {
        Connection con = null;
    String url = "jdbc:mysql://localhost/";// url: - Database url where stored or created your database
    String dbName = "flush_dry_cleaning_service";
    String driver = "com.mysql.jdbc.Driver";
    String userName = "root";//  userName: - User name of MySQL
    String password = "";// password: -Password of MySQL
   // Statement st;
    Statement stmt;
    ResultSet rs;
    SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
    private String UI;
    
    
     public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    


    /**
     * Creates new form Customer_Details_Reports
     */
    public Customer_Details_Reports() {
        
          connect();
        initComponents();
        this.setLocation(440,200);
        
    }
     public void connect(){
           try{
    
           /*Connection*/ con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flush_dry_cleaning_service","root","");
            System.out.println("Connection with Database Established");
            /*Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from login");*/
            stmt = con.createStatement();
         String sql = "SELECT * FROM prices";
         rs = stmt.executeQuery(sql);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection to the database has not been established successsfully." + e.getMessage());
            System.out.println("Error:"+e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_Reports = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        srch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Customer_Reports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Customer_Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customer_ReportsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customer_Reports);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Customer Details Report");

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(20, 20, 20)
                        .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back)
                        .addGap(115, 115, 115))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Customer_ReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customer_ReportsMouseClicked
          String sql = "SELECT * FROM customer_details ";
    
    try {
        
        stmt = (Statement) (java.sql.Statement) con.prepareStatement (sql);
        rs = (ResultSet) stmt.executeQuery (sql);
        Customer_Reports.setModel(DbUtils.resultSetToTableModel (rs));
        
    } catch (Exception exp) {
        
         System.out.println (exp);
           JOptionPane.showMessageDialog(null, "Error: " + exp.getMessage());
    }   // TODO add your handling code here:
    }//GEN-LAST:event_Customer_ReportsMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
 reports r = new reports();
           r.setVisible(true);
           dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String t=srch.getText ();
      String sql="select*from customer_details where Customer_ID like '"+t+"%'";
      try {
        
        stmt = (Statement) (java.sql.Statement) con.prepareStatement (sql);
        rs = (ResultSet) stmt.executeQuery (sql);
        Customer_Reports.setModel(DbUtils.resultSetToTableModel (rs));
        if(!rs.absolute (1)) {
        JOptionPane.showMessageDialog(null, "No results found");
        }
        
    } catch (Exception exp) {
        
         System.out.println (exp);
           JOptionPane.showMessageDialog(null, "Error: " + exp.getMessage());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String t=srch.getText ();
 String sql = "delete  from customer_details where Customer_ID ='"+srch.getText()+"'";
        try{

            stmt = (Statement) con.prepareStatement(sql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "DELETION SUCCESSFULL");

        } catch(SQLException | HeadlessException exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);

        }
        String sql2 = "Select * from customer_details";
        try{

            rs = (ResultSet) stmt.executeQuery(sql2);
            stmt = (Statement) con.prepareStatement(sql2);
            Customer_Reports.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);

        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Details_Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Details_Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Details_Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Details_Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Details_Reports().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable Customer_Reports;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField srch;
    // End of variables declaration//GEN-END:variables

    
}
