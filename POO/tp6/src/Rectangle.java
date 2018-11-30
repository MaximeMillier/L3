import java.awt.*;

import static java.lang.Math.*;

class Rectangle extends AFormeGeometrique {
  private double largeur;
  private double longueur;


  Rectangle(Point ancrage, Color outline, Color solid, double largeur, double longueur) {
    super(ancrage, outline, solid);
    this.largeur = largeur;
    this.longueur = longueur;
  }

  public double perimetre(){
    return (this.largeur + this.longueur) * 2;
  }

  public double aire(){
    return (this.largeur * this.longueur);
  }

  public String toString(){
    return "Rectangle : Largeur = " + this.largeur + "cm " + "longueur = " + this.longueur + "cm " + "Perimetre = " + perimetre() + "cm " + "Aire = " + aire() + "cm2";
  }

  public void Draw(Graphics g, Align a) {

    switch (a) {
      case CENTRE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX() - (int) this.largeur / 2, (int) ancrage.getY() - (int) this.longueur / 2, (int) this.largeur, (int) this.longueur);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX() - (int) this.largeur / 2, (int) ancrage.getY() - (int) this.longueur / 2, (int) this.largeur, (int) this.longueur);
        break;
      case BASDROITE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX() - (int) this.largeur, (int) ancrage.getY() - (int) this.longueur, (int) this.largeur, (int) this.longueur);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX() - (int) this.largeur, (int) ancrage.getY() - (int) this.longueur, (int) this.largeur, (int) this.longueur);
        break;
      case BASGAUCHE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX(), (int) ancrage.getY() - (int) this.longueur, (int) this.largeur, (int) this.longueur);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX(), (int) ancrage.getY() - (int) this.longueur, (int) this.largeur, (int) this.longueur);
        break;
      case HAUTDROITE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX() - (int) this.largeur, (int) ancrage.getY(), (int) this.largeur, (int) this.longueur);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX() - (int) this.largeur, (int) ancrage.getY(), (int) this.largeur, (int) this.longueur);
        break;
      default:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX(), (int) ancrage.getY(), (int) this.largeur, (int) this.longueur);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX(), (int) ancrage.getY(), (int) this.largeur, (int) this.longueur);
    }
  }


}
