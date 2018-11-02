package tp2;

public class TestPoly {

	public static void main(String[] args) {
		Polynome p = new Polynome(1,1,1);
		
		System.out.println("evaluation du polynome = " + p.evalPoly(2));
		
		System.out.println("delta = " + p.discriminant());
		
		System.out.println("x1 = " + p.racineReel1() + "\nx2 = " + p.racineReel2());
		
		System.out.println("r1 = " + p.racine1() + "\nr2 = " + p.racine2());
	}
}
