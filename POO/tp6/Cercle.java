import static java.lang.Math.*;

class Cercle extends AFormeGeometrique {
  private double rayon;

  Cercle(Point ancrage, double rayon) {
    super(ancrage);
    this.rayon = rayon;
  }

  public double perimetre(){
    return 2 * PI * this.rayon;
  }

  public double aire(){
    return PI * pow(this.rayon,2);
  }

  public String toString(){
    return "Cercle : rayon = " + this.rayon + "Perimetre = " + perimetre() + "Aire = " + aire();
  }


}
