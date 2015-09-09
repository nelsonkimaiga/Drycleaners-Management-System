/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flush.dry.cleaning.service;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet; 
import javax.swing.JOptionPane;

/**
 *
 * @author Kimaiga
 */
public class DbConn {
     Connection conn = null;
             String url = "jdbc:mysql://localhost:3306/flush_dry_cleaning_service";
             String dbName = "flush";
             String driver = "com.mysql.jdbc.Driver";
             String userName = "root";
             String password = "";
             Statement st;
             ResultSet rs;
             
             /**
     *
     * @return
     */
    public  static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            System.out.println("Connection with Database Established");
            
            return conn;

    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection to the database has not been established successsfully." + e.getMessage());
            System.out.println("Error:"+e);
            return null;
        }

        
    
             }
    public static void main(String[] args) {
       
  
            }
}
