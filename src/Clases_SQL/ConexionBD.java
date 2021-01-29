/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class ConexionBD {
    
    //Variables para la conexion a la base de datos

    private final String base = "Registro_de_inscripcion_IUNIS";
    private final String user = "postgres";
    private final String password = "adminfile84";
    private final String url = "jdbc:postgresql://localhost:5432/" + base;
    private Connection Conectar = null;
    

    public Connection getConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            Conectar = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
              
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Conectar;

    }

}
