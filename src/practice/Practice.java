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

    
    public static void main(String[] args) {
            
            

//            The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?
            List<Integer> edorsArray = new ArrayList<Integer>();
            long result = 600851475143L;
            int i = 2; 
            
            while (result != 1){
                if (result%i == 0){
                    result = result/i;
                    edorsArray.add(i);
                }else{
                    i++;
                }
            }
            
            System.out.print(edorsArray);
            for (int j=0; j<edorsArray.size();j++){
                System.out.println(edorsArray.get(j));
            }

    }
    
}
