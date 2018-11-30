package tp2;

public class Carte {
	private Couleur c;
	private Valeur v; 
	
	public Carte(Couleur c, Valeur v) {
		this.c = c;
		this.v = v;
	}
	
	public String toString() {
		return c + " " + v;
	}
}
