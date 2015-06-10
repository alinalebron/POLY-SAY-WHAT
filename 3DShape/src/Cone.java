/**
 * Created by alina on 3/27/15.
 */

public class Cone extends Shape {

    private int height;
    private int radius;


    public Cone(int x, int y, int z, int height, int radius) {
        super(x, y, z);
        this.height = height;
        this.radius = radius;
    }


    @Override
    public double getSurfaceArea() {

        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));

        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }

    @Override
    public String toString() {
        return "The " + getClass().getCanonicalName() + " has a center at "
                + super.toString() + ", a radius of  " +
                radius + " and a height of " + height + ".";
    }
}
