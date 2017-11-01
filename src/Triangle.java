

import java.awt.*;


public class Triangle extends Polygon{
    Triangle (Point centerPoint){
        this.centerPoint = centerPoint;
    }
@Override
    public void paint(Graphics g){
        g.drawLine(this.centerPoint.x, this.centerPoint.y - 10, this.centerPoint.x - 10, this.centerPoint.y + 10);
        g.drawLine(this.centerPoint.x - 10, this.centerPoint.y + 10,
                this.centerPoint.x + 10, this.centerPoint.y + 10);
        g.drawLine(this.centerPoint.x + 10, this.centerPoint.y + 10, this.centerPoint.x, this.centerPoint.y - 10);
    }
}
