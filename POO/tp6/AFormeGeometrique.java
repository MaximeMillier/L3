


abstract class AFormeGeometrique {
    Point ancrage;

    AFormeGeometrique(Point ancrage){
      this.ancrage = ancrage;
    }

    public Point getAncrage(){
      return ancrage;
    }

    public void setAncrage(Point ancrage){
      this.ancrage = ancrage;
    }

    abstract double aire();

    abstract double perimetre();

}
