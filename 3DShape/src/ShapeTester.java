/**
 * File: ShapeTester.java
 *
 * Shape Main Class that creates an array of shapes,
 * prints out the list of shapes with all of the info,
 * then prints out a list of shapes in ascending volume order
 * and another list in descending distance from the origin.
 * 
 * I affirm that this program is entirely my own work and none of it is the work
 * of any other person. Created by @AlinaLebron on 3/25/15.
 */

import java.util.Arrays;

public class ShapeTester
{

    public static void main(String[] args)
    {
        
        /*Creates new comparator for comparing the distance*/
        
        ShapeDistanceComparator comparator = new ShapeDistanceComparator();
        
        /*Creates new shapes with all of the parameters needed to fill 
        the array, then fills a new array, and prints out that array
        */
        
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
        
        /* Sorts the array by ascending volume then prints it */

        Arrays.sort(list);

        System.out.println("The array of shapes sorted by "
                + "ascending volume:\n ");

        for ( Shape list1 : list )
        {
            System.out.println("The " + list1.getClass().getCanonicalName() 
                    + " has a volume of " + list1.getVolume() 
                    + " units^3.\n\n");
        }
        
        /* Sorts the array by descending distance from origin using
        the overridden comparator class
        */

        Arrays.sort(list, comparator);

        System.out.println("The array of shapes sorted by descending distance "
                + "from origin:\n ");

        for ( Shape list1 : list )
        {
            System.out.println("The " + list1.getClass().getCanonicalName() + 
                    " has a distance of " + list1.getCenter() 
                    + " units from origin.\n\n");
        }

    }
    
    
    /**
     * Shortcut method to print out the list with the shapes
     * area and volume 
     * @param list the list of shapes
     */
    
    public static void print(Shape[] list)
    {
        for ( Shape list1 : list )
        {
            System.out.println(list1.toString() + 
                    "\nIt also has a surface area of " + list1.getSurfaceArea()
                    + " units^2 and a volume of " + list1.getVolume() 
                    + " units^3.\n");
        }
    }
}
