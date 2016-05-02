
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;
import java.util.Stack;
import java.util.*;


/**
 *
 * @author Edor Kacerja
 */


public class Practice{
    
    public static ArrayList theFinal = new ArrayList();
    
    public static boolean compareArrayLists (List a, List b){
        Collections.sort(a);
        Collections.sort(b);      
        return a.equals(b);
    }
    
   public static void main(String[] args){
       
       for(int i=10; i<=99; i++){
           String firstNumber = Integer.toString(i);
           
           for(int j=10; j<=99; j++){
               String secondNumber = Integer.toString(j);
               int product = i*j;
               String myProduct = Integer.toString(product);
               
               if(product<=9999 && product>=1000){
                   
                   List productArray = new ArrayList();
                   List digitArray = new ArrayList();
                   
                   digitArray.add(firstNumber.charAt(0));
                   digitArray.add(firstNumber.charAt(1));
                   digitArray.add(secondNumber.charAt(0));
                   digitArray.add(secondNumber.charAt(1));
                   
                   for(int g=0; g<4; g++){
                       productArray.add(myProduct.charAt(g));
                   }
                   
                   if(compareArrayLists(digitArray, productArray)){
                       theFinal.add(myProduct);
                   }
                       
                   
                   
                   
               }


            }



        }
       
       System.out.println(theFinal);
    }     
}