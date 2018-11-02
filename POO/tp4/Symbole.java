import java.util.*;
import java.awt.*;

public class Symbole{
  private Epaisseur e;
  private Nature n;

  Symbole(Epaisseur e, Nature n){
    this.e = e;
    this.n = n;
  }

  public int epaisseur(){
    return e.largeur();
  }

  public void dessineSymbole(Graphics g, int x, int y){
    n.couleur(g);
    e.affiche(g,x,y);
  }
}
