import java.applet.Applet;
import java.awt.*;


public class AppletForme extends Applet{
    Point p1 = new Point(200,200);
    Point p2 = new Point(200,150);
    Point p3 = new Point(400,0);
    Point p4 = new Point(0,300);

    Carre c = new Carre(p1, Color.BLUE, Color.BLUE, 60);
    Cercle ce = new Cercle(p2, Color.RED, Color.RED, 40);
    Ellipse e = new Ellipse(p3, Color.YELLOW, Color.YELLOW, 20,50);
    Rectangle r = new Rectangle(p4, Color.GREEN, Color.GREEN,80,40);

    public void paint(Graphics g){
        c.Draw(g, Align.CENTRE);
        ce.Draw(g, Align.CENTRE);
        e.Draw(g, Align.CENTRE);
        r.Draw(g, Align.BASGAUCHE);
    }


}