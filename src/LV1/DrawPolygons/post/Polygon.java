package LV1.DrawPolygons.post;

import java.awt.*;

public class Polygon {
    private String name;
    private Point centerPoint;

    Polygon(String name, Point centerPoint) {
        this.name = name;
        this.centerPoint = centerPoint;
    }

    public void paint (Graphics g) {
        switch (this.name){
            case "square":
                paintSquare(g);
                break;
            case "triangle":
                paintTriangle(g);
                break;
            case "rectangle":
                paintRectangle(g);
                break;
        }
    }

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






















