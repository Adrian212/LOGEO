/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.sql.*;

public class Conexion {
    public Conexion() {
    }

    public Connection getConexion(){
        Connection con=null;
        try{
           
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba","root","");
        }catch(SQLException ex){
        }catch(Exception e){   
        }
        return con;
    } 
}

