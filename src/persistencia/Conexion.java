/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;


import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard Rendón
 */
public class Conexion {
    
    
    public static java.sql.Connection getConnection(){
        
        java.sql.Connection conexion =null;
      
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes","root","");
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
        }catch(ClassNotFoundException | SQLException | HeadlessException ex){
            
            
             JOptionPane.showMessageDialog(null, "error de conexion" +ex);
            
        }return conexion;
        
    }
}

