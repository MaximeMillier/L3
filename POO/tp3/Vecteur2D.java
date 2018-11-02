package tp3;

public class Vecteur2D {
	double x,y;
	
	public Vecteur2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "<" + x + "," + y + ">" ;
	}

	
	public void mulScalaire(double k) {
		this.x = this.x * k;
		this.y *= k;
	}
	
	public void prodScalaire(Vecteur2D v) {
		this.x *= v.x;
		this.y *= v.y;
	}
	
	public void transposer() {
		double tmp;
		tmp = this.x;
		this.x = this.y;
		this.y = tmp;
		
	}
	
	public void addVect(Vecteur2D v) {
		this.x += v.x;
		this.y += v.y;
	}
	
}
