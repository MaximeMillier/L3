import java.awt.*;

import static java.lang.Math.*;

class Cercle extends AFormeGeometrique {
  private double rayon;

  Cercle(Point ancrage, Color outline, Color solid, double rayon) {
    super(ancrage, outline, solid);
    this.rayon = rayon;
  }

  public double perimetre(){
    return 2 * PI * this.rayon;
  }

  public double aire(){
    return PI * pow(this.rayon,2);
  }

  public String toString(){
    return "Cercle : rayon = " + this.rayon + "cm" + " Perimetre = " + perimetre() + "cm " + "Aire = " + aire() + "cm2 ";
  }

  public void Draw(Graphics g, Align a){

    switch(a){
      case CENTRE:
        g.setColor(outline);
        g.drawOval((int)ancrage.getX() - (int)this.rayon, (int)ancrage.getY() - (int)this.rayon, (int)this.rayon * 2, (int)this.rayon * 2);
        g.setColor(solid);
        g.fillOval((int)ancrage.getX() - (int)this.rayon, (int)ancrage.getY() - (int)this.rayon, (int)this.rayon * 2, (int)this.rayon * 2);
        break;
      case BASDROITE:
        g.setColor(outline);
        g.drawOval((int)ancrage.getX() - (int)this.rayon * 2, (int)ancrage.getY() - (int)this.rayon * 2, (int)this.rayon * 2, (int)this.rayon * 2);
        g.setColor(solid);
        g.fillOval((int)ancrage.getX() - (int)this.rayon * 2, (int)ancrage.getY() - (int)this.rayon * 2, (int)this.rayon * 2, (int)this.rayon * 2);
        break;
      case BASGAUCHE:
        g.setColor(outline);
        g.drawOval((int)ancrage.getX(), (int)ancrage.getY() - (int)this.rayon * 2, (int)this.rayon * 2, (int)this.rayon * 2);
        g.setColor(solid);
        g.fillOval((int)ancrage.getX(), (int)ancrage.getY() - (int)this.rayon * 2, (int)this.rayon * 2, (int)this.rayon * 2);
        break;
      case HAUTDROITE:
        g.setColor(outline);
        g.drawOval((int)ancrage.getX() - (int)this.rayon * 2, (int)ancrage.getY(), (int)this.rayon * 2, (int)this.rayon * 2);
        g.setColor(solid);
        g.fillOval((int)ancrage.getX() - (int)this.rayon * 2, (int)ancrage.getY(), (int)this.rayon * 2, (int)this.rayon * 2);
        break;
      default:
        g.setColor(outline);
        g.drawOval((int)ancrage.getX(), (int)ancrage.getY(), (int)this.rayon * 2, (int)this.rayon * 2);
        g.setColor(solid);
        g.fillOval((int)ancrage.getX(), (int)ancrage.getY(), (int)this.rayon * 2, (int)this.rayon * 2);
    }
  }



}
