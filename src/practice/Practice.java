/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.math.BigInteger;
import java.util.LinkedList;




/**
 *
 * @author AcerPC
 */
public class Practice {
                public static BigInteger  product = new BigInteger("1");

        public static void main(String[] args)
	{
            long  product2 = 1;
            int n = 40;
            long  result = 1;
            
            for(long k=1; k<=n; k++){
                product = product.multiply(product);
            }
            
            for(int i=1; i<=20; i++){
                product2 *= i;
            } 
            
//            result = product / (product2*product2);
            System.out.println(product);
            System.out.println(product2);
            System.out.println(result);
            
            
            
            
            
            
        }


   
    
    
}









