/**
 * File: ShapeDistanceComparator.java
 * 
 * Overridden Comparator class that sorts the
 * distance of the center of a shape from the origin of a 3D grid (0,0,0)
 */

import java.util.Comparator;

public class ShapeDistanceComparator implements Comparator<Shape>
{

    /**
     * Overridden compare method that gets the center
     * of each shape
     * @param s1 shape 1
     * @param s2 shape 2
     * @return 1 if the first shape is less than the second shape, -1 if 
     * it is greater, or 0 if they are equal
     */
    
    @Override
    public int compare(Shape s1, Shape s2)
    {

        double center1 = s1.getCenter();
        double center2 = s2.getCenter();

        if ( center1 < center2 )
        {
            return 1;
        }
        else if ( center1 > center2 )
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
