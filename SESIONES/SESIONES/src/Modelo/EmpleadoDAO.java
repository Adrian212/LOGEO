/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.sql.*;
/**
 *
 * @author Javier
 */
public class EmpleadoDAO {
    Conexion conexion;
    
    public EmpleadoDAO(){
        conexion = new Conexion();
    }


public Empleado verificaUsuario(String dni, String contraseña, String privilegio){
        Empleado empleado=null;
        Connection accesoDB = conexion.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from empleado where dni=? and pass=? and privilegio=?");
            ps.setString(1, dni);
            ps.setString(2, contraseña);
            ps.setString(3, privilegio);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               empleado = new Empleado();
               empleado.setDni(rs.getString(1));
               empleado.setContraseña(rs.getString(2));
               empleado.setApellidos(rs.getString(3));
               empleado.setNombres(rs.getString(4));
               empleado.setPrivilegio(rs.getString(5));
               return empleado;
            }
        } catch (Exception e) {
        }
        return empleado;
    }
}
