import java.applet.Applet;
import java.awt.*;


public class AppletC39 extends Applet{
  public void paint(Graphics g){

    Code39 code = new Code39();
    Symbole s;
    String codeBarre = code.getCodestr("JAVA 2012");
    int x = 25;
    IterateurSymbole is = new IterateurSymbole(codeBarre);


    while(!is.terminee()){
      s = is.suivant();
      s.dessineSymbole(g,x,15);
      x += s.epaisseur();
    }
  }
}
