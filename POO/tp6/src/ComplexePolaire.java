public class ComplexePolaire implements Icomplexe {
    private double module;
    private double argument;

    ComplexePolaire(double module, double argument){
        this.module = module;
        this.argument = argument;
    }

    public double reelle() {
        return this.module * this.module * Math.cos(argument);
    }

    public double imaginaire() {
        return this.module * this.module * Math.sin(argument);
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
