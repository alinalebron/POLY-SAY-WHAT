/**
 * Created by alina on 3/28/15.
 */

import java.util.Arrays;

public class ShapeTester {


    public static void main(String[] args) {


        ShapeDistanceComparator comparator = new ShapeDistanceComparator();

        Sphere sphere = new Sphere(2, -8, 5, 13);
        Parallelipiped parallelipiped = new Parallelipiped(7, 2, 9, 37, 12, 9);
        Cylinder cylinder = new Cylinder(3, -4, 5, 11, 13);
        Cone cone = new Cone(-5, 2, -1, 10, 14);

        Shape[] list = new Shape[4];

        list[0] = sphere;
        list[1] = parallelipiped;
        list[2] = cylinder;
        list[3] = cone;

        System.out.println("The array of shapes:\n");

        print(list);

        Arrays.sort(list);

        System.out.println("The array of shapes sorted by ascending volume:\n ");

        for (Shape list1 : list) {
            System.out.println("The " + list1.getClass().getCanonicalName() + " has a volume of " + list1.getVolume() + " units^3.\n\n");
        }

        Arrays.sort(list, comparator);

        System.out.println("The array of shapes sorted by descending distance from origin: ");


        for (Shape list1: list ){
            System.out.println("The " + list1.getClass().getCanonicalName() + " has a distance of " + list1.getCenter() + " units from origin.\n\n");
        }



    }

    public static void print(Shape[] list) {
        for (Shape list1 : list) {
            System.out.println("Shape's information: \n" + list1.toString() + "\n It also has a surface area of " + list1.getSurfaceArea() + " units^2 and a volume of " + list1.getVolume() + " units^3.");
        }
    }
}

