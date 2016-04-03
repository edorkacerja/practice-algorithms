/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author AcerPC
 */
public class Practice {
    
    
        
        public static void main (String[] args)
   {
       int a=1, b=1, c=1;
       
       for(a = 1; a<=1000; a++){
           for(b=1; b<=1000; b++){
               for(c=1;c<=1000;c++){
                   if((a*a + b*b == c*c) && a+b+c==1000){
                       System.out.println(a*b*c);
                   }
               }
           }
       }
       
       
   }
    
    
}









