/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class Connection {

    /**
     *
     * @return
     */
    public static Connection getCon(){
        Connection  con = null;
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver") ;
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/billingg","root"," ");
             return con;
          
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
            
        }
        return con;
    
    
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
  
