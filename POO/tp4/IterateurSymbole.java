import java.util.*;

public class IterateurSymbole{
  String codeBarre;
  private int i = 0;
  private int nature = 1;

  IterateurSymbole(String codeBarre){
    this.codeBarre = codeBarre;
  }

  public Symbole suivant(){
    Nature n;
    Epaisseur e;
    if(codeBarre.charAt(i) == '1'){
      e = Epaisseur.LARGE;
    }
    else{
      e = Epaisseur.ETROIT;
    }
    if(nature == 1){
      n = Nature.BARRE;
      nature = 0;
    }
    else{
      n = Nature.ESPACE;
      nature = 1;
    }
    i++;
    return new Symbole(e,n);
  }


  public boolean terminee(){
    if(this.i == this.codeBarre.length()){
      return true;
    }
    return false;
  }

}
