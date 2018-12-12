public class TestComplexe {
  public static void main(String[] args) {
    Icomplexe c1 = new ComplexeCartesien(0, 1);
    Icomplexe c2 = new ComplexePolaire(1,270);
    Icomplexe c3 = new ComplexePolaire(1,270);

    //System.out.println("Complexe Cartesien : " + c1);
    //System.out.println("Complexe Polaire : " + c2);

    //System.out.println(ComplexeUtil.createCartesien(1, -1));
    //System.out.println(ComplexeUtil.createPolaire(3, 69));

    //System.out.println(ComplexeUtil.convertPolaire(c1));
    //System.out.println(ComplexeUtil.convertCartesien(c2));

    //System.out.println(ComplexeUtil.egaliteArithmetique(c1,c2));

    System.out.println(ComplexeUtil.addition(c1,c2));

    System.out.println(ComplexeUtil.soustraction(c1,c2));

    System.out.println(ComplexeUtil.multiplication(c1,c2));

    System.out.println(ComplexeUtil.division(c1,c2));

    }
}
