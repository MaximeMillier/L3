import java.lang.Math ;
import java.util.*;


public class Turtle {
  private int x ;
  private int y ;
  private double angleDeg;
  private double angleRad;
  private boolean down;

  public static double angleDegDefault = 90;
  public static double angleRadDefault = Math.Pi / 2;
  public static boolean True = true;

  Turtle(int x, int y, double angleDeg,double angleRad,Bool down){
    this.x = x;
    this.y = y;
    this.angleDeg = angleDeg;
    this.angleRad = Math.toRadians(angleDeg);
    this.down = down;
  }

  Turtle(){
    this.x = 0;
    this.y = 0;
    this.angleDeg = angleDegDefault;
    this.angleRad = angleRadDefault;
    this.down = True;
  }

  void gauche(int angle){
    this.angleRad += Math.toRadians(angle);
  }

  void droite(int angle){
    this.angleRad -= Math.toRadians(angle);
  }

  void avance(int pixel){
    this.x += pixel;
    this.y += pixel;
  }

  void recule(int pixel){
    this.x -= pixel;
    this.y -= pixel;
  }

}
