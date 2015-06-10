
/**
 * File: Cylinder.java
 *
 * A subclass that represents a cylinder by extending the Shape abstract class.
 *
 * I affirm that this program is entirely my own work and none of it is the work
 * of any other person. Created by @AlinaLebron on 3/25/15.
 */

public class Cylinder extends Shape
{

    private int radius; // radius
    private int height; // height

    /**
     * Constructs the cylinder with x,y,z coordinates and the radius
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param z Z coordinate
     * @param radius radius
     * @param height height
     */
    public Cylinder(int x, int y, int z, int radius, int height)
    {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }

    /**
     * Overridden surfaceArea method to calculate the surface area of a cylinder
     *
     * Formula: 2 * PI * radius^2 + 2 * PI * radius * height
     *
     * @return the surface area
     */
    @Override
    public double getSurfaceArea()
    {
        return (2 * (Math.PI * Math.pow(radius, 2)))
                + (2 * (Math.PI * radius * height));
    }

    /**
     * Overridden volume method to calculate the volume of a cylinder
     *
     * Formula: PI * radius^2 * height
     *
     * @return the volume of the cylinder
     */
    @Override
    public double getVolume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Overridden toString method to return the name of the class, the center,
     * radius, and height of the cylinder
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
