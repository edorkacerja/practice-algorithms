/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author AcerPC
 */
public class Practice {
    int count = 0;

static List<String> myArray = new ArrayList<String>();

    
        
        public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";
       List<Integer> myArray = new ArrayList<Integer>();
       for (i = 1; i <= 110012; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     myArray.add(i);
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(myArray.get(10000));
   }
    
    
}









