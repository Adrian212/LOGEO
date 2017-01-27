/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Vista.JFAdministrador;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author javier
 */
public class ControladorAdministrador implements ActionListener{
    JFAdministrador vistaAdministrador = new JFAdministrador();
    EmpleadoDAO modeloAdministrador = new EmpleadoDAO();
    Empleado  empleado = new Empleado();
    String dni, contraseña, privilegio;
    
    public ControladorAdministrador(JFAdministrador vistaAdministrador, EmpleadoDAO modeloAdministrador){
        this.vistaAdministrador=vistaAdministrador;
        this.modeloAdministrador=modeloAdministrador;
        this.vistaAdministrador.btnDatosAdministrador.addActionListener(this);
    }
    
    public void InicializaAdministrador(String dni, String contraseña, String privilegio){
        this.dni = dni;
        this.contraseña=contraseña;
        this.privilegio=privilegio;
    }
    
    public void actionPerformed(ActionEvent e){
        empleado = modeloAdministrador.verificaUsuario(dni, contraseña, privilegio);
        JOptionPane.showMessageDialog(vistaAdministrador, "DATOS DE USUARIO ADMINISTRADOR \n"+
                "Apellidos y Nombres: "+empleado.getApellidos()+", "+empleado.getNombres()+"\n"+
                "Privilegio: "+empleado.getPrivilegio());
    }
}
