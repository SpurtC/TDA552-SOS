

import java.awt.*;

public abstract class Polygon {
    public String name;
    public Point centerPoint;

    public Polygon(String name, Point centerPoint) {
        this.name = name;
        this.centerPoint = centerPoint;
    }
    public Polygon(){

    }

    public abstract void paint (Graphics g);

    private void paintSquare(Graphics g){
        g.drawRect(this.centerPoint.x - 10, this.centerPoint.y - 10, 20, 20);
    }

    private void paintTriangle(Graphics g){
        g.drawLine(this.centerPoint.x, this.centerPoint.y - 10, this.centerPoint.x - 10, this.centerPoint.y + 10);
        g.drawLine(this.centerPoint.x - 10, this.centerPoint.y + 10,
                this.centerPoint.x + 10, this.centerPoint.y + 10);
        g.drawLine(this.centerPoint.x + 10, this.centerPoint.y + 10, this.centerPoint.x, this.centerPoint.y - 10);
    }

    private void paintRectangle(Graphics g){
        g.drawRect(this.centerPoint.x - 20, this.centerPoint.y - 10, 40, 20);
    }

}






















