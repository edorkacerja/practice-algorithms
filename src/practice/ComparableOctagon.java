
package practice;

/**
 *
 * @author AcerPC
 */
public class ComparableOctagon extends Octagon implements Comparable {

    
    public ComparableOctagon(){
        super();
    }
    
    public ComparableOctagon(double side){
        super(side);
    
    }

    @Override
    public int compareTo(Object o) {
//        setPerimeter();
        
        double per1 = getPerimeter();
        double per2 = ((ComparableOctagon)o).getPerimeter();
        
        if(per1>per2)
            return 1;
        else if(per1==per2)
            return 0;
        else
            return -1;
    
    }
    
    
    
}
