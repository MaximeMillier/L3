package tp2;
import java.lang.Math;

public class Polynome {
	int a;
	int b;
	int c;

	public Polynome(int a, int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public double evalPoly(int x) {            				/* signature = double(in)*/
		return(a*Math.pow(x,2) + (b*x) + c);
	}
 
	
	public int discriminant() {						/* signature = int() */
		return((b*b) - (4*a*c));
	}
	
	public double racineReel1() {
			return((-b - Math.sqrt(discriminant())) / (2*a));
	}

	public double racineReel2() {
		return((-b + Math.sqrt(discriminant())) / (2*a));
	}
	
	public Complexe racine1() {
		return new Complexe(-b/2*a,(-Math.sqrt(Math.abs(discriminant()))/2*a));
	}
	
	public Complexe racine2() {
		return new Complexe(-b/2*a,(Math.sqrt(Math.abs(discriminant()))/(2*a)));
	}
	
}