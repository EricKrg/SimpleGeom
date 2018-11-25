package eric;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    List<Point> points;
    List<LineSegment> lines;
    public PolyLine(List<Point> pointList) {
        this.points = pointList;
        this.lines = this.construct();

    }

    public ArrayList<LineSegment> construct(){
        Point start = this.points.get(0);
        ArrayList<LineSegment> tempLines = new ArrayList<>(this.points.size()-1); // init array size
        for(Point p : this.points){
            if(start == p){ continue; }
            else {
                LineSegment temp = new LineSegment(start, p);
                tempLines.add(temp);
                start = p;
            }
        }
        return tempLines;
    }

    public double getLength() {
        double sum = 0;
        for(LineSegment l : this.lines){
            sum = sum + l.getLength();
        }
        return sum;
    }

    public Boolean intersect(PolyLine other){
        for(LineSegment l: this.lines){
            for(LineSegment l2: other.lines){
                if(l.inBounds(l2) && l.intersect(l2)){
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean intersect(Point p){
        for(LineSegment l : this.lines){
            if(l.inBounds(p) && l.intersect(p)){
                return true;
            }
        }
        return false;
    }

    public void insertPoint(Point in, int pos){
        int count = 0;
        if(this.points.size() < pos | pos < 0){
            throw new IllegalArgumentException("Wrong or negative index");
        } else{
            System.out.println(this.points.size() + 1);
            ArrayList<Point> newP = new ArrayList<>(this.points.size() + 1);
            for (int i = 0; i < this.points.size() + 1; i++) {
                if (i == pos) {
                    newP.add(in);
                    count = 1;
                } else {
                    newP.add(this.points.get(i-count));
                }
            }
            this.points = newP;
            this.lines = this.construct();
        }
    }

    //----

    public String toString(){
        Point start = this.points.get(0);
        String s = "";
        for(Point p : this.points){
            if(start == p){ continue; }
            else {
                LineSegment temp = new LineSegment(start, p);
                this.lines.add(temp);
                start = p;
                s = s + temp.toString() + "\n"; // checking start end coords
            }
        }
        return s;
    }
}
