/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;
import java.util.Stack;
import java.util.*;


/**
 *
 * @author AcerPC
 */


public class Practice{
    
    static ArrayList aboundantNumbers = new ArrayList();
    static ArrayList sumsOfTwoAboundantNumbers = new ArrayList();
    static ArrayList numbers = new ArrayList();
    static ArrayList finalArray = new ArrayList();
    
    
    
    public static void populateArray(ArrayList arr){
        for (int i=1; i<=2813; i++){
            arr.add(i);
        }
    }
    
    
    
    public static int findSumOfDivisors (int input){
        
        int maxD = (int)Math.sqrt(input);
        int sum=1;
        for(int i = 2; i <= maxD; i++)
        {
            if(input % i == 0)
            {
               sum += i;
               int d = input/i;
               if(d!=i)
                  sum+=d;
            }
        }
        
        return sum;
    }
    
    public static void findAllPossibleSums(ArrayList theArray){
        for(int i=0; i<theArray.size();i++){
            for(int j=i; j<theArray.size(); j++){
                int number1 = (int)(theArray.get(i)); 
                int number2 = (int)(theArray.get(j));
                int sum = number1 + number2;
                
                if(sum > 2813){
                    
                }else{
//                    System.out.println(sum);
                    sumsOfTwoAboundantNumbers.add(sum);
                }
            }
        }
    }
    
    
    public static void findAboundantNumbers(int number){
        int sumOfDivisors = findSumOfDivisors(number);
        if (sumOfDivisors > number){
            aboundantNumbers.add(new Integer(number));
        }
    }
    
    public static int calculateSum(ArrayList arr){
        int sum = 0;
        for (Object o: arr){
            sum += (int)((Integer)o);
        }
        return sum;
    }


    
   
   public static void main(String[] args){
       populateArray(numbers);
       
       for(int i=1; i<=2813; i++){
           findAboundantNumbers(i);
       }
       
       findAllPossibleSums(aboundantNumbers);

       for(Object bs:sumsOfTwoAboundantNumbers){
        numbers.remove(bs);
       }
       
       
       
       
       System.out.println(calculateSum(numbers));
       
       
       
   }
}     

