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
    
    public static void main(String[] args){
           Random randomGenerator = new Random();
           Vector myVector = new Vector(100);
           double randomDouble; 
           
           for(int i = 0; i<100; i++){
               randomDouble = randomGenerator.nextDouble()*100;
               Double myDoubleObject = randomDouble;
               myVector.add(myDoubleObject);
           }
           
           System.out.println(myVector);

            
            
            
            
            
        }
    
    
}