package eric;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestPoint {
    @Test
    public void testPoint(){
        Point testP = new Point(1,1);
        assertEquals(1, testP.getX());
        assertEquals(1, testP.getY());
    }

}
