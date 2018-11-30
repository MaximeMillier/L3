import java.awt.*;

import static java.lang.Math.*;

class Ellipse extends AFormeGeometrique {
  private double petitRayon;
  private double grandRayon;

  Ellipse(Point ancrage, Color outline, Color solid, double petitRayon, double grandRayon) {
    super(ancrage, outline, solid);
    this.petitRayon = petitRayon;
    this.grandRayon = grandRayon;
  }

  public double perimetre(){
    return PI * sqrt(2 * (pow(this.grandRayon,2) * pow(this.petitRayon,2)));
  }

  public double aire(){
    return PI * this.grandRayon * this.petitRayon;
  }

  public String toString(){
    return "Ellipse : grand Rayon = " + this.grandRayon + "cm " + "petit Rayon = " + this.petitRayon + "cm " + "Perimetre = " + perimetre() + "cm " + "Aire = " + aire() + "cm2";
  }

  public void Draw(Graphics g, Align a) {

    switch (a) {
      case CENTRE:
        g.setColor(outline);
        g.drawOval((int) ancrage.getX() - (int) this.grandRayon, (int) ancrage.getY() - (int) this.petitRayon, (int)this.grandRayon * 2, (int)this.petitRayon * 2);
        g.setColor(solid);
        g.fillOval((int) ancrage.getX() - (int) this.grandRayon, (int) ancrage.getY() - (int) this.petitRayon, (int)this.grandRayon * 2, (int)this.petitRayon * 2);
        break;
      case BASDROITE:
        g.setColor(outline);
        g.drawOval((int) ancrage.getX() - (int) this.grandRayon * 2, (int) ancrage.getY() - (int) this.petitRayon * 2, (int) this.grandRayon * 2, (int) this.petitRayon * 2);
        g.setColor(solid);
        g.fillOval((int) ancrage.getX() - (int) this.grandRayon * 2, (int) ancrage.getY() - (int) this.petitRayon * 2, (int) this.grandRayon * 2, (int) this.petitRayon * 2);
        break;
      case BASGAUCHE:
        g.setColor(outline);
        g.drawOval((int) ancrage.getX(), (int) ancrage.getY() - (int) this.petitRayon * 2, (int) this.grandRayon * 2, (int) this.petitRayon * 2);
        g.setColor(solid);
        g.fillOval((int) ancrage.getX(), (int) ancrage.getY() - (int) this.petitRayon * 2, (int) this.grandRayon * 2, (int) this.petitRayon * 2);
        break;
      case HAUTDROITE:
        g.setColor(outline);
        g.drawOval((int) ancrage.getX() - (int) this.grandRayon * 2, (int) ancrage.getY(), (int) this.grandRayon * 2, (int) this.petitRayon * 2);
        g.setColor(solid);
        g.fillOval((int) ancrage.getX() - (int) this.grandRayon * 2, (int) ancrage.getY(), (int) this.grandRayon * 2, (int) this.petitRayon * 2);
        break;
      default:
        g.setColor(outline);
        g.drawOval((int) ancrage.getX(), (int) ancrage.getY(), (int) this.grandRayon * 2, (int) this.petitRayon * 2);
        g.setColor(solid);
        g.fillOval((int) ancrage.getX(), (int) ancrage.getY(), (int) this.grandRayon * 2, (int) this.petitRayon * 2);
    }
  }
}
