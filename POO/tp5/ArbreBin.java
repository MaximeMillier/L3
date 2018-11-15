
public class ArbreBin {
  private int racine;
  private ArbreBin fg;
  private ArbreBin fd;

  public ArbreBin(int racine){
    this.racine = racine;
  }

  public int getRacine() {
    return this.racine;
  }

  public ArbreBin getFg() {
    return this.fg;
  }

  public ArbreBin getFd() {
    return this.fd;
  }


  public String toString() {
    return toString("\t");
  }

  public String toString(String s) {
      if (fg != null) {
        if (fd != null)
          return(s+racine+"\n"+fg.toString(s+"\t")+fd.toString(s+"\t"));
        else
          return(s+racine+"\n"+fg.toString(s+"\t")+"\n");
        }
      else
        if (fd != null)
          return(s+racine+"\n\n"+fd.toString(s+"\t"));
        else
          return(s+racine+"\n");
        }



  public void addNoeud(int valeur){
    if(valeur == getRacine()){
      return;
    }
    if(valeur < getRacine()){
      if (getFg() != null){
        getFg().addNoeud(valeur);
      }
      else {
        fg = new ArbreBin(valeur);
      }
    }
    else{
      if (getFd() != null){
        getFd().addNoeud(valeur);
      }
      else {
        fd = new ArbreBin(valeur);
      }
    }
  }

  public boolean searchNoeud(int valeur){
    if(valeur == getRacine()){
      return true;
    }
    if(valeur < getRacine()){
      if (getFg() != null) {
        getFg().searchNoeud(valeur);
      }
      return false;
    }
    else{
      if (getFd() != null) {
        getFd().searchNoeud(valeur);
      }
      return false;
    }
  }


  public void ParcoursPrefixe() {
	   System.out.println(getRacine());
	    if (getFg() != null)
        getFg().ParcoursPrefixe();
	    if (getFd() != null)
	      getFd().ParcoursPrefixe();
      }


  public void ParcoursInfixe() {
	   if (getFg() != null)
	     getFg().ParcoursInfixe();
	   System.out.println(getRacine());
	   if (getFd() != null)
	     getFd().ParcoursInfixe();
    }



    public void ParcoursPostfixe() {
  	   if (getFg() != null)
  	    getFg().ParcoursPostfixe();
  	   if (getFd() != null)
  	    getFd().ParcoursPostfixe();
  	System.out.println(getRacine());
      }


}
