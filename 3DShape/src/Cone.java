
/**
 * File: Cone.java
 *
 * A subclass that represents a cone by extending the Shape abstract class.
 *
 * I affirm that this program is entirely my own work and none of it is the work
 * of any other person. Created by @AlinaLebron on 3/25/15.
 */

public class Cone extends Shape
{

    private int height; // height
    private int radius; // radius

    /**
     * Constructs the cone with x,y,z coordinates and the radius
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param z Z coordinate
     * @param radius radius
     * @param height height
     */
    public Cone(int x, int y, int z, int height, int radius)
    {
        super(x, y, z);
        this.height = height;
        this.radius = radius;
    }

    /**
     * Overridden surfaceArea method to calculate the surface area of a cone
     *
     * Formula: PI * radius ( radius + slant height)
     *
     * @return the surface area
     */
    @Override
    public double getSurfaceArea()
    {

        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));

        return Math.PI * radius * (radius + slantHeight);
    }

    /**
     * Overridden volume method to calculate the volume of a cone
     *
     * Formula: (PI * radius^2 * height )/3
     *
     * @return the volume of the cone
     */
    @Override
    public double getVolume()
    {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }

    /**
     * Overridden toString method to return the name of the class, the center,
     * radius, and height of the cone
     *
     * @return class name, center, radius, height
     */
    @Override
    public String toString()
    {
        return "The " + getClass().getCanonicalName() + " center:\n "
                + super.toString() + "\n -- Radius of  "
                + radius + "\n -- Height of  " + height;
    }
}
