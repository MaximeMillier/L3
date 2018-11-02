package tp3;

public class TestVecteur {
	
	public static void main(String[] args) {
		
		Vecteur2D v = new Vecteur2D(2,1);
		
		System.out.println("v = " + v);
		
		/*v.mulScalaire(1.5);
		System.out.println("produit scalaire = " + v);*/
		
		/*v.prodScalaire(new Vecteur2D(1.5,1.5));
		System.out.println("produit scalaire = " + v);*/
		
		/*v.transposer();
		System.out.println("vecteur transposé " + v);*/
		
		v.addVect(new Vecteur2D(1.5,1.5));
		System.out.println("addition de vecteurs = " + v);
	}
}
