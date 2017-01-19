/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabecario;

/**
 *
 * @author Javier
 */
public class beca {
public static void main(String args[]){
AlumnoRegular adrian = new AlumnoRegular();
adrian.setNombre("Adrian");
adrian.setBecass("Nacional, Estatal, Municipal");
adrian.serEstadoBeca("A,R");
adrian.setAceptado("A");
adrian.serRechazado("R");
 
Becasolocitada adrian = new Becasolicitada("Nacional","Estatal,Municipal");
adrian.intercambio();
adrian.becado();
adrian.ingresado();
}
}

