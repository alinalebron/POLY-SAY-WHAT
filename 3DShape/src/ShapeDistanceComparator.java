import java.util.Comparator;

/**
 * Created by alina on 3/28/15.
 */
public class ShapeDistanceComparator implements Comparator<Shape> {

    public int compare(Shape s1, Shape s2) {

        double center1 = s1.getCenter();
        double center2 = s2.getCenter();

        if (center1 < center2) {
            return -1;
        } else if (center1 == center2) {
            return 0;
        } else {
            return 1;
        }
    }
}