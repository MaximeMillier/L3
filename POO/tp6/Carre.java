import static java.lang.Math.*;

class Carre extends AFormeGeometrique {
  private double cote;

  Carre(Point ancrage, double cote) {
    super(ancrage);
    this.cote = cote;
  }

  public double perimetre(){
    return cote * 4;
  }

  public double aire(){
    return pow(cote,2);
  }

  public String toString(){
    return "Carré : coté = " + this.cote + "Perimetre = " + perimetre() + "Aire = " + aire();
  }



}
