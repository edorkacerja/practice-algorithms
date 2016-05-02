
package practice;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author Edor Kacerja
 */


public class Practice{
    
   public static void main(String[] args){
       ComparableOctagon octagon1 = new ComparableOctagon(8.0);
       ComparableOctagon octagon2 = new ComparableOctagon();
       
       System.out.println(octagon1.compareTo(octagon2));
       
       
    }     
}