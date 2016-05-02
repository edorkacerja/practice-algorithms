
package practice;

/**
 *
 * @author AcerPC
 */
public class GeometricFigure {
    private double perimeter;
    
    public GeometricFigure(){
        this(10.0);
    }
    
    public GeometricFigure(double line){
        this.perimeter = line;
    }
    
    public double getPerimeter(){
        return perimeter;
    }
    
    public void setPerimeter(double newPerimeter){
        this.perimeter = newPerimeter;
    }
    
}
