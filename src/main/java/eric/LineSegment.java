package eric;

import java.lang.reflect.Array;

public class LineSegment {
    Point a,b;
    double slope, bx;
    public LineSegment(Point inA, Point inB){
        this.a = inA;
        this.b = inB;
        this.slope =  (this.b.getY()-this.a.getY()) / (this.b.getX() - this.a.getX());
        this.bx = this.b.getY()-this.slope*this.b.getX();
    }
    public double getLength(){
        double distance = Math.sqrt(Math.pow(this.a.getX()-this.b.getX(),2)+Math.pow(this.a.getY()-this.b.getY(),2));
        return distance;
    }
    public boolean xBound(Point p) {
        if(this.a.getX() < p.getX() && this.b.getX() > p.getX()){ return true; }
        else { return false; }
    }
    public boolean yBound(Point p){
        if(this.a.getY()< p.getY() && this.b.getY() > p.getY()){ return true; }
        else { return false; }
    }
    public boolean inBounds(Point p){
        boolean xb,yb;
        xb = this.xBound(p);
        yb = this.yBound(p);
        return  xb && yb;
    }
    public boolean inBounds(LineSegment l){
        Point al = l.a;
        Point bl = l.b;
        return this.xBound(al) | this.xBound(bl) | this.yBound(al) | this.yBound(bl);
    }

    public boolean intersect(Point a){
        if(this.inBounds(a)){
            return a.getY() == this.slope*a.getX()+this.bx;
        } else { return false; }
    }
    public boolean intersect(LineSegment l){
        double xi = (l.bx - this.bx) / (this.slope - l.slope);
        double yi = this.slope*xi + this.bx;
        Point isect = new Point(xi,yi); // intersection point
        if (this.inBounds(isect)) {
            return true;
        } else { return false; }
    }
}
