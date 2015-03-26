/**
 * File: Shape.java
 *
 * Abstract class that represents a 3D shape in a 3D space.
 *
 * Created by alina on 3/25/15.
 */
public class Shape {

    private Point3D coordinate;

    @Override
    public String toString() {
        return coordinate.toString();
    }
}
