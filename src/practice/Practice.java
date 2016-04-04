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
    
        public static int biggest = 0;
       
	
	public static void main(String[] args)
	{
            int count = 0;
            int bestNumber = 0;
            
            
            
            for(int number=999999; number>13; number--){
                count = 0;
                
                bestNumber = number;
                
                while(bestNumber != 1){
                    
                    if (bestNumber %2 == 0){
                        bestNumber = bestNumber / 2;
                    }else if(bestNumber %2 == 1){
                        bestNumber = 3*bestNumber +1;
                    }
                    count++;
//                    System.out.println(bestNumber);
                }

                if(count>=biggest){
                    biggest = count;
                    System.out.println(biggest);
                    count = 0;
                    System.out.println(number);
                }
                
            }
	}


   
    
    
}









