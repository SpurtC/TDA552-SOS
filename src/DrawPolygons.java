
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygonList = new ArrayList<>();


    private DrawPolygons(){
        Polygon test = new Square(new Point(100,200));
        Polygon test2 = new Rectangle(new Point(100, 150));
        Polygon test3 = new Triangle(new Point(100, 50));
        polygonList.add(test);
        polygonList.add(test2);
        polygonList.add(test3);
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygonList.size(); i++) {
            polygonList.get(i).paint(g);
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