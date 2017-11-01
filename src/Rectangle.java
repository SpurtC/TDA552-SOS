

import java.awt.*;


public class Rectangle extends Polygon{
    Rectangle(Point centerPoint){
        this.centerPoint= centerPoint;
    }
@Override
    public void paint(Graphics g){
        g.drawRect(this.centerPoint.x - 20, this.centerPoint.y - 10, 40, 20);
    }
}
