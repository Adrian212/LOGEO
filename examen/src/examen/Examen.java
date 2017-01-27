/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int r;
        
        
        
        
        
        String str;
        
        str=JOptionPane.showInputDialog("ingrese valor a");
        a = Integer.parseInt(str);
        
        str=JOptionPane.showInputDialog("ingrese valor b");
        b = Integer.parseInt(str);
        
        
        r=a+b;
        JOptionPane.showMessageDialog(null,"la suma de a+b es : "+r);
        
        r=a*b;
        JOptionPane.showMessageDialog(null,"la multiplicacion de a*b es : "+r);
        
        
        r=a-b;
        JOptionPane.showMessageDialog(null,"la resta de a-b es : "+r);
        
        
        r=a/b;
        JOptionPane.showMessageDialog(null,"la divicion de a/b es : "+r);
        // TODO code application logic here
        int op = 0;
        
        while(op!= JOptionPane.CANCEL_OPTION){
            
        }
        
    }
    
}
