/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;
import Logica.Control;
import Logica.Logica;

/**
 *
 * @author nacho
 */
public class IGU extends javax.swing.JFrame {

    /**
     * Creates new form IGU
     */
    public IGU() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visor = new javax.swing.JPanel();
        txtVisor = new javax.swing.JTextField();
        n9 = new javax.swing.JButton();
        sumOp = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        restOp = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        divOp = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        multiOp = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        igualOp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visor.setBackground(new java.awt.Color(187, 187, 187));
        visor.setForeground(new java.awt.Color(60, 60, 60));
        visor.setToolTipText("");

        txtVisor.setBackground(new java.awt.Color(187, 187, 187));
        txtVisor.setForeground(new java.awt.Color(60, 60, 60));
        txtVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout visorLayout = new javax.swing.GroupLayout(visor);
        visor.setLayout(visorLayout);
        visorLayout.setHorizontalGroup(
            visorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        visorLayout.setVerticalGroup(
            visorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        sumOp.setText("+");
        sumOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOpActionPerformed(evt);
            }
        });

        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        restOp.setText("-");
        restOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restOpActionPerformed(evt);
            }
        });

        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        divOp.setText("/");
        divOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divOpActionPerformed(evt);
            }
        });

        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        multiOp.setText("*");
        multiOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiOpActionPerformed(evt);
            }
        });

        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        igualOp.setText("=");
        igualOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualOpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divOp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(restOp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sumOp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiOp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(igualOp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumOp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restOp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiOp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divOp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igualOp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    Logica lo = new Logica();
    
    
    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
          if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n9.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n9.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num1);}
        
    }//GEN-LAST:event_n9ActionPerformed
    
    private void multiOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiOpActionPerformed
           if(!lo.sign){
        lo.sign = true;
        txtVisor.setText("");
        lo.operacion = '*';
        }
        else{
             txtVisor.setText("");
        }
    }//GEN-LAST:event_multiOpActionPerformed

    private void divOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divOpActionPerformed
          if(!lo.sign){
        lo.sign = true;
        txtVisor.setText("");
        lo.operacion = '/';
        }
        else{
              txtVisor.setText("");
          }
    }//GEN-LAST:event_divOpActionPerformed

    private void igualOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualOpActionPerformed
       
        if(lo.sign){
        
        switch(lo.operacion){
            case'+': 
                lo.result = lo.suma( lo.num1 , lo.num2);
              txtVisor.setText(String.valueOf(lo.result) );
                     System.out.println("resultado es " + lo.result);
                      ;
                
                    break;
            case'-': 
                lo.result = lo.resta( lo.num1 , lo.num2);
              txtVisor.setText(String.valueOf(lo.result) );
                     System.out.println("resultado - es " + lo.result);

                    break;
            case'*': 
                 lo.result = lo.multiplicacion( lo.num1 , lo.num2);
                 txtVisor.setText(String.valueOf(lo.result) );
                     System.out.println("resultado * es " + lo.result);
                    break;
            case'/': 
                 lo.result = lo.division( lo.num1 , lo.num2);
                 txtVisor.setText(String.valueOf(lo.result) );
                     System.out.println("resultado / es " + lo.result);
                    break;
                    
        }}
        
        else{}
     
      lo.result=0;
      lo.sign = false; 
      lo.operacion = ' ' ;
        
        
      
        
    }//GEN-LAST:event_igualOpActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
         if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n8.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n8.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num1);}
    }//GEN-LAST:event_n8ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n7.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n7.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num1);}
    }//GEN-LAST:event_n7ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n6.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n6.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num2);}
    }//GEN-LAST:event_n6ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
      if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n5.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n5.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num1);}
    }//GEN-LAST:event_n5ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
    if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n4.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n4.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num1);}
    }//GEN-LAST:event_n4ActionPerformed

    private void restOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restOpActionPerformed
        
        if(!lo.sign){
        lo.sign = true;
        txtVisor.setText("");
        lo.operacion = '-';
        }
        else{
             txtVisor.setText("");
        }
        
    }//GEN-LAST:event_restOpActionPerformed

    private void sumOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOpActionPerformed
        
          if(!lo.sign){
        lo.sign = true;
        txtVisor.setText("");
        lo.operacion = '+';
        }
        else{
           txtVisor.setText("");
        }
    }//GEN-LAST:event_sumOpActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
    if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n3.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n3.getText().charAt(0),  txtVisor.getText() ) );
      
    lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num1);}
    }//GEN-LAST:event_n3ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
     if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n2.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
          
       }
       else{
       Control ct = new  Control();
   
      txtVisor.setText(  ct.unir(n2.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num2 =Double.parseDouble( txtVisor.getText());
        System.out.println("valor 2 al tocar el boton "+ lo.num1);}
       
    }//GEN-LAST:event_n2ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
      
       if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n1.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
       }
       else{
       Control ct = new  Control();
    
      txtVisor.setText(  ct.unir(n1.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num2 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 2 al tocar el boton "+ lo.num1);}
        
    }//GEN-LAST:event_n1ActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
      
       if( !lo.sign ){ 
      Control ct = new  Control();
      
      txtVisor.setText(  ct.unir(n0.getText().charAt(0),  txtVisor.getText() ) );
      
     lo.num1 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 1 al tocar el boton "+ lo.num1);
       }
       else{
       Control ct = new  Control();
    
      txtVisor.setText(  ct.unir(n0.getText().charAt(0),  txtVisor.getText() ) );
      
      lo.num2 =Double.parseDouble( txtVisor.getText());
       System.out.println("valor 2 al tocar el boton "+ lo.num1);}
       
       
    }//GEN-LAST:event_n0ActionPerformed

    private void txtVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisorActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divOp;
    private javax.swing.JButton igualOp;
    private javax.swing.JButton multiOp;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton restOp;
    private javax.swing.JButton sumOp;
    private javax.swing.JTextField txtVisor;
    private javax.swing.JPanel visor;
    // End of variables declaration//GEN-END:variables
}
