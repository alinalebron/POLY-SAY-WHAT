/**
 * File: Shape.java
 * <p/>
 * Abstract class that represents a 3D shape in a 3D space.
 * <p/>
 * Created by alina on 3/25/15.
 */
public abstract class Shape implements Comparable<Shape> {

    private Point3D coordinates; // (x,y,z) coordinates for the center of the shape


    /**
     * Constructs a 3D shape based on the
     * x , y , and z coordinates
     *
     * @param x
     * @param y
     * @param z
     */
    public Shape(int x, int y, int z) {

        coordinates = new Point3D(x, y, z);
    }


    /**
     * Method that takes the coordinates of the shape
     * and calculates the distance of the center
     * to the origin of the grid (0,0,0)
     *
     * @return
     */

    public double getCenter() {

        //Returns distance of the center of the shape to origin

        double originDistance = Math.sqrt((Math.pow(coordinates.getX(), 2.0))
                + (Math.pow(coordinates.getY(), 2.0)) + (Math.pow(coordinates.getZ(), 2.0)));

        return originDistance;
    }

    public abstract double getSurfaceArea();

    public abstract double getVolume();

    /**
     * Overridden toString() class that returns
     * a string containing the coordinates of the center
     * of the shape by calling the toString() class of the Point3D
     * class
     *
     * @return the center (x,y,z) coordinates of the shape
     */

    @Override
    public String toString() {
        return coordinates.toString();
    }


    /**
     * Overridden compareTo() method that compares
     * the volume of one shape to the other
     *
     * @param shape1 the 3D shape
     * @return true or false depending on if the volume
     * is greater, less than, or equal to each another shape
     */
    @Override
    public int compareTo(Shape shape1) {

        if (this.getVolume() < shape1.getVolume()) {
            return -1;
        } else if (this.getVolume() > shape1.getVolume()) {
            return 1;
        } else {

            return 0;
        }
    }
}
