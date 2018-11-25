package eric;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Point first = new Point(1,1);
        Point second = new Point(2,2);
        Point on = new Point(3,3);
        Point a = new Point(1,3);
        Point b = new Point(2,0);
        Point c = new Point(4   ,3);
        List<Point> points = Arrays.asList(first,second,on);
        List<Point> pointsB = Arrays.asList(a,b,c);
        PolyLine mline = new PolyLine(points);
        PolyLine bline = new PolyLine(pointsB);
        System.out.println(mline.intersect(bline)); // line intersect
        System.out.println(mline.intersect(on));
        try {
            mline.insertPoint(c, -1);
            System.out.println(mline);
        } catch (IllegalArgumentException e){
            System.out.println(mline);
        }
        /*
        LineSegment seg = new LineSegment(first,second);
        LineSegment upper = new LineSegment(up, on);
        System.out.println(seg.inBounds(upper));
        System.out.println("is on " + seg.intersect(on));
        System.out.println(seg.getLength());
        System.out.println(seg.intersect(upper));
        */
    }

}
