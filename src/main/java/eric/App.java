package eric;

import javax.sound.sampled.Line;
import java.nio.channels.Pipe;
import java.util.ArrayList;
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
        Point first = new Point(1,4);
        Point second = new Point(7,3);
        Point on = new Point(2,3);
        Point up = new Point(1,3);
        List<Point> points = Arrays.asList(first,second,on);
        PolyLine mline = new PolyLine(points);
        System.out.println(mline.getLength());
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
