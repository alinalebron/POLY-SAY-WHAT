/**
 * File: Shape.java
 *
 * Abstract class that represents a 3D shape in a 3D space.
 *
 * Created by alina on 3/25/15.
 */
public class Shape {

    private Point3D coordinates; // (x,y,z) coordinates for the center of the shape

    /**
     * Overridden toString() class that returns
     * a string containing the coordinates of the center
     * of the shape by calling the toString() class of the Point3D
     * class
     * @return the center (x,y,z) coordinates of the shape
     */

    @Override
    public String toString() {
        return coordinates.toString();
    }
}
