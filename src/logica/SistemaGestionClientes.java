/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import java.sql.SQLException;
import persistencia.ClienteRepositorio;
import vista.Formulario;


/**
 *
 * @author Usuario
 */
public class SistemaGestionClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Formulario vista = new Formulario();
        vista.show();
        vista.setLocationRelativeTo(null);
    
    }
    
}
