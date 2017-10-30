package LV1.DrawPolygons.post;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private final ArrayList<String> polygonNames;
    private final ArrayList<Point>  centerPoints;

    private DrawPolygons(){
        polygonNames = new ArrayList<>(10);
        centerPoints = new ArrayList<>(10);

        polygonNames.add("square");
        polygonNames.add("triangle");
        polygonNames.add("rectangle");

        centerPoints.add(new Point(100,100));
        centerPoints.add(new Point(150,150));
        centerPoints.add(new Point(100,200));
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygonNames.size(); i++) {
            String currentPolygon = polygonNames.get(i);
            Point currentCenter = centerPoints.get(i);
            switch (currentPolygon) {
                case "square":
                    g.drawRect(currentCenter.x - 10, currentCenter.y - 10, 20, 20);
                    break;
                case "triangle":
                    g.drawLine(currentCenter.x, currentCenter.y - 10, currentCenter.x - 10, currentCenter.y + 10);
                    g.drawLine(currentCenter.x - 10, currentCenter.y + 10,
                            currentCenter.x + 10, currentCenter.y + 10);
                    g.drawLine(currentCenter.x + 10, currentCenter.y + 10, currentCenter.x, currentCenter.y - 10);
                    break;
                case "rectangle":
                    g.drawRect(currentCenter.x - 20, currentCenter.y - 10, 40, 20);
                    break;
            }
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons