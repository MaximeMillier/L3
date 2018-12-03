import java.util.*;

public class TestArbre {

	public static void main(String[] args) {

		ArbreBin a = new ArbreBin(40);
		for (int i = 0; i < 25 ; i++ ) {
			a.addNoeud(new Random().nextInt(100+1));
		}
		//System.out.println(a);
		//System.out.println("valeur rechercher 5, trouvé : " + a.searchNoeud(5));
		//a.ParcoursPrefixe();
		//a.ParcoursInfixe();
		a.ParcoursPostfixe();
		System.out.println(a);
	}

}
