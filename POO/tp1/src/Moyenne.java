package tp1;

public class Moyenne {  
	  int notes = 0 ;  
	  int nombreDeNotes = 0 ;
	  int noteMax = 0;
	  
	  void ajouteNote (int note, int coef) {  
	    notes += (note * coef);  
	    nombreDeNotes += coef;  
	  }  
	  
	  double calculMoyenne(int nbPres) {  
	    return (((double)notes) / nombreDeNotes) * (0.1 * nbPres) ;  
	  } 
	  
	  public static void main(String[] args) {
			Moyenne m = new Moyenne();
			
			m.ajouteNote(12,2);
			m.ajouteNote(5,3);
			m.ajouteNote(10,2);
			
			System.out.println(m.calculMoyenne(12));
		}
	}  
