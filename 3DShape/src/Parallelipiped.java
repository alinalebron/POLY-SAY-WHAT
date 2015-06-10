/**
 * File: Parallelipiped.java
 *
 * A subclass that represents a cube by extending the Shape abstract class.
 *
 * I affirm that this program is entirely my own work and none of it is the work
 * of any other person. Created by @AlinaLebron on 3/25/15.
 */

public class Parallelipiped extends Shape
{

    private int length;
    private int width;
    private int height;
    
    /**
     * Constructs the parallelipiped with x,y,z coordinates and the radius
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param z Z coordinate
     * @param width width
     * @param height height
     */

    public Parallelipiped(int x, int y, int z, int length, int width, int height)
    {
        super(x, y, z);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Overridden surfaceArea method to calculate the surface area of a cube
     *
     * Formula: 2(l*w) + 2(l*h) + 2(w*h)
     *
     * @return the surface area
     */
    
    @Override
    public double getSurfaceArea()
    {
        return (2 * length * width) + (2 * length * height)
                + (2 * width * height);
    }
    
    /**
     * Overridden volume method to calculate the volume of a cube
     *
     * Formula: (l * w * h)^3
     *
     * @return the volume of the cube
     */

    @Override
    public double getVolume()
    {
        return length * width * height;
    }
    
    /**
     * Overridden toString method to return the name of the class, the center,
     * radius, and height of the cube
     *
     * @return class name, center, length, width, height
     */

    @Override
    public String toString()
    {
        return "The " + getClass().getCanonicalName() + " center:\n "
                + super.toString() + "\n -- Length of  "
                + length + "\n -- Width of  " + width
                + "\n -- Height of " + height;
    }

}
