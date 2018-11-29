import static java.lang.Math.*;

class Rectangle extends AFormeGeometrique {
  private double largeur;
  private double longueur;


  Rectangle(Point ancrage, double largeur, double longueur) {
    super(ancrage);
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


}
