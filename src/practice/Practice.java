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
    
    
        
       
	
	public static void main(String[] args)
	{
            int count = 0;
            int bestNumber = 0;
            int biggest = 0;
            
            
            for(int number=10; number<1000000; number++){
                count = 0;
                biggest = 0;
                bestNumber = number;
                
                while(number != 1){
                    if (number %2 == 0){
                        number = number / 2;
                    }else{
                        number = 3*number -1;
                    }
                    count++;
                }
                
                if(count>=biggest){
                    biggest = count;
                    System.out.println(bestNumber);
                }
                
            }
	}


   
    
    
}









