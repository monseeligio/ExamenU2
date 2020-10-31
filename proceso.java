/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gama
 */
public class proceso {
    
          List lista = new ArrayList();
          List lista2 = new ArrayList();

    public int par(int contpar, int contimpar){
     Scanner lector = new Scanner(System.in);      
      if (contpar<5 && contimpar<5){
         System.out.println("inserte numero");
         int num;
         num= lector.nextInt();
         if (num%2==0){
          lista.add(num);
         }
         
         else{
          lista2.add(num);
                 }
                 
         
      par(contpar+1, contimpar+1);
      }
      return contpar;
        }
    
  
    
    public void mostrar(){
      for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(i+"."+lista.get(i));
}  
    
    } 
