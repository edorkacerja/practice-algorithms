/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Vector;


/**
 *
 * @author AcerPC
 */
public class Practice {
    
    public static boolean isOrdered(double[] doubleArray, int numElements){
               double first = 0;
               for (int i=0; i < numElements; i++){
                   if(doubleArray[i]<first){
                       return false;
                   }else{
                       first = doubleArray[i];
                   }
                   
               }
               return true;
           };
    
    public static void main(String[] args){
        
        double[] doubleArray = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 5.8};
        int numberOfElements = doubleArray.length;
           
        System.out.println(isOrdered(doubleArray, numberOfElements));
           
           
            
        }
    
    
    
}