/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;




/**
 *
 * @author AcerPC
 */
public class Practice {
    
    public static void main(String[] args) throws FileNotFoundException
	{
            
            
            String[] names;
            
            long total = 0;
            try{
            String line;
                InputStream fis = new FileInputStream("names.txt");
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
            {
                while ((line = br.readLine()) != null) {

                    line = line.replace("\"", "");
                    names = line.split(",");
                    
                    Arrays.sort(names);
                    for (int i=0; i<names.length; i++){
                        int product =1;
                        int integerValue = 0;
                        int totalIntegerValue=0;
                        //calculate integer value
                        char[] ch  = names[i].toCharArray();
                        for(char c : ch)
                        {
                            
                            int temp = (int)c;
                            int temp_integer = 64; //for upper case
                            if(temp<=90 & temp>=65){
                                integerValue = temp - temp_integer;
                                totalIntegerValue += integerValue;
                            }
                        }
                        //calculate product = value*position
                        product = totalIntegerValue * (i+1);
                        //add product to total
                        total+=product;
                        System.out.println(total);
                    }
                }
            }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            
            
            
            
        }
    
    
}