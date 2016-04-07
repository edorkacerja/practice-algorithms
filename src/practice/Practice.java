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
    
    public static void main(String[] args)
	{
            
            //for i : 1to1000
            //call function divisorSum(i)
                //for j : 1to1000
                //call function divisorSum(j)
                //if 1=2
                    //sum= sum + i + j
            int bigSum = 0;
//            for(int i = 1; i <=1000; i++){
//                int sumOfDiv = divisorSum(i);
//                int sumOfDiv2 = divisorSum(sumOfDiv);
//                if(sumOfDiv==sumOfDiv2){
//                    bigSum =bigSum + sumOfDiv + sumOfDiv2;
//                }
//            }
//            
//            System.out.println(bigSum);

System.out.println(divisorSum(220));
        }
        
        //function which returns the sum of the divisors of a number
            //for k: number-1 to 2
                //if number%k == 0
                    //sumDiv += k
        
        public static int divisorSum (int number){
            int sumOfDivisors = 0;
            for(int k = number-1; k>=2; k--){
                if(number%k == 0){
                    sumOfDivisors += k;
                }
            }
            return sumOfDivisors;
        }
    
    
}


