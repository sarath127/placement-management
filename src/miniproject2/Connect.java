package miniproject2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarath
 */
import java.sql.*;
import javax.swing.*;
public class Connect {
Connection con=null;
public static Connection ConnectDB(){
    
               try{
           
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/place","root","apple");
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
               
}
}
