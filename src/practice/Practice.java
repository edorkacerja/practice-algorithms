/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Vector;


/**
 *
 * @author AcerPC
 */


public class Practice {
    
   
    
    public static void main(String[] args){
        
        
        Random r = new Random(); 
        double randomDouble;
        double[][] myOtherArray = new double[20][6];
            for (int i=0; i<20; i++){
            for (int j = 0; j<6; j++){
                randomDouble = r.nextDouble()*100;
                myOtherArray[i][j] = randomDouble;
            }
        }
        
        
        
        
        
        TwoDimetionalArray edorsArray = new TwoDimetionalArray(myOtherArray, 20, 6);
           
        System.out.println(edorsArray.toString());
        System.out.println(edorsArray.colAverage(4));
        System.out.println(edorsArray.rowAverage(0));
        System.out.println(edorsArray.overallAverage());

        
        
           
            
        }
    
    
    
}

class TwoDimetionalArray {
    
    private double[][] data;
    private int cols;
    private int rows;
    
    public TwoDimetionalArray(double[][] data, int rows, int cols){
        this.data = data;
        this.rows = rows;
        this.cols = cols;
    }
    
    public double rowAverage(int rowNumber){
        double rowSum=0;
        for(int i = 0; i < cols; i++){
            rowSum += data[rowNumber][i];
        }
        
        return rowSum/cols;
    }
    
    public double colAverage(int colNumber){
        double colSum=0;
        for(int i = 0; i < rows; i++){
            colSum += data[i][colNumber];
        }
        
        return colSum/rows;
    }
    
    public double overallAverage(){
        double totalSum = 0;
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                totalSum += data[i][j];
            }
        }
        
        return totalSum/(rows*cols);
    }
}