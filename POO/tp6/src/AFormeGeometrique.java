import java.awt.*;

abstract class AFormeGeometrique {
    Point ancrage;
    Color outline;
    Color solid;

    AFormeGeometrique(Point ancrage){
      this.ancrage = ancrage;
    }

    AFormeGeometrique(Point ancrage, Color outline, Color solid){
        this.ancrage = ancrage;
        this.outline = outline;
        this.solid = solid;
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
