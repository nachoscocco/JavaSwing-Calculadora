/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;



public class Control {
    
    
    //metodos
   
    
        public String unir ( char num , String visor){
        String retorno = String.valueOf(visor);
 
        
        
          StringBuilder concat = new StringBuilder();
                                   retorno= concat.append(visor).append(num).toString(); /// 
                                    
        
        return retorno;
    }    
    
    
}


