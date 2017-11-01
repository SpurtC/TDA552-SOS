

import java.awt.*;


public class Square extends Polygon {
    Square (Point centerPoint){
        this.centerPoint = centerPoint;
    }
@Override
    public void paint(Graphics g){
        g.drawRect(this.centerPoint.x - 10, this.centerPoint.y - 10, 20, 20);
    }
}
