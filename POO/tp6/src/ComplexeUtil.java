import static java.lang.Math.*;

public class ComplexeUtil {

  public static ComplexeCartesien createCartesien(double reelle, double imaginaire){
    return new ComplexeCartesien(reelle, imaginaire);
  }

  public static ComplexePolaire createPolaire(double module, double argument){
    return new ComplexePolaire(module, argument);
  }

  public static ComplexePolaire convertPolaire(Icomplexe c){
    return new ComplexePolaire(sqrt(pow(c.reelle(), 2) + pow(c.imaginaire(), 2)), atan(c.imaginaire() / c.reelle()));
  }
  public static ComplexeCartesien convertCartesien(Icomplexe c){
    return new ComplexeCartesien(c.reelle(), c.imaginaire());
  }
  public static boolean egaliteArithmetique(Icomplexe c1, Icomplexe c2){
    return (c1.reelle() == c2.reelle() && c1.imaginaire() == c2.imaginaire());
  }

  static public Icomplexe addition(Icomplexe c1, Icomplexe c2){
        ComplexeCartesien c = new ComplexeCartesien(c1.reelle()+c2.reelle(),c1.imaginaire()+c2.imaginaire());
        if(c1 instanceof ComplexePolaire && c2 instanceof ComplexePolaire){
            return convertPolaire(c);
        }
        else{
            return c;
        }
    }

    static public Icomplexe soustraction(Icomplexe c1, Icomplexe c2) {
        ComplexeCartesien c = new ComplexeCartesien(c1.reelle() - c2.reelle(), c1.imaginaire() - c2.imaginaire());
        if (c1 instanceof ComplexePolaire && c2 instanceof ComplexePolaire) {
            return convertPolaire(c);
        } else {
            return c;
        }

    }

    static public Icomplexe multiplication(Icomplexe c1, Icomplexe c2) {
        double reelle = (c1.reelle()*c2.reelle()) - (c1.imaginaire()*c2.imaginaire());
        double imaginaire = (c1.reelle() * c2.imaginaire()) + (c2.reelle() * c1.imaginaire());
        ComplexeCartesien c = new ComplexeCartesien(reelle, imaginaire);
        if (c1 instanceof ComplexePolaire && c2 instanceof ComplexePolaire) {
            return convertPolaire(c);
        } else {
            return c;
        }
    }

    static public Icomplexe division(Icomplexe c1, Icomplexe c2) {
        double reelle = ((c1.reelle()*c2.reelle()) + (c1.imaginaire()*c2.imaginaire()))/((c2.reelle()*c2.reelle())*(c2.imaginaire()*c2.imaginaire()));
        double imaginaire = ((c2.reelle() * c1.imaginaire())-(c1.reelle() * c2.imaginaire()))/((c2.reelle()*c2.reelle())*(c2.imaginaire()*c2.imaginaire()));
        ComplexeCartesien c = new ComplexeCartesien(reelle, imaginaire);
        if (c1 instanceof ComplexePolaire && c2 instanceof ComplexePolaire) {
            return convertPolaire(c);
        } else {
            return c;
        }
    }
}
