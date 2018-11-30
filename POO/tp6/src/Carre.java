import java.awt.*;

import static java.lang.Math.*;

class Carre extends AFormeGeometrique {
  private double cote;

  Carre(Point ancrage, Color outline, Color solid, double cote) {
    super(ancrage, outline, solid);
    this.cote = cote;
  }

  public double perimetre(){
    return cote * 4;
  }

  public double aire(){
    return pow(cote,2);
  }

  public String toString(){
    return "Carré : coté = " + this.cote + "cm" + " Perimetre = " + perimetre() + "cm" + " Aire = " + aire() + "cm2";
  }

  public void Draw(Graphics g, Align a) {

    switch (a) {
      case CENTRE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX() - (int) this.cote / 2, (int) ancrage.getY() - (int) this.cote / 2, (int) this.cote, (int) this.cote);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX() - (int) this.cote / 2, (int) ancrage.getY() - (int) this.cote / 2, (int) this.cote, (int) this.cote);
        break;
      case BASDROITE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX() - (int) this.cote, (int) ancrage.getY() - (int) this.cote, (int) this.cote, (int) this.cote);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX() - (int) this.cote, (int) ancrage.getY() - (int) this.cote, (int) this.cote, (int) this.cote);
        break;
      case BASGAUCHE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX(), (int) ancrage.getY() - (int) this.cote, (int) this.cote, (int) this.cote);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX(), (int) ancrage.getY() - (int) this.cote, (int) this.cote, (int) this.cote);
        break;
      case HAUTDROITE:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX() - (int) this.cote, (int) ancrage.getY(), (int) this.cote, (int) this.cote);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX() - (int) this.cote, (int) ancrage.getY(), (int) this.cote, (int) this.cote);
        break;
      default:
        g.setColor(outline);
        g.drawRect((int) ancrage.getX(), (int) ancrage.getY(), (int) this.cote, (int) this.cote);
        g.setColor(solid);
        g.fillRect((int) ancrage.getX(), (int) ancrage.getY(), (int) this.cote, (int) this.cote);
    }
  }
}
