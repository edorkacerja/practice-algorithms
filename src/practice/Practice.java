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
        
        int n = 999;
            int res = n*n;
            String resultString = Integer.toString(res);
            int length = resultString.length();
        
        int i = 0;
        
        //9801
        
        for (int edor = 0; edor <(length/2)+1; edor++){
            if(resultString.charAt(i) == resultString.charAt(length-1)){
                i++;
                length--;
                System.out.println(" palindrome");
            }else{
                System.out.println("not palindrome");
                n--;
                res= n*n;
                i=0;
                resultString = Integer.toString(res);
                length = resultString.length();
                edor = -1;
                
            }
        }
        
        System.out.println(n);
        System.out.println(res);
        
        
        
        
        boolean isPalindrome = false;
        
        
//        while (isPalindrome == false){
//            
//            result = n*n;
//            outerloop: for(int v=1; v<(length/2)+1; v++){
//                
//            
//                if( resultString.charAt(i) == resultString.charAt(length-1) ){
//                    i++;
//                    length--;
//                    
//
//                }else{
//                    n--;
                      
//                    break outerloop;
//                }
//                
//                System.out.print(result);
//                isPalindrome = true;
//                
//                
//            }
//
//        }
        
        

    }
    
}
