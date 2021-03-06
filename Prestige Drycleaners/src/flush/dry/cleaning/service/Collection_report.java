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
public class Collection_report extends javax.swing.JFrame {
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
     * Creates new form Collection_report
     */
    public Collection_report() {
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
         String sql = "SELECT * FROM collection";
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        collection = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        srch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel1.setText("Collection Report");

        collection.setModel(new javax.swing.table.DefaultTableModel(
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
        collection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(collection);

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(208, 208, 208)
                        .addComponent(jButton1)
                        .addContainerGap(170, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Search)
                        .addGap(42, 42, 42)
                        .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search)
                    .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void collectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectionMouseClicked
           String sql = "SELECT * FROM collection ";
    
    try {
        
        stmt = (Statement) (java.sql.Statement) con.prepareStatement (sql);
        rs = (ResultSet) stmt.executeQuery (sql);
        collection.setModel(DbUtils.resultSetToTableModel (rs));
        
    } catch (Exception exp) {
        
         System.out.println (exp);
           JOptionPane.showMessageDialog(null, "Error: " + exp.getMessage());
    }
                 // TODO add your handling code here:
    }//GEN-LAST:event_collectionMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
 String t=srch.getText ();
      String sql="select*from collection where Customer_ID like '"+t+"%'";
      try {
        
        stmt = (Statement) (java.sql.Statement) con.prepareStatement (sql);
        rs = (ResultSet) stmt.executeQuery (sql);
        collection.setModel(DbUtils.resultSetToTableModel (rs));
        if(!rs.absolute (1)) {
        JOptionPane.showMessageDialog(null, "No results found");
        }
        
    } catch (Exception exp) {
        
         System.out.println (exp);
           JOptionPane.showMessageDialog(null, "Error: " + exp.getMessage());
    
    // TODO add your handling code here:
    }         // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
reports r = new reports();
           r.setVisible(true);
           dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String t=srch.getText ();
 String sql = "delete  from collection where Customer_ID ='"+srch.getText()+"'";
        try{

            stmt = (Statement) con.prepareStatement(sql);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "DELETION SUCCESSFULL");

        } catch(SQLException | HeadlessException exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);

        }
        String sql2 = "Select * from collection";
        try{

            rs = (ResultSet) stmt.executeQuery(sql2);
            stmt = (Statement) con.prepareStatement(sql2);
            collection.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(Collection_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Collection_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Collection_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Collection_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Collection_report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JTable collection;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField srch;
    // End of variables declaration//GEN-END:variables

   
}
