/**
 * Created by alina on 3/27/15.
 */
public class Sphere extends Shape {

    private int radius;

    public Sphere(int x, int y, int z, int radius) {
        super(x, y, z);
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * (Math.PI * Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return "The " + getClass().getCanonicalName() + " has a center at "
                + super.toString() + " and a radius of  " +
                radius + ".";
    }

}
