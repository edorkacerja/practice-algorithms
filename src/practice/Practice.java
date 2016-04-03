/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;




/**
 *
 * @author AcerPC
 */
public class Practice {
    
    
        
        public static void main (String[] args)
   {
       int finalNumber = 0;
       int count = 0;
       
       for (int i=1; i<=5000; i++){
           finalNumber += i;
           
           System.out.println(finalNumber);  
           
       
            for (int n=finalNumber; n>=1; n--){
                        if(finalNumber%n == 0){
                            count++;
                            if (count >=500){
                                System.out.print("SUCCESSS");
                                System.out.println(finalNumber);
                            }
                        }
            }

       }
       
       
   }

   
    
    
}









