package eric;

import javax.sound.sampled.Line;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Point first = new Point(1,1);
        Point second = new Point(3,3);
        Point on = new Point(2,3);
        Point up = new Point(1,3);
        LineSegment seg = new LineSegment(first,second);
        LineSegment upper = new LineSegment(up, on);
        System.out.println(seg.inBounds(upper));
        System.out.println("is on " + seg.intersect(on));
        System.out.println(seg.getLength());
        System.out.println(seg.intersect(upper));
    }

}
