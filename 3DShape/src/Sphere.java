
/**
 * File: Sphere.java
 *
 * A subclass that represents a sphere by extending the Shape abstract class.
 *
 * I affirm that this program is entirely my own work and none of it is the work
 * of any other person. Created by @AlinaLebron on 3/25/15.
 */

public
        class Sphere extends Shape
{

    private
            int radius; // radius of the sphere

    /**
     * Constructs the sphere with x,y,z coordinates and the radius
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param z Z coordinate
     * @param radius radius
     */
    public Sphere(int x, int y, int z, int radius)
    {
        super(x, y, z);
        this.radius = radius;
    }

    /**
     * Overridden surfaceArea method to calculate the surface area of a sphere
     *
     * Formula: 4 * PI * radius^2
     *
     * @return the surface area
     */
    @Override
    public double getSurfaceArea()
    {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Overridden volume method to calculate the volume of a sphere
     *
     * Formula: 4/3 * PI * radius^3
     *
     * @return the volume of the sphere
     */
    @Override
    public double getVolume()
    {
        return (4.0 / 3.0) * (Math.PI * Math.pow(radius, 3));
    }

    /**
     * Overridden toString method to return the name of the class, the center
     * and radius of the sphere
     *
     * @return class name, center, radius
     */
    @Override
    public String toString()
    {
        return "The " + getClass().getCanonicalName() + " center:\n "
                + super.toString() + "\n -- Radius of  "
                + radius;
    }

}
