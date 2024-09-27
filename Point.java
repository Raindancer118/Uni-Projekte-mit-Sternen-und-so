
/**
 * Beschreiben Sie hier die Klasse point.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point {
    private final int x;
    private final int y;
    public Point(int xPos, int yPos){
        x=xPos;
        y=yPos;
    }
    public int relativeXPositionTo(Point p) {
        if (this.getX(this) == p.getX(p)){
            return 0;
        }
        else if (this.getX(this) < p.getX(p)){
            return -1;
        }
        else{
            return +1;
        }
    }
    public int getX(Point p){
     return x;
    }
}
    