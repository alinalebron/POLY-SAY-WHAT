/**
 * Created by alina on 3/27/15.
 */
public class Cylinder extends Shape {

    private int radius;
    private int height;

    public Cylinder(int x, int y, int z, int radius, int height) {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }


    @Override
    public double getSurfaceArea() {
        return (2 * (Math.PI * Math.pow(radius, 2)))
                + (2 * (Math.PI * radius * height));
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "The " + getClass().getCanonicalName() + " has a center at "
                + super.toString() + ", a radius of  " +
                radius + " and a height of " + height + ".";
    }
}
