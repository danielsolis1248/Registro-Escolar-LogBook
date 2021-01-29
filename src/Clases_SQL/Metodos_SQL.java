/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_SQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author aleja
 */
//public class Metodos_SQL {
//
//    public static Conexion_BD conexion = new Conexion_BD();
//    public static PreparedStatement sentencia_preparada;
//    public static ResultSet resultado;
//    public static String sql;
//    public static int resultado_numero = 0;
//
//    public int guardar(String nombre, String contraseña) {
//        int resultado = 0;
//        Connection conexion = null;
//        String sentencia_guardar = ("INSERT INTO usuarios (Nombre, Contraseña) VALUES (?,?)");
//        
//
//        try {
//            conexion = Conexion_BD.conectar();
//            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
//            sentencia_preparada.setString(1, nombre);
//            sentencia_preparada.setString(2, contraseña);
//
//            resultado = sentencia_preparada.executeUpdate();
//            sentencia_preparada.close();
//
//            System.out.println("Conexion con tabla Usuarios establecida con exito :D");
//        } catch (Exception error) {
//
//            System.out.println("Error de conexion con la tabla de Usuarios :C" + error);
//        }
//
//        return resultado;
//    }
//
//}
