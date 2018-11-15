
public class Noeud {
  private int valeur;
  private Noeud fg;
  private Noeud fd;

  public Noeud (int valeur, Noeud fg, Noeud fd){
    this.valeur = valeur;
    this.fg = fg;
    this.fd = fd;
  }

  public Noeud (int valeur, Noeud fg){
    this.valeur = valeur;
    this.fg = fg;
  }


  public Noeud (int valeur){
    this.valeur = valeur;
  }

  public int getValeur(){
    return this.valeur;
  }

  public Noeud getFg(){
    return this.fg;
  }

  public Noeud getFd(){
    return this.fd;
  }

  public Noeud setFg(Noeud n){
    return this.fg = n;
  }

  public Noeud setFd(Noeud n){
    return this.fd = n;
  }

  public String toString() {
    if(this.fd == null){
      return "    " + this.getValeur() + "\n" + this.fg.getValeur();
    }
    if(this.fg == null){
      return "    " + this.getValeur() + "\n" + " " + "\t" + this.fd.getValeur();
    }
    return "    " + this.getValeur() + "\n" + this.fg.getValeur() + "\t" + this.fd.getValeur();
  }



}
