/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import static oracle.jrockit.jfr.events.Bits.length;

/**
 *
 * @author AcerPC
 */
public class Practice {
            
     
    
    public static void main(String[] args) {
        
        int number = 100;
        int n=1;
        boolean numberFound = false;
        
        for(n=1; n<=20; n++){
            if (number%n == 0){
              continue;
            }else{
                number++;
                n=1;
            }
            
        
        
        
        }
        
        System.out.print(number);
        
    }
        
    
    
}
