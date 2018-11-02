
import java.awt.*;

public enum Nature {
	BARRE(Color.BLACK),
	ESPACE(Color.WHITE);

	private Color c ;

	Nature(Color c){
		this.c = c;
	}

	public void couleur(Graphics g){
		g.setColor(this.c);
	}

}
