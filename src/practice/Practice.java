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
       
       long total = 0;
       for(int n=3; n<=2000000; n+=2){
           if(isPrime(n)){
               total+=n;
           }
       }
       System.out.println(total);
       
   }

    private static boolean isPrime(int n) {
        for(int g = n -1; g>=2; g--){
            if(n%g==0){
                return false;
            }
            
        }
        return true;

    }
    
    
}









