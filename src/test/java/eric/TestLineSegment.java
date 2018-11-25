package eric;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestLineSegment {
    Point a = new Point(1,1);
    Point b = new Point(2,1);
    Point c = new Point(1, 0);
    Point d = new Point(1,3);
    LineSegment testL = new LineSegment(a,b);
    LineSegment testC = new LineSegment(a,c);
    LineSegment testD = new LineSegment(a,d);

    @Test
    public void testgetLen(){
        assertEquals(1.0, testL.getLength());
        assertEquals(1.0, testC.getLength());
        assertEquals(2.0, testD.getLength());
    }
}
