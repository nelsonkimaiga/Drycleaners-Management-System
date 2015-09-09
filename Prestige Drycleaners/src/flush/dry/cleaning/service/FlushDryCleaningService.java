/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flush.dry.cleaning.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Nelson Kimaiga
 */
public class FlushDryCleaningService {

    /**
     * @param args the command line arguments
     */
     /* public void connectDB(){
        try{
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flush_drycleaning_service","root","");
            System.out.println("Connection with Database Established");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from login");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection to the database has not been established successsfully." + e.getMessage());
            System.out.println("Error:"+e);
        }

        
    
             } */
    
    public static void main(String[] args) {
        // TODO code application logic here
/*        Start_Page sp = new Start_Page();
        sp.setVisible(true);*/
             Connection conn = null;
             String url = "jdbc:mysql://localhost:3306/flush_dry_cleaning_service";
             String driver = "com.mysql.jdbc.Driver";
             String userName = "root";
             String password = "";
             Statement st;
             ResultSet rs;
             
             /**
     *
     * @return
     */
  
}
}
    
