import java.applet.Applet;
import java.awt.*;


public class AppletForme extends Applet{
    Point p1 = new Point(100,100);
    Point p2 = new Point(100,250);
    Point p3 = new Point(250,100);
    Point p4 = new Point(250,250);

    Carre c1 = new Carre(p1, Color.BLUE, Color.BLUE, 60);
    Carre c2 = new Carre(p1, Color.CYAN, Color.CYAN, 60);
    Cercle ce1 = new Cercle(p2, Color.RED, Color.RED, 40);
    Cercle ce2 = new Cercle(p2, Color.ORANGE, Color.ORANGE, 40);
    Ellipse e1 = new Ellipse(p3, Color.YELLOW, Color.YELLOW, 20,50);
    Ellipse e2 = new Ellipse(p3, Color.MAGENTA, Color.MAGENTA, 20,50);
    Rectangle r1 = new Rectangle(p4, Color.GREEN, Color.GREEN,80,40);
    Rectangle r2 = new Rectangle(p4, Color.DARK_GRAY, Color.DARK_GRAY,80,40);

    public void paint(Graphics g){
        c1.Draw(g, Align.CENTRE);
        ce1.Draw(g, Align.CENTRE);
        e1.Draw(g, Align.CENTRE);
        r1.Draw(g, Align.CENTRE);

        c2.Draw(g, Align.BASDROITE);
        ce2.Draw(g, Align.BASDROITE);
        e2.Draw(g, Align.BASDROITE);
        r2.Draw(g, Align.BASDROITE);
    }


}
