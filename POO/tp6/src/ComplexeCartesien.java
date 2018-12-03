public class ComplexeCartesien implements Icomplexe {
    private double re;
    private double im;

    ComplexeCartesien(double im, double re){
        this.im = im;
        this.re = re;
    }

    public double reelle(){
        return this.re;
    }

    public double imaginaire(){
        return this.im;
    }

    public String toString() {
        if (imaginaire() < 0){
            return reelle() + " " + imaginaire() + "i";
        }
        else {
            return reelle() + " " + "+ " + imaginaire() + "i";
        }
    }
}
