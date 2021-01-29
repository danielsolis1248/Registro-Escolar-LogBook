/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author aleja
 */
//public class Conexion_BD {
//    
//    public static String url = "jdbc:postgresql://127.0.0.1/Prueba_de_conexion?";
//    public static String usuario = "postgres";
//    public static String contraseña = "adminfile84";
//    public static String clase = "org.postgresql.Driver";
//    
//    public static Connection conectar (){
//        Connection conexion = null;
//        
//        try {
//            Class.forName(clase);
//            conexion = DriverManager.getConnection(url, usuario, contraseña);
//            System.out.println("Conexion de base de datos establecida con exito :D");
//        
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Error de conexion de base de datos :C " + e);
//        }
//        return conexion;
//    } 
//}
