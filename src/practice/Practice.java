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
    
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger numberTwo = BigInteger.valueOf(2);
        
        BigInteger sum = numberTwo.pow(1000);
        
//        System.out.print(sum.pow(15));
        
        
        
        
        
        int totalSumOfDigits = 0;
        
        int digits = getDigitCount(sum);
        String sumAsString = "" + sum;
        
        
        
        for(int i=0; i<digits; i++){
            int x = Character.getNumericValue(sumAsString.charAt(i));
            totalSumOfDigits += x;

        }
        
        System.out.println(totalSumOfDigits);
        
        
        
    }
    
    public static int getDigitCount(BigInteger number) {
  double factor = Math.log(2) / Math.log(10);
  int digitCount = (int) (factor * number.bitLength() + 1);
  if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
    return digitCount - 1;
  }
  return digitCount;
}
   
    
    
}


