import static java.lang.Math.*;

class Ellipse extends AFormeGeometrique {
  private double petitRayon;
  private double grandRayon;

  Ellipse(Point ancrage, double petitRayon, double grandRayon) {
    super(ancrage);
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
    return "Ellipse : grand Rayon = " + this.grandRayon + "petit Rayon = " + this.petitRayon + "Perimetre = " + perimetre() + "Aire = " + aire();
  }


}
