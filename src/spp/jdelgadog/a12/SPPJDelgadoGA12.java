/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a12;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             inicio();
        double l,imc;
        int w;
        w=solicitarPeso();
        l=solicitarEstatura();
        imc= w / Math.pow(l, 2);
        if(imc<18.5){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null,"Usted esta con desnutrición");
        }
        if(imc>=18.5 && imc<=25){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null,"Usted se encuentra en el rango aceptable");
        }
        if(imc>25){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null,"Usted está en obesidad");
        }
    }
   
    
    public static void inicio(){
        JOptionPane.showMessageDialog(null, "¿Desea calcular su IMC?");
    }



    public static int solicitarPeso(){
        JFrame frame = new JFrame();
        int peso=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, "Ingrese su peso (en kilogramos): ");
                peso =Integer.parseInt(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Inténtelo de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
                flag=true;
            }
        }while(flag==true);
        return peso;
    }
    
    
    public static double solicitarEstatura(){
        JFrame frame = new JFrame();
        double e=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, "Ingrese su estatura (en metros): ");
                e =Double.parseDouble(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Inténtelo de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
        flag=true;
            }
        }while(flag==true);
        return e;
    }
}