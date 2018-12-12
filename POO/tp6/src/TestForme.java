import java.awt.*;
import java.util.*;

class TestForme {
  public static void main(String[] args){

    Point p = new Point(40,40);
    Carre c = new Carre(p, Color.BLUE, Color.BLUE, 60);
    Cercle ce = new Cercle(p, Color.BLUE, Color.BLUE, 80);
    Ellipse e = new Ellipse(p, Color.BLUE, Color.BLUE, 40,50);
    Rectangle r = new Rectangle(p, Color.BLUE, Color.BLUE,80,40);
  }
}
