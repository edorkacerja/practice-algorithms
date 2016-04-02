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
    int count = 0;

static List<String> myArray = new ArrayList<String>();

    
        
        public static void main (String[] args)
   {		
       
       int SS = 0;
       int SoS = 0;
       int res = 0;
       
       for (int n=1; n<=100; n++){
           SS += n*n;
           SoS += n;
       }
       
       res = SoS*SoS - SS;
       
       System.out.println(res);
       
       
   }
    
    
}









