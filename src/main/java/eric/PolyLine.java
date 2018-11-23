package eric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PolyLine {
    List<Point> points;
    List<LineSegment> lines;
    public PolyLine(List<Point> pointList) {
        this.points = pointList;
        this.lines = new ArrayList<>(pointList.size()-1); // init array size
        Point start = this.points.get(0);
        for(Point p : pointList){
            if(start == p){ continue; }
            else {
                LineSegment temp = new LineSegment(start, p);
                this.lines.add(temp);
                start = p;
                System.out.println(temp); // checking start end coords
            }
        }
    }
    public double getLength() {
        double sum = 0;
        for(LineSegment l : this.lines){
            sum = sum + l.getLength();
        }
        return sum;
    }
}
