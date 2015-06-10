/**
 * Created by alina on 3/27/15.
 */
public class Parallelipiped extends Shape {

    private int length;
    private int width;
    private int height;

    public Parallelipiped(int x, int y, int z, int length, int width, int height) {
        super(x, y, z);
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    public double getSurfaceArea() {
        return (2 * length * width) + (2 * length * height)
                + (2 * width * height);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "The " + getClass().getCanonicalName() + " has a center at "
                + super.toString() + ", a length of  " +
                length + ", a width of " + width +
                " and a height of " + height + ".";
    }


}
