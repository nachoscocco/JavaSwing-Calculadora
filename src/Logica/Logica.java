/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import IGU.IGU;

/**
 *
 * @author nacho
 */
public class Logica {

    
    public double num1;
    public double num2;
    public double result;
    public boolean sign = false; 
    public char operacion ;
    
    public static void main(String[] args) {
        
      IGU panel = new IGU();
      panel.setVisible(true);
      panel.setLocationRelativeTo(null);
      
        
        
    }
    
    public double suma(double numer1 , double numer2){
        
        
       this.num1 = numer1 + numer2;
        System.out.println("numero 1 "+numer1);
        
        System.out.println("numero 2 "+numer2);
        System.out.println("resultado adentro de funcion suma"+ result) ;
        this.result=this.num1; 
    return num1;
    }
    public double resta(double numer1 , double numer2){
    
       this.num1 = numer1 - numer2;
        System.out.println("numero 1 "+numer1);
        
        System.out.println("numero 2 "+numer2);
        System.out.println("resultado adentro de funcion suma"+ result) ;
       this.result=this.num1;  
    return num1;
    }
    public double multiplicacion(double numer1 , double numer2){
    
       this.num1 = numer1 * numer2;
        System.out.println("numero 1 "+numer1);
        
        System.out.println("numero 2 "+numer2);
        System.out.println("resultado adentro de funcion suma"+ result) ;
        this.result=this.num1;
    return num1;
    }
    public double division(double numer1 , double numer2){
    
       this.num1= numer1 / numer2;
        System.out.println("numero 1 "+numer1);
        
        System.out.println("numero 2 "+numer2);
        System.out.println("resultado adentro de funcion suma"+ result) ;
         this.result=this.num1;
    return num1;
     
    }
    
    
     
    
}
