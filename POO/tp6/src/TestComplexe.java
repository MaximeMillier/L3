public class TestComplexe {

    public static void main(String[] args) {
        Icomplexe c1 = new ComplexeCartesien(1, -1);
        Icomplexe c2 = new ComplexePolaire(1,-1);

        System.out.println("Complexe Cartesien : " + c1);
        System.out.println("Complexe Polaire : " + c2);
    }
}
