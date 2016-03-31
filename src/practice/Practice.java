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
            int total = 2; 
            
            int n =1;
            int k =2;
            
            while(n<4000000 && k<4000000){
                n=n+k;
                if(n%2==0){
                    total+=n;
                }
                
                k=k+n;
                if(k%2 == 0){
                    total+=k;
                }
            }
            
            System.out.println(total);

    }
    
}
