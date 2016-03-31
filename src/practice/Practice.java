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

    
    public static void main(String[] args) {
            int total = 0; 
            
            for (int i=1; i<1000; i++){
                if (i%3 == 0){
                    total+=i;
                }else if(i%5 == 0){
                    total+=i;
                }
            }
            
            System.out.println(total);

    }
    
}
