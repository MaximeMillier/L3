package tp2;

public class Complexe {
	double imaginaire , reel;

	
	public Complexe( double re,double im){
		this.reel = re;
		this.imaginaire = im;
	}
	
	public String toString() {
		return "(" + reel + ")" + "+" + "(" + imaginaire + ")" +"i" ;
	}
}

