import java.util.*;

class TestForme {
  public static void main(String[] args){

    Point p = new Point(4,4);

    Carre c = new Carre(p,6.0);
    System.out.println(c);

    Cercle ce = new Cercle(p,8);
    System.out.println(ce);

    Ellipse e = new Ellipse(p,10,5);
    System.out.println(e);

    Rectangle r = new Rectangle(p,8,4);
    System.out.println(r);





  }
}
