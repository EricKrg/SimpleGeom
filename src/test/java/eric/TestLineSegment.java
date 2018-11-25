package eric;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestLineSegment {
    Point a = new Point(1,1);
    Point b = new Point(2,1);
    LineSegment testL = new LineSegment(a,b);
    @Test
    public void TestgetLen(){
        assertEquals(1.0, testL.getLength());
    }
}
