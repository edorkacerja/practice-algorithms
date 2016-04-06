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
        
        int[][] G = {{3},{7, 4},{2, 4, 6}, {8, 5, 9, 3}};
        int biggestSum=0;
        
        for(int j=0; j<G.length; j++){
            int sum =0;
            for(int i=0; i<G[j].length; i++){
                sum+=G[j][i];
            }
            if(sum>biggestSum){
                biggestSum=sum;
            }
        }
        
        System.out.println(biggestSum);
                    
}
   
    
    
}


