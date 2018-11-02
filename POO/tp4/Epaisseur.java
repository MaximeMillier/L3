import java.awt.Graphics;

public enum Epaisseur {
	LARGE(6),
	ETROIT(2);

	private int largeur;
	private final int hauteur = 75;

	Epaisseur (int largeur){
		this.largeur = largeur;
	}

	public int largeur(){
		return this.largeur;
	}

	void affiche(Graphics g, int x , int y) {
		g.fillRect(x,y,largeur,hauteur);
	}


}
