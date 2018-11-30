package tp3;

public class Vecteur {
	private int n;
	private int[] valeurs;
	
	public Vecteur(int n, int[] valeurs) {
		this.n = n;
		this.valeurs = valeurs;
	}
	
	public String toString() {
		String res = "<";
		int i = 0;
		if(valeurs.length > n) {
			return ("erreur !");
		}
		while(i < valeurs.length) {
			res += valeurs[i] + ",";
			i++;				
		}
		while(i < n) {
			res += 0 + ",";
			i++;				
		}
		res += ">";
		return res;
	}
	

}
