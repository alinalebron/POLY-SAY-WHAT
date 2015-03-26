/**
 * File: Point3D.java
 *
 * Represents a point in a 3D space
 * Created by alina on 3/25/15.
 */
public class Point3D {

    private int x; // represents x-coordinate
    private int y; // represents y-coordinate
    private int z; // represents z-coordinate

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "The coordinates are " + getX() + ", " + getY() + ", " + getZ();
    }
}
