/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import static oracle.jrockit.jfr.events.Bits.length;

/**
 *
 * @author AcerPC
 */
public class Practice {
            
     
    
    public static void main(String[] args) {
        
        int SquareOfSum = 0;
        int SumOfSquares = 0;
        int diff = 0;
        
        for (int n =1; n<=100; n++){
            SumOfSquares+=n*n;
        }
        for (int n = 1; n<=100; n++){
            SquareOfSum+=n;
        }
        SquareOfSum*=SquareOfSum;
        
        diff=SumOfSquares-SquareOfSum;
        
        System.out.print(diff);
        
    }
        
    
    
}
