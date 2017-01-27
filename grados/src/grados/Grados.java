/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados;

import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class Grados {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
 Scanner adwal= new Scanner(System.in);

float c,f;
System.out.println("Ingrese centigrados: ");
c= adwal.nextFloat();
f= 32 + (9*c/5);
System.out.println("\n ");
System.out.println("Centigrados A Fahrenheit: " + f);
        // TODO code application logic here
    }
    
}
