
package practice;

/**
 *
 * @author AcerPC
 */
public class Octagon extends GeometricFigure{
    
    public Octagon(){
        this(10.0);
    }
    
    public Octagon(double side){
        setPerimeter(side*8);
    }
    
}
